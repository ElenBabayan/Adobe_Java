package com.aca.week2.Homework01;

public class Person {

    private Double birthMilli;
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthMilli(Double birthMilli) {
        if (birthMilli <= 0) {
            System.out.println("Error: birthMilli cannot be less or equal to zero");
            return;
        }
        if (!isBirthNull()) {
            System.out.println("Error: BirthMilli is already set.");
            return;
        }

        this.birthMilli = birthMilli;
    }

    public Double getAge() {
        if (isBirthNull()) {
            System.out.println("Error: The birth milli is not set. Cannot get the age.");
            return null;
        }

        return birthMilli / (getTimeStampForOneDay() * 365);
    }

    public String getAgeReadableFormat() {
        if (isBirthNull()) {
            System.out.println("Error: The birth milli is not set. Cannot get the age.");
            return null;
        }

        int years = 0, days = 0;
        years = (int) (birthMilli / (getTimeStampForOneDay() * 365));
        double buildMilliTemp = birthMilli - ((long) years * getTimeStampForOneDay() * 365);
        if (buildMilliTemp > 0) {
            days = (int) (buildMilliTemp / getTimeStampForOneDay());
        }

        return "Years: " + years + (days != 0 ? " Days: " + days : "");
    }

    private boolean isBirthNull() {
        return this.birthMilli == null;
    }

    private long getTimeStampForOneDay() {
        return  1000 * 60 * 60 * 24;
    }

}
