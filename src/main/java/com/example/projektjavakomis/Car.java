package com.example.projektjavakomis;

import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.Random;

public class Car {
    private String producer;
    private long value;
    private long mileage;
    private boolean truck;
    private boolean cleanliness;
    private CarComponents carComponents;
    private double amountOfCarCost;
    public boolean isClean = false;



    public Car(String producer, long value, long mileage, boolean truck, CarComponents carComponents, boolean isClean) {
        this.producer = producer;
        this.value = value;
        this.mileage = mileage;
        this.truck = truck;
        this.carComponents = carComponents;
        this.isClean = false;
    }


    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(producer);
        builder.append(value);
        builder.append(mileage);
        builder.append(truck);
        builder.append(cleanliness);
        builder.append(carComponents);

        return builder.toString();
    }




}
