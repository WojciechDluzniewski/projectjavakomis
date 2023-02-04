package com.example.projektjavakomis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class CarRepair {

    public static List<Mechanic> mechanics = new ArrayList<>();
    public static HashMap<String, Double> pricesBasedOnProducer = new HashMap<String, Double>();

    public static void init() {
        mechanics.add(new Mechanic("Janusz", 5, 0.0, 0.0));
        mechanics.add(new Mechanic("Marian", 2, 0.1, 0.0));
        mechanics.add(new Mechanic("Adrian", 1, 0.2, 0.02));

        pricesBasedOnProducer.put("Audi", 1.4);
        pricesBasedOnProducer.put("BMW", 1.4);
        pricesBasedOnProducer.put("Mercedes", 1.6);
        pricesBasedOnProducer.put("Ford", 1.1);
        pricesBasedOnProducer.put("Volkswagen", 1.3);
        pricesBasedOnProducer.put("Toyota", 1.2);
        pricesBasedOnProducer.put("Nissan", 1.0);
    }


}
