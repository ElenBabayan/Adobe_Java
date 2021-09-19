package com.aca.week10.Homework07.task6;

public class SafeCar implements Car {

    public static final int NUM_OF_SEATS = 6;
    private String[] passengerSeats = new String[NUM_OF_SEATS];
    private int length;

    public synchronized int getLength() {
        return length;
    }

    @Override
    public synchronized void add(String passengerName) {
        if(length >= NUM_OF_SEATS) {
            throw new IndexOutOfBoundsException();
        }
        passengerSeats[length] =  passengerName;
        length++;
    }

    @Override
    public synchronized void printPassengerNames() {
        for (int i = 0; i < NUM_OF_SEATS; i++) {
            System.out.println(passengerSeats[i]);
        }

    }
}
