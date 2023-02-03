package com.example.projektjavakomis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class CarGenerator {



    private static Random random = new Random();


    public static void init(){
        listOfProducers.add("Audi");
        listOfProducers.add("BMW");
        listOfProducers.add("Mercedes");
        listOfProducers.add("Ford");
        listOfProducers.add("Volkswagen");
        listOfProducers.add("Toyota");
        listOfProducers.add("Nissan");

        listOfColours.add("Czarny");
        listOfColours.add("Biały");
        listOfColours.add("Czerwony");
        listOfColours.add("Żółty");
        listOfColours.add("Grafitowy");
        listOfColours.add("Niebieski");

        listOfSegments.add("Segment Premium");
        listOfSegments.add("Segment Standard");
        listOfSegments.add("Segment Budget");
    }
    private static final ArrayList<String> listOfProducers = new ArrayList<String>();
    private final static ArrayList<String> listOfColours = new ArrayList<String>();
    private final static ArrayList<String> listOfSegments = new ArrayList<String>();
    private final static ArrayList<String> listofNames = new ArrayList<String>();

    public static long getRandomValue() {
        long valueMin = 10000;
        long valueMax = 50000;

        return valueMin + Math.round((valueMax - valueMin) * random.nextDouble());
    }

    private static String getRandomName() {
        String s = "";
        for(int i = 0; i < 10; i++) {
            s += getRandomChar();
        }
        return s;
    }

    private static char getRandomChar() {
        return (char)(random.nextInt(25) + 'A');
    }

    private static String getRandomProducer() {
        int index = (int)(Math.random() * listOfProducers.size());
        String producer = listOfProducers.get(index);

        return producer;
    }

    private static long getRandomMileage() {
        long mileageMin = 10000;
        long mileageMax = 300000;

        return mileageMin + Math.round((mileageMax - mileageMin) * random.nextDouble());
    }

    private static boolean getRandomTruck() {

        return random.nextDouble()<0.2;
    }

    public static CarComponents getRandomCarComponents() {
        CarComponents carComponents = new CarComponents();
        carComponents.addComponent(new CarComponent("zawieszenie", 200, random.nextBoolean(), 1.2));
        carComponents.addComponent(new CarComponent("hamulce", 100, random.nextBoolean(), 1.1));
        carComponents.addComponent(new CarComponent("silnik", 1000, random.nextBoolean(), 2));
        carComponents.addComponent(new CarComponent("skrzynia biegow", 500, random.nextBoolean(), 1.5));
        carComponents.addComponent(new CarComponent("karoseria", 500, random.nextBoolean(), 1.5));

        return carComponents;
    }

    public static Car createNewCar()
    {
        return new Car(getRandomName(), getRandomProducer(), getRandomValue(), getRandomMileage(), getRandomTruck(), getRandomCarComponents(), false);
    }

}
