package com.example.projektjavakomis;

import java.util.HashMap;
import java.util.Scanner;

public class CarRepair {
    HashMap<String, Double> pricesBasedOnProducer = new HashMap<String, Double>();

    public HashMap<String, Double> getPricesBasedOnProducer() {
        pricesBasedOnProducer.put("Audi", 1.4);
        pricesBasedOnProducer.put("BMW", 1.4);
        pricesBasedOnProducer.put("Mercedes", 1.6);
        pricesBasedOnProducer.put("Ford", 1.1);
        pricesBasedOnProducer.put("Volkswagen", 1.3);
        pricesBasedOnProducer.put("Toyota", 1.2);
        pricesBasedOnProducer.put("Nissan", 1.0);

        return pricesBasedOnProducer;
    }

}
