package com.example.autopark;

import java.util.StringJoiner;

public abstract class Auto {
    protected int id;
    protected String type;
    protected int year;
    protected int numSits;
    protected int distance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumSits() {
        return numSits;
    }

    public void setNumSits(int numSits) {
        this.numSits = numSits;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Auto(int id, String type, int year, int numSits, int distance) {
        this.id = id;
        this.type = type;
        this.year = year;
        this.numSits = numSits;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", year=" + year +
                ", numSits=" + numSits +
                ", distance=" + distance +
                '}';
    }

    public abstract void trafficAccidents();
}