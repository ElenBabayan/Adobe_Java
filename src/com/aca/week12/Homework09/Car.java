package com.aca.week12.Homework09;

public class Car {

    // With columns Mark Name ,Model name,Document id(which refers to one document in Document table )

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
                ", documentId="+
                '}';
    }

}
