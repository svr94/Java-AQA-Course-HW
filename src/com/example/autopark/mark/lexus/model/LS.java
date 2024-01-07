package com.example.autopark.mark.lexus.model;
import com.example.autopark.Use_In_Taxi;
import com.example.autopark.mark.Mark;
import com.example.autopark.mark.lexus.Lexus;


public class LS extends Lexus implements Use_In_Taxi {

    protected String model = "LS";

    protected String transmission;

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public LS(int id, String type, int year, int numSits, int distance, String transmission) {
        super(id, type, year, numSits, distance);
        this.transmission = transmission;
        mark = Mark.Lexus;
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
    public void trafficAccidents() {
    }

    @Override
    public void serve_auto(String command) {
    }

    @Override
    public void last_serve(String command) {
        Use_In_Taxi.super.last_serve(command);
    }
}

