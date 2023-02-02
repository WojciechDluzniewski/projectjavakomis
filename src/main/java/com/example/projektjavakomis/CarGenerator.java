package com.example.projektjavakomis;

import java.util.ArrayList;
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

    public static long getRandomValue() {
        long valueMin = 10000;
        long valueMax = 50000;

        return valueMin + Math.round((valueMax - valueMin) * random.nextDouble());
    }

    private static String getRandomProducer() {
        Integer index = (int) (Math.random() * listOfProducers.size());
        String producer = listOfProducers.get(index);

        return producer;
    }

    private static long getRandomMileage() {
        long mileageMin = 10000;
        long mileageMax = 300000;

        return mileageMin + Math.round((mileageMax - mileageMin) * random.nextDouble());
    }

    private static boolean getRandomTruck() {

        return random.nextBoolean();
    }

    public static CarComponents getRandomCarComponents() {
        CarComponents carComponents = new CarComponents();
        carComponents.setSuspension(random.nextBoolean());
        carComponents.setBreaks(random.nextBoolean());
        carComponents.setEngine(random.nextBoolean());
        carComponents.setGearbox(random.nextBoolean());
        carComponents.setBody(random.nextBoolean());

        return carComponents;
    }

    public static Car CreateNewCar()
    {
        return new Car(getRandomProducer(), getRandomValue(), getRandomMileage(), getRandomTruck(), getRandomCarComponents(), false);
    }

}
