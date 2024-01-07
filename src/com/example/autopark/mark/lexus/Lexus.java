package com.example.autopark.mark.lexus;
import com.example.autopark.Auto;
import com.example.autopark.mark.Mark;

public class Lexus extends Auto {
    protected Mark mark = null;

    public Lexus(int id, String type, int year, int numSits, int distance) {
        super(id, type, year, numSits, distance);
    }

    @Override
    public String toString() {
        return "Lexus" + super.toString();
    }

    @Override
    public void trafficAccidents() {

    }
}
