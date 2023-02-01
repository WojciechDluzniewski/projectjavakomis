package com.example.projektjavakomis;

public class Mechanic {

    private String name;
    private Double breaksRepairValue;
    private Double suspensionRepairValue;
    private Double engineRepairValue;
    private Double bodyRepairValue;
    private Double gearboxRepairValue;

    public Mechanic(String name, Double breaksRepairValue, Double suspensionRepairValue, Double engineRepairValue, Double bodyRepairValue, Double gearboxRepairValue) {
        this.name = name;
        this.breaksRepairValue = breaksRepairValue;
        this.suspensionRepairValue = suspensionRepairValue;
        this.engineRepairValue = engineRepairValue;
        this.bodyRepairValue = bodyRepairValue;
        this.gearboxRepairValue = gearboxRepairValue;
    }


}
