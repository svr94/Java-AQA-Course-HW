package com.example.autopark.mark.kia;
import com.example.autopark.Auto;
import com.example.autopark.mark.Mark;

import java.util.StringJoiner;

public class Kia extends Auto {

    protected Mark mark = null;

    public Kia(String type, int year, int numSits, int distance) {
        super(type, year, numSits, distance);
    }

    @Override
    public String toString() {
        return "Kia" + super.toString();
    }

    @Override
    public void trafficAccidents() {

    }

}

