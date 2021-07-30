package com.aca.week4.Class7;

public class Store {

    Storage storage1 = new SSDStorage();
    Storage storage2 = new HDDStorage();
    Computer superComputer;
    Computer slowComputer;

    public void setSuperComputer() {
        superComputer = new Computer(storage1, storage1);
    }

    public void setSlowComputer() {
        slowComputer = new Computer(storage2, storage2);
    }

    public static void main(String[] args) {

    }
}
