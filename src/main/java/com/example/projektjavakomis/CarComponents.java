package com.example.projektjavakomis;

public class CarComponents {

    private Boolean breaks;
    private Boolean suspension;
    private Boolean engine;
    private Boolean body;
    private Boolean gearbox;

    public Boolean getBreaks() {
        return breaks;
    }

    public void setBreaks(Boolean breaks) {
        this.breaks = breaks;
    }

    public Boolean getSuspension() {
        return suspension;
    }

    public void setSuspension(Boolean suspension) {
        this.suspension = suspension;
    }

    public Boolean getEngine() {
        return engine;
    }

    public void setEngine(Boolean engine) {
        this.engine = engine;
    }

    public Boolean getBody() {
        return body;
    }

    public void setBody(Boolean body) {
        this.body = body;
    }

    public Boolean getGearbox() {
        return gearbox;
    }

    public void setGearbox(Boolean gearbox) {
        this.gearbox = gearbox;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append((breaks ? "Hamulce sprawne" : "Hamulce niesprawne") + "\n");
        builder.append((suspension ? "Zawieszenie sprawne" : "Zawieszenie niesprawne") + "\n");
        builder.append((engine ? "Silnik sprawny" : "Silnik niesprawny") + "\n");
        builder.append((body ? "Karoseria w dobrym stanie" : "Karoseria do naprawy") + "\n");
        builder.append((gearbox ? "Skrzynia biegów sprawna" : "Skrzynia biegów niesprawna") + "\n");

        return builder.toString();
    }
}
