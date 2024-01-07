package com.example.autopark.mark.hyundai;
import com.example.autopark.Auto;
import com.example.autopark.mark.Mark;


public class Hyundai extends Auto {

    protected static Mark mark = null;

    public Hyundai(int id, String type, int year, int numSits, int distance) {
        super(id, type, year, numSits, distance);
    }

    @Override
    public String toString() {
        return "Hyundai" + super.toString();
    }
    @Override
    public void trafficAccidents() {
        System.out.println("!!! Traffic accidents");
    }
}