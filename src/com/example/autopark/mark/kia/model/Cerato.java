package com.example.autopark.mark.kia.model;

import com.example.autopark.Color;
import com.example.autopark.FuelType;
import com.example.autopark.mark.kia.Kia;
import com.example.autopark.Use_In_Taxi;

public class Cerato extends Kia implements Use_In_Taxi {
    static String model = "Cerato";
    public static FuelType fuel = FuelType.petrol;
    public String transmission;
    public int numDoors = 2;
    public Cerato(String type, int year, int numSits, int distance, Color color, String transmission, int numDoors) {
        super(type, year, numSits, distance, color);
        this.transmission = transmission;
        this.numDoors = numDoors;
    }

    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {
        Cerato.model = model;
    }

    public static FuelType getFuel() {
        return fuel;
    }

    public static void setFuel(FuelType fuel) {
        Cerato.fuel = fuel;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
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
        return  " Cerato{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", countryBrand='" + countryBrand + '\'' +
                super.toString() +
                ", fuel='" + fuel + '\'' +
                ", transmission=" + transmission + '\'' +
                ", numDoors=" + numDoors +
                "} ";
    }

    public static class Builder {
        private String type;
        private int year;
        private int numSits;
        private int distance;
        private Color color;
        private String transmission;
        private int numDoors;

        public Cerato.Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Cerato.Builder setYear(int year) {
            this.year = year;
            return this;
        }

        public Cerato.Builder setNumSits(int numSits) {
            this.numSits = numSits;
            return this;
        }

        public Cerato.Builder setDistance(int distance) {
            this.distance = distance;
            return this;
        }

        public Cerato.Builder setColor(Color color) {
            this.color = color;
            return this;
        }

        public Cerato.Builder setTransmission(String transmission) {
            this.transmission = transmission;
            return this;
        }

        public Cerato.Builder setNumDoors(int numDoors) {
            this.numDoors = numDoors;
            return this;
        }

        public Cerato createCerato() {
            return new Cerato(type, year, numSits, distance, color, transmission, numDoors);
        }
    }
}

