package com.example.projektjavakomis;

public class Mechanic {

    private String name;
    private double breaksRepairValue;
    private double suspensionRepairValue;
    private double engineRepairValue;
    private double bodyRepairValue;
    private double gearboxRepairValue;
    private double riskOfNotRepaired;
    private double  riskOfDamage;

    public Mechanic(String name, double breaksRepairValue, double suspensionRepairValue, double engineRepairValue, double bodyRepairValue, double gearboxRepairValue, double riskOfNotRepaired, double riskOfDamage) {
        this.name = name;
        this.breaksRepairValue = breaksRepairValue;
        this.suspensionRepairValue = suspensionRepairValue;
        this.engineRepairValue = engineRepairValue;
        this.bodyRepairValue = bodyRepairValue;
        this.gearboxRepairValue = gearboxRepairValue;
        this.riskOfNotRepaired = riskOfNotRepaired;
        this.riskOfDamage = riskOfDamage;
    }


}
