package com.example.autopark.mark.bmw;
import com.example.autopark.Auto;
import com.example.autopark.mark.Mark;

public class BMW extends Auto {

    protected static Mark mark = null;
    public BMW(int id, String type, int year, int numSits, int distance) {
        super(id, type, year, numSits, distance);
    }

    @Override
    public String toString() {
        return "BMW" + super.toString();
    }
    @Override
    public void trafficAccidents() {
        System.out.println("!!! Traffic accidents");
    }

}

