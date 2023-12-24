package com.example.autopark.mark.hyundai.model;
import com.example.autopark.Use_In_Taxi;
import com.example.autopark.mark.Mark;
import com.example.autopark.mark.hyundai.Hyundai;

public class Santa_Fe extends Hyundai implements Use_In_Taxi {

    protected String model = "Santa Fe";
    public String transmission;

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public Santa_Fe(String type, int year, int numSits, int distance, String transmission) {
        super(type, year, numSits, distance);
        this.transmission = transmission;
        mark = Mark.Hyundai;
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
        System.out.println("Use in Taxi:" + command);
    }

    @Override
    public void last_serve(String command) {
        Use_In_Taxi.super.last_serve(command);
    }

    }


