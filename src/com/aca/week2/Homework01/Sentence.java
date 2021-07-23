package com.aca.week2.Homework01;

public class Sentence {

    private Integer MAX_SIZE = 5;
    private String[] strArray = new String[MAX_SIZE];
    private int counter;

    public String[] getStrArray() {
        return strArray;
    }

    public void setStrArray(String[] str) {
        if (str.length > MAX_SIZE) {
            System.out.println("Error: max String array length is 5");
        } else {
            for (int i = 0; i < this.strArray.length; i++) {
                this.strArray[i] = str[i];
                counter++;
            }
        }
    }

    public void append(String word) {
        if(counter >= strArray.length) {
            System.out.println("Error: max String array length is 5");
        }
        else {
            strArray[counter++] = word;
        }
    }

    public String getValue() {
        String result = "";
        for (int i = 0; i < counter; i++) {
                result += strArray[i] + ((i != strArray.length - 1) ?  " " : "");
        }
        return result;
    }

    public int getWordsCount() {
        return counter;
    }
}