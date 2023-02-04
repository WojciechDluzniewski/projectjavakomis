package com.example.projektjavakomis;

public class CounterOfMoves {

    private static int amountOf;

    public CounterOfMoves() {
        amountOf = 1;
    }

    public void incrementMove() {
        amountOf++;
    }

    public static int getMoveNumber() {
        return amountOf;
    }
}