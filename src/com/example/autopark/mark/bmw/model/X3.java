package com.example.autopark.mark.bmw.model;
import com.example.autopark.Use_In_Taxi;
import com.example.autopark.mark.Mark;
import com.example.autopark.mark.bmw.BMW;

public class X3 extends BMW implements Use_In_Taxi {
    protected String model = "X3";
    public String transmission;

    public X3(String type, int year, int numSits, int distance, String transmission)
    {super(type, year, numSits, distance);
        this.transmission = transmission;
        mark = Mark.BMW;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "{" +
                "mark=" + mark +
                ", model=" + model
                +", transmission=" + transmission
                + "} " + super.toString();
    }

    @Override
    public void serve_auto(String command) {
        System.out.println("Use in Taxi:" +command);
    }
    @Override
    public void last_serve(String command) {
        Use_In_Taxi.super.last_serve(command);
    }



}
