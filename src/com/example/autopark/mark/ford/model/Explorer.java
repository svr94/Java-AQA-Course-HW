package com.example.autopark.mark.ford.model;

import com.example.autopark.mark.ford.Ford;
import com.example.autopark.FuelType;
import com.example.autopark.Use_In_Taxi;
import com.example.autopark.Color;
import com.example.autopark.FuelType;

import java.util.StringJoiner;

public class Explorer extends Ford implements Use_In_Taxi {
    static String model = "Explorer";
    public static FuelType fuel = FuelType.petrol;
    public String transmission;
    public int numDoors = 4;

    public Explorer(String type, int year, int numSits, int distance, Color color, String transmission, int numDoors)
    {super(type, year, numSits, distance, color);
        this.transmission = transmission;
        this.numDoors = numDoors;
    }
    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {
        Explorer.model = model;
    }

    public static FuelType getFuel() {
        return fuel;
    }

    public static void setFuel(FuelType fuel) {Explorer.fuel = fuel;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getNumDoors(){
        return numDoors;
    }

    public void setNumDoors(int numDoors){
        this.numDoors = numDoors;
    }

    @Override
    public void serve_auto(String command) {
        System.out.println("Use in Taxi:" +command);
    }
    @Override
    public void last_serve(String command) {
        Use_In_Taxi.super.last_serve(command);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Explorer.class.getSimpleName() + "{", "}")
                .add("mark='" + mark +"'")
                .add("model='" + model + "'")
                .add("type='" + type + "'")
                .add("year=" + year)
                .add("numSits=" + numSits)
                .add("distance=" + distance)
                .add("color='" + color + "'")
                .add("fuel='" + fuel + "'")
                .add("transmission='" + transmission + "'")
                .add("numDoors=" + numDoors)
                .toString();
    }


    public static class Builder {
        private String type;
        private int year;
        private int numSits;
        private int distance;
        private Color color;
        private String transmission;
        private int numDoors;

        public Explorer.Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Explorer.Builder setYear(int year) {
            this.year = year;
            return this;
        }

        public Explorer.Builder setNumSits(int numSits) {
            this.numSits = numSits;
            return this;
        }

        public Explorer.Builder setDistance(int distance) {
            this.distance = distance;
            return this;
        }

        public Explorer.Builder setColor(Color color) {
            this.color = color;
            return this;
        }

        public Explorer.Builder setTransmission(String transmission) {
            this.transmission = transmission;
            return this;
        }

        public Explorer.Builder setNumDoors(int numDoors) {
            this.numDoors = numDoors;
            return this;
        }

        public Explorer createExplorer() {
            return new Explorer(type, year, numSits, distance, color, transmission, numDoors);
        }
    }

}


