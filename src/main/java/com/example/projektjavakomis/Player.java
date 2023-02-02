package com.example.projektjavakomis;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@NoArgsConstructor
public class Player {

    private String name;
    private long cash;
    private final ArrayList<Car> playerGarage = new ArrayList<Car>();

    public Mechanic mechanic1 = new Mechanic("Janusz", 0.08,0.16,0.8,0.3, 0.3, 0.0, 0.0);
    public Mechanic mechanic2 = new Mechanic("Marian", 0.05,0.10,0.5,0.2, 0.2, 0.1, 0.0);
    public Mechanic mechanic3 = new Mechanic("Adrian", 0.03,0.05,0.3,0.1, 0.1, 0.2, 0.02);

    public Player(String name, long cash) {
        this.name = name;
        this.cash = cash;
    }


    public void getUserOptions() {

        System.out.println("1. Samochody do kupienia.");
        System.out.println("2. Kup samochód.");
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
                buyCar();
                break;
            case 3:
                repairCar();
                break;
            case 4:
                getCusomerList();
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
        System.out.println("1.");
        Car carToBoBuy1 = CarGenerator.CreateNewCar();
        System.out.println("2.");
        Car carToBoBuy2 = CarGenerator.CreateNewCar();
        System.out.println("3.");
        Car carToBoBuy3 = CarGenerator.CreateNewCar();

        System.out.println(carToBoBuy1);
        System.out.println(carToBoBuy2);
        System.out.println(carToBoBuy3);

        System.out.println("Czy chcesz przejść do zakupu samochodu? tak/nie");
        Scanner scanner = new Scanner(System.in);
        String choiceOf = scanner.nextLine();
        if (choiceOf.equals("tak")) {
            System.out.println("Który samochód chcesz zakupić?");

            Scanner carChosen = new Scanner(System.in);
            int carChosenNumber = carChosen.nextInt();
            if (carChosenNumber == 1) {
                playerGarage.add(carToBoBuy1);
                this.cash -= carToBoBuy1.getCarValue();
            } else if (carChosenNumber == 2) {
                playerGarage.add(carToBoBuy2);
                this.cash -= carToBoBuy2.getCarValue();
            } else if (carChosenNumber == 3) {
                playerGarage.add(carToBoBuy3);
                this.cash -= carToBoBuy3.getCarValue();
            }
            System.out.println(this.cash);
            System.out.println(playerGarage);

        }
        backToMenu();

    }

    private void buyCar() {


    }

    private void repairCar() {

    }

    private void getCusomerList() {

    }

    private void sellCar() {

    }

    private void buyAdvertise() {

    }

    private void checkBalanceOfCash() {
        System.out.println(cash);
    }

    private void checkTransactionHistory() {

    }

    private void checkCarRepairHistory() {

    }

    private void checkAmountOfCarCostRepairAndClean() {

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
