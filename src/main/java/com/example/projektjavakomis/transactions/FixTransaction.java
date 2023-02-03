package com.example.projektjavakomis.transactions;

import com.example.projektjavakomis.Car;
import com.example.projektjavakomis.CarComponent;

import com.example.projektjavakomis.CarComponents;
import com.example.projektjavakomis.Mechanic;

public class FixTransaction implements Transaction {
    private final String name;
    private Mechanic mechanic;
    private CarComponent component;
    private long price;
    private int round;
    private Car car;
    private boolean successful;

    public FixTransaction(Mechanic mechanic, CarComponent component, long price, int round, Car car, boolean successful) {
        this.name = "FIX";
        this.mechanic = mechanic;
        this.component = component;
        this.price = price;
        this.round = round;
        this.car = car;
        this.successful = successful;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name  + "\n");
        sb.append("Mechanik: " + mechanic.name  + "\n");
        sb.append(component  + "\n");
        sb.append("Cena: " + price  + "\n");
        sb.append("Przeprowadzone w ruchu: " + round  + "\n");
        sb.append("Naprawiany samochód: " + "\n");
        sb.append(car  + "\n");
        sb.append(successful ? "Naprawa zakończona sukcesem" : "Naprawa nie powiodła się");
        return sb.toString();
    }

    public long getPrice() {
        return price;
    }
}
