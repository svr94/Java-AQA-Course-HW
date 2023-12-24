package com.example.autopark.mark.ford;
import com.example.autopark.Auto;
import com.example.autopark.mark.Mark;

public class Ford extends Auto {

    protected static Mark mark = null;
    public Ford(String type, int year, int numSits, int distance) {
        super(type, year, numSits, distance);
    }

    @Override
    public String toString() {
        return "Ford" + super.toString();
    }
    @Override
    public void trafficAccidents() {
        System.out.println("!!! Traffic accidents");
    }

}
