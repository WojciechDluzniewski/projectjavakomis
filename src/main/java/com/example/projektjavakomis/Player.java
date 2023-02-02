package com.example.projektjavakomis;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@NoArgsConstructor
public class Player {

    private String name;
    private Double cash;
    private final Car[] garage = new Car[0];



    public Player(String name, Double cash) {
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
        Car carToBoBuy1 = CarGenerator.CreateNewCar();

        System.out.println(carToBoBuy1);

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

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }

    public Car[] getGarage() {
        return garage;
    }
}
