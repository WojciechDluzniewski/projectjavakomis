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

    //wartość będzie obliczana na podstawie wartości samochodu

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

    public Mechanic mechanic1 = new Mechanic("Janusz", 0.08,0.16,0.8,0.3, 0.3, 0.0, 0.0);
    public Mechanic mechanic2 = new Mechanic("Marian", 0.05,0.10,0.5,0.2, 0.2, 0.1, 0.0);
    public Mechanic mechanic3 = new Mechanic("Adrian", 0.03,0.05,0.3,0.1, 0.1, 0.2, 0.02);





}
