package com.example.autopark.mark.ford.model;
import com.example.autopark.mark.Mark;
import com.example.autopark.mark.ford.Ford;
import com.example.autopark.Use_In_Taxi;

public class Explorer extends Ford implements Use_In_Taxi {

    protected String model = "Explorer";
    public String transmission;


    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public Explorer(String type, int year, int numSits, int distance, String transmission)
    {super(type, year, numSits, distance);
        this.transmission = transmission;
        mark = Mark.Ford;
    }

    @Override
    public String toString() {
        return "Explorer{" +
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


