package com.example.projektjavakomis;

import java.util.ArrayList;
import java.util.List;


public class CarComponents {

    private List<CarComponent> components;

    public CarComponents() {
        components = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < components.size(); i++) {
            builder.append((i + 1) + " " + components.get(i) + "\n");
        }
        return builder.toString();
    }

    public CarComponent getFirstHealthy() {
        for(int i = 0; i < components.size(); i++) {
            if(components.get(i).isHealthy()) {
                return components.get(i);
            }
        }
        return null;
    }

    public List<CarComponent> getComponents() {
        return components;
    }

    public void addComponent(CarComponent component) {
        this.components.add(component);
    }
}
