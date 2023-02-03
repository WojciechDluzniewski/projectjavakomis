package com.example.projektjavakomis;

import com.example.projektjavakomis.transactions.FixTransaction;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
// przydaloby sie ddodac cos co identyfikuje dany samochod
public class Car {
    private String producer;
    private String name;
    private long value;
    private long mileage;
    private boolean truck;
    private boolean cleanliness;
    private CarComponents carComponents;
    private double amountOfCarCost;
    public boolean isClean = false;
    private List<FixTransaction> fixesHisotry;
    private long sumOfCosts;

    public Car(String name, String producer, long value, long mileage, boolean truck, CarComponents carComponents, boolean isClean) {
        this.name = name;
        this.producer = producer;
        this.value = value;
        this.mileage = mileage;
        this.truck = truck;
        this.carComponents = carComponents;
        this.isClean = false;
        this.fixesHisotry = new ArrayList<>();
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Nazwa: " + name + "\n");
        builder.append("Producent: " + producer + "\n");
        builder.append("Warość : " + value + " $\n");
        builder.append("Przebieg : " + mileage + " km\n");
        builder.append((truck ? "Ciężarówka" : "Samochód osobowy") + "\n");
        builder.append((isClean ? "Czysty" : "Do czyszczenia") + "\n");
        builder.append(carComponents);

        return builder.toString();
    }

    public long getCarValue(){

        return this.value;
    }

    public String getProducer() {
        return producer;
    }

    public String getName() {return name;}

    public long getSumOfCosts() {return sumOfCosts;}

    public CarComponents getCarComponents() {
        return carComponents;
    }

    public void setCarValue(long v) {
        this.value = v;
    }

    public void showFixesHistory() {
        System.out.println("Historia napraw danego samochodu: ");
        for(int i = 0; i < fixesHisotry.size(); i++) {
            System.out.println((i + 1) + ". " + fixesHisotry.get(i));
        }
    }

    public void addFixToHistory(FixTransaction fix) {
        sumOfCosts += fix.getPrice();
        fixesHisotry.add(fix);
    }
}
