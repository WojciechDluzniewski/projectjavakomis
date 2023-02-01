package com.example.projektjavakomis;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Random;

public class Car {
    private long value;
    private long mileage;
    private boolean truck;
    private boolean purity;
    private boolean stateOfCar;
    private CarComponents carComponents;
    private double amountOfCarCost;

    public Car(Long value, Long mileage, boolean truck, boolean purity, boolean stateOfCar, CarComponents carComponents, double amountOfCarCost) {
        this.value = getRandomValue();
        this.mileage = mileage;
        this.truck = truck;
        this.purity = purity;
        this.stateOfCar = stateOfCar;
        this.carComponents = carComponents;
        this.amountOfCarCost = amountOfCarCost;
    }

    private static final ArrayList<String> listOfProducers = new ArrayList<String>();

    {
        {
            listOfProducers.add("Audi");
            listOfProducers.add("BMW");
            listOfProducers.add("Mercedes");
            listOfProducers.add("Ford");
            listOfProducers.add("Fiat");
            listOfProducers.add("Volkswagen");
            listOfProducers.add("Toyota");
            listOfProducers.add("Nissan");
            listOfProducers.add("Porshe");
        }
    }

    private static final ArrayList<String> listOfColours = new ArrayList<String>();

    {
        {
            listOfColours.add("Czarny");
            listOfColours.add("Biały");
            listOfColours.add("Czerwony");
            listOfColours.add("Żółty");
            listOfColours.add("Grafitowy");
            listOfColours.add("Niebieski");
        }
    }

    private static final ArrayList<String> listOfSegments = new ArrayList<String>();

    {
        {
            listOfSegments.add("Segment Premium");
            listOfSegments.add("Segment Standard");
            listOfSegments.add("Segment Budget");
        }
    }


    private long getRandomValue() {
        Random randomValue = new Random();
        long value1;
        long valueMin = 10000;
        long valueMax = 50000;
        value1 = valueMin + (valueMax - valueMin) * randomValue.nextLong();
        value = Math.round(value1);

        return value;
    }

    private String getRandomProducer() {
        Integer index = (int) (Math.random() * listOfProducers.size());
        String producer = listOfProducers.get(index);

        return producer;
    }

    private long getRandomMileage() {
        Random randomMileage = new Random();
        double mileage1;
        double mileageMin = 10000.0;
        double mileageMax = 300000.0;
        mileage1 = mileageMin + (mileageMax - mileageMin) * randomMileage.nextDouble();
        mileage = Math.round(mileage1);

        return mileage;
    }

    private boolean getRandomTruck() {
        Random randomTruck = new Random();

        return randomTruck.nextBoolean();
    }

    private boolean getRandomPurity() {
        Random randomPurity = new Random();

        return randomPurity.nextBoolean();
    }

    private CarComponents getRandomCarComponents() {
        Random randomComponents = new Random();
        carComponents.setSuspension(randomComponents.nextBoolean());
        carComponents.setBreaks(randomComponents.nextBoolean());
        carComponents.setEngine(randomComponents.nextBoolean());
        carComponents.setGearbox(randomComponents.nextBoolean());
        carComponents.setBody(randomComponents.nextBoolean());

        return carComponents;
    }
}
