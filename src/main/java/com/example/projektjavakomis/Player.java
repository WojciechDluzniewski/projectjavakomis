package com.example.projektjavakomis;

import com.example.projektjavakomis.transactions.FixTransaction;
import com.example.projektjavakomis.transactions.Transaction;
import com.sun.source.tree.BreakTree;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.w3c.dom.css.Counter;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

@NoArgsConstructor
public class Player {

    private String name;
    private long cash;
    private final ArrayList<Car> playerGarage = new ArrayList<Car>();
    private Random random;
    private List<Transaction> transactions;
    private CounterOfMoves counter;

    public Player(String name, long cash) {
        this.name = name;
        this.cash = cash;
        this.random = new Random();
        this.transactions = new ArrayList<Transaction>();
        this.counter = new CounterOfMoves();
    }


    public void getUserOptions() {

        System.out.println("1. Samochody do kupienia.");
        System.out.println("2. Wyświetl swój garaż.");
        System.out.println("3. Napraw samochód");
        System.out.println("4. Pokaż listę klientów.");
        System.out.println("5. Sprzedaj samochód.");
        System.out.println("6. Kup reklamę.");
        System.out.println("7. Sprawdź stan konta.");
        System.out.println("8. Sprawdź historię transakcji.");
        System.out.println("9. Sprawdź historię napraw samochodu.");
        System.out.println("10. Sprawdź sumę wydatków na naprawy i czyszczenie samochodu");
        Scanner choice = new Scanner(System.in);
        int choiceOfOption = choice.nextInt();
        switch (choiceOfOption) {
            case 1:
                carsToBuy();
                break;
            case 2:
                showPlayerGarage();
                break;
            case 3:
                repairCar();
                break;
            case 4:
                getCustomerList();
                break;
            case 5:
                sellCar();
                break;
            case 6:
                buyAdvertise();
                break;
            case 7:
                checkBalanceOfCash();
                break;
            case 8:
                checkTransactionHistory();
                break;
            case 9:
                checkCarRepairHistory();
                break;
            case 10:
                checkAmountOfCarCostRepairAndClean();
                break;

            default:
                System.out.println("Wybierz poprawny numer od 1 do 10.");
                break;

        }
    }

    private void backToMenu() {

        System.out.print("Czy chcesz wrócić do głównego menu? Jeśli tak wciśnij 0.");
        Scanner choice = new Scanner(System.in);
        Integer choiceOf = choice.nextInt();
        if (choiceOf == 0) {
            getUserOptions();
        } else {
            backToMenu();
        }


    }

    private void carsToBuy() {
        System.out.println("Poniżej lista dostępnych samochodów:");

        ArrayList<Car> listOfCarsToBuy = new ArrayList<Car>();

        for(int i = 0; i < 12; i++){
            listOfCarsToBuy.add(CarGenerator.createNewCar());
        }
        System.out.println(listOfCarsToBuy);

        System.out.println("Czy chcesz przejść do zakupu samochodu? tak/nie");
        Scanner scanner = new Scanner(System.in);
        String choiceOf = scanner.nextLine();
        if (choiceOf.equals("tak")) {
            System.out.println("Który samochód chcesz zakupić?");

            Scanner carChosen = new Scanner(System.in);
            int carChosenNumber = carChosen.nextInt();
            playerGarage.add(listOfCarsToBuy.get(carChosenNumber - 1));
            this.cash -= listOfCarsToBuy.get(carChosenNumber - 1).getCarValue();

            System.out.println(this.cash);
            System.out.println(playerGarage);

        }
        counter.incrementMove();
        backToMenu();

    }

    private void showPlayerGarage() {
        System.out.println("Garaż");
        for(int i = 0; i < playerGarage.size(); i++) {
            System.out.println((i+1) + ". " + playerGarage.get(i));
        }
    }

    private void repairCar() {
        System.out.println("Wybierz samochód do naprawy z garażu");
        showPlayerGarage();
        Scanner scan = new Scanner(System.in);
        int choiceOfCar = scan.nextInt();
        Car car = playerGarage.get(choiceOfCar - 1);

        System.out.println("Wybierz mechanika: ");
        System.out.println("1. Janusz");
        System.out.println("2. Marian");
        System.out.println("3. Adrian");
        int choiceOfMechanic = scan.nextInt();


        System.out.println("Wybierz część którą chcesz naprawić");
        System.out.println(car.getCarComponents());
        int choiceOfComponent  = scan.nextInt();


        Mechanic mechanic = CarRepair.mechanics.get(choiceOfMechanic - 1);

        CarComponent component = car.getCarComponents().getComponents().get(choiceOfComponent - 1);

        double price = mechanic.repairValueMultiplier * component.getBaseRepairValue() * CarRepair.pricesBasedOnProducer.get(car.getProducer());
        cash -= Math.round(price);

        boolean success = random.nextDouble() > mechanic.riskOfNotRepaired;

        if(success) {
            component.fixComponent();
            System.out.println("Pomyślnie naprawiono " + component.getName());
            car.setCarValue(Math.round(car.getCarValue() * component.getValueIncrease()));
        } else {
            System.out.println("Nie naprawiono " + component.getName());
        }

        if(random.nextDouble() <= mechanic.riskOfDamage) {
            CarComponent brokeComponent = car.getCarComponents().getFirstHealthy();
            brokeComponent.breakComponent();
            System.out.println(mechanic.name + " zjebal " + brokeComponent.getName());
            car.setCarValue(Math.round(car.getCarValue() / brokeComponent.getValueIncrease()));
        }

        System.out.println(component);

        car.addFixToHistory(new FixTransaction(mechanic, component, Math.round(price), counter.getMoveNumber(), car, success));

        counter.incrementMove();
        backToMenu();
    }


    private void getCustomerList() {

    }

    private void sellCar() {
        counter.incrementMove();
    }

    private void buyAdvertise() {

    }

    private void checkBalanceOfCash() {
        System.out.println("Twój stan konta to: " + cash);
    }

    private void checkTransactionHistory() {
        System.out.println("Historia Transakcji: ");

        for(int i = 0; i < transactions.size(); i++) {
            System.out.println((i+1) +  ". " + transactions.get(i));
        }
    }

    private void checkCarRepairHistory() {
        System.out.println("Wybierz samochód dla któerego chcesz sprawdzić historię napraw: ");
        showPlayerGarage();
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();

        playerGarage.get(choice - 1).showFixesHistory();
        backToMenu();
    }

    private void checkAmountOfCarCostRepairAndClean() {
        long suma = 0;
        for(int i = 0; i < playerGarage.size(); i++){
            System.out.println((i + 1) + ". " + playerGarage.get(i).getName() + ": " + playerGarage.get(i).getSumOfCosts() + "\n");
            suma +=  playerGarage.get(i).getSumOfCosts();
        }
        System.out.println("Suma: " + suma);
        backToMenu();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCash() {
        return cash;
    }

    public void setCash(long cash) {
        this.cash = cash;
    }

    public List<Car> getGarage() {
        return playerGarage;
    }
}
