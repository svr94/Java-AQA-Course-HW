package com.example.autopark.mark.kia;
import com.example.autopark.Auto;
import com.example.autopark.mark.Mark;


public class Kia extends Auto {

    protected Mark mark = null;

    public Kia(int id, String type, int year, int numSits, int distance) {
        super(id, type, year, numSits, distance);
    }

    @Override
    public String toString() {
        return "Kia" + super.toString();
    }

    @Override
    public void trafficAccidents() {

    }

}

