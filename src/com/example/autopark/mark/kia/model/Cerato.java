package com.example.autopark.mark.kia.model;
import com.example.autopark.mark.Mark;
import com.example.autopark.mark.kia.Kia;
import com.example.autopark.Use_In_Taxi;


public class Cerato extends Kia implements Use_In_Taxi {

    protected String model = "Cerato";

    protected String transmission;

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public Cerato(int id, String type, int year, int numSits, int distance, String transmission) {
        super(id, type, year, numSits, distance);
        this.transmission = transmission;
        mark = Mark.Kia;
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

