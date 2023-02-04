package com.example.projektjavakomis;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CustomerGenerator {

    private static Random random = new Random();


    public static void init() {
        listOfProducers.add("Audi");
        listOfProducers.add("BMW");
        listOfProducers.add("Mercedes");
        listOfProducers.add("Ford");
        listOfProducers.add("Volkswagen");
        listOfProducers.add("Toyota");
        listOfProducers.add("Nissan");

        listOfFirstNames.add("Tomasz");
        listOfFirstNames.add("Wojciech");
        listOfFirstNames.add("Kacper");
        listOfFirstNames.add("Krzysztof");
        listOfFirstNames.add("Paweł");
        listOfFirstNames.add("Juri");


        listOfLastNames.add("Kowalski");
        listOfLastNames.add("Nowak");
        listOfLastNames.add("Boruch");
        listOfLastNames.add("Marciniak");
        listOfLastNames.add("Golina");
        listOfLastNames.add("Mierzejewski");

    }

    private static final ArrayList<String> listOfProducers = new ArrayList<String>();
    private static final ArrayList<String> listOfFirstNames = new ArrayList<String>();
    private static final ArrayList<String> listOfLastNames = new ArrayList<String>();

    private static String getRandomFirstName() {
        int index = (int) (Math.random() * listOfFirstNames.size());
        String firstName = listOfFirstNames.get(index);

        return firstName;
    }

    private static String getLastName() {
        int index = (int) (Math.random() * listOfLastNames.size());
        String lastName = listOfLastNames.get(index);

        return lastName;
    }

    public static long getRandomCustomerCash() {
        long cashMin = 15000;
        long cashMax = 60000;

        return cashMin + Math.round((cashMax - cashMin) * random.nextDouble());
    }


    public static boolean randomInterestedInCar() {

        return random.nextBoolean();
    }

    private static List<String> getInterestedProducers() {
        int index = (int) (Math.random() * listOfProducers.size());
        String firstInterestedModel = listOfProducers.get(index);
        int index2 = (int) (Math.random() * listOfProducers.size());
        String secondInterestedModel = listOfProducers.get(index2);

        if (firstInterestedModel.equals(secondInterestedModel)) {
            secondInterestedModel = listOfProducers.get(index2 + 1);
        }
        ArrayList<String> randomInterestedCars = new ArrayList<String>();
        randomInterestedCars.add(firstInterestedModel);
        randomInterestedCars.add(secondInterestedModel);

        return randomInterestedCars;
    }

    private static String clientInsterestedInDamaged() {
        double randomNum = Math.random();
        String x;
        if (randomNum < 0.65) {
            x = "Sprawny";
        } else if (randomNum < 0.85) {
            x = "Uszkodzone zawieszenie";
        } else {
            x = "Uszkodzony";
        }
        return x;
    }

    public static Customer createNewCustomer() {
        return new Customer(getRandomFirstName(), getLastName(), getRandomCustomerCash(), randomInterestedInCar(), getInterestedProducers(), clientInsterestedInDamaged());
    }


}
