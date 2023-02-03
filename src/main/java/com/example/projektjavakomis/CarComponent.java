package com.example.projektjavakomis;

public class CarComponent {
    private String name;
    private long baseRepairValue;
    private boolean health;
    private double valueIncrease;

    public CarComponent(String name, long baseRepairValue, boolean health, double valueIncrease) {
        this.name = name;
        this.baseRepairValue = baseRepairValue;
        this.health = health;
        this.valueIncrease = valueIncrease;
    }

    public void fixComponent() {
        this.health = true;
    }

    public long getBaseRepairValue() {
        return this.baseRepairValue;
    }

    public boolean isHealthy() {
        return health;
    }

    public String getName() {
        return name;
    }

    public void breakComponent() {
        this.health = false;
    }

    public double getValueIncrease() {
        return valueIncrease;
    }

    @Override
    public String toString() {
        return name + ": " + (health ? "sprawne" : "niesprawne");
    }
}
