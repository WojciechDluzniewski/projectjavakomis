package com.example.projektjavakomis;

import java.util.List;

public class Customer {


    private String firstName;
    private String lastName;
    private long cash;
    private boolean isTruck;
    private List<String> isInterestedInProducers;
    private String isInterestedInDamagedCar;


    public Customer(String firstName, String lastName, long cash, boolean isTruck, List<String> isInterestedInProducers, String isInterestedInDamagedCar) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cash = cash;
        this.isTruck = isTruck;
        this.isInterestedInProducers = isInterestedInProducers;
        this.isInterestedInDamagedCar = isInterestedInDamagedCar;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Imię: " + firstName + "\n");
        builder.append("Nazwisko: " + lastName + "\n");
        builder.append("Środki : " + cash + " $\n");
        builder.append("Zaainteresowany kupnem: " + (isTruck ? "Ciężarówki" : "Samochodu osobowego") + "\n");
        builder.append("Zainteresowany markami: " + isInterestedInProducers + "\n");
        builder.append("Zainteresowany kupnem auta w stanie: " + isInterestedInDamagedCar + "\n");


        return builder.toString();
    }

    public boolean isInterstedInGivenCar(Car car) {
        return isInterestedInDamagedCar.equals(car.getStatusOfCar()) && cash >= car.getCarValue() && isInterestedInProducers.contains(car.getProducer()) && isTruck == car.isTruck();
    }
}