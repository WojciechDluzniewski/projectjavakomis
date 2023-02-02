package com.example.projektjavakomis;

import java.util.ArrayList;
import java.util.Random;

public class CustomerGenerator {

    private static Random random = new Random();

    private static void init() {
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


    public static long getRandomCustomerCash() {
        long cashMin = 15000;
        long cashMax = 60000;

        return cashMin + Math.round((cashMax - cashMin) * random.nextDouble());
    }


    public static boolean randomInterestedInCar() {

        return random.nextBoolean();
    }

    public static String getRandomCustomerLikesDamage() {
        int damageMin = 0;
        int damageMax = 2;

        int dmg = random.nextInt();
        String damage = null;


        switch(dmg){
            case 0:
                damage = "Nieuszkodzony";
            case 1:
                damage = "Uszkodzony";
            case 2:
                damage = "Uszkodzona skrzynia biegów";
        }


        return damage;
    }
}
