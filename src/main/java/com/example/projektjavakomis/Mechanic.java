package com.example.projektjavakomis;

public class Mechanic {

    public String name;
    public double repairValueMultiplier;
    public double riskOfNotRepaired;
    public double riskOfDamage;

    public Mechanic(String name, double repairValueMultiplier, double riskOfNotRepaired, double riskOfDamage) {
        this.name = name;
        this.repairValueMultiplier = repairValueMultiplier;
        this.riskOfNotRepaired = riskOfNotRepaired;
        this.riskOfDamage = riskOfDamage;
    }


}
