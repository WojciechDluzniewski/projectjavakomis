package com.example.projektjavakomis;

public class CounterOfMoves {

    private int amountOf;

    public CounterOfMoves() {
        amountOf = 1;
    }

    public void incrementMove() {
        amountOf++;
    }

    public int getMoveNumber() {
        return amountOf;
    }
}