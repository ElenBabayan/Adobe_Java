package com.aca.week10.Homework07.task6;

public class UnsafeCar implements Car {

    public static final int NUM_OF_SEATS = 6;
    private String[] passengerSeats = new String[NUM_OF_SEATS];
    private int length;

    public int getLength() {
        return length;
    }

    @Override
    public void add(String passengerName) {
        if(length >= NUM_OF_SEATS) {
            throw new IndexOutOfBoundsException();
        }
        passengerSeats[length] =  passengerName;
        length++;
    }

    @Override
    public void printPassengerNames() {
        for (int i = 0; i < NUM_OF_SEATS; i++) {
            System.out.println(passengerSeats[i]);
        }

    }
}
