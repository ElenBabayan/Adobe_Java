package com.aca.week8.Class14;

import java.io.Serializable;

public class Settings implements Serializable {

    private int width;

    private int height;

    private String projectName;

    public Settings() {
        super();
    }

    public Settings(int width, int height, String projectName) {
        this.width = width;
        this.height = height;
        this.projectName = projectName;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
