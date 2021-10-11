package com.aca.week12.Homework09.carregistery;

public class Car {

    private String markName;
    private String modelName;

    public Car() {
    }

    public Car(String markName, String modelName) {
        this.markName = markName;
        this.modelName = modelName;
    }

    public String getMarkName() {
        return markName;
    }

    public void setMarkName(String markName) {
        this.markName = markName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return "Car{" +
                "markName='" + markName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", documentId=" +
                '}';
    }
}
