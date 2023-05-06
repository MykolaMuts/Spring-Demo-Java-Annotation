package com.pluralsight.model;

public class Speaker {

    private String firstName;
    private String secondName;

    private double seedNum;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setSeedNum(double seedNum) {
        this.seedNum = seedNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public double getSeedNum() {
        return seedNum;
    }

}
