package com.example.autopark.mark.hyundai;

import com.example.autopark.*;

public class Hyundai extends Auto {
    public static String mark = "Hyundai";
    public static String countryBrand = "South Korea";

    public Hyundai(String type, int year, int numSits, int distance, Color color) {
        super(type, year, numSits, distance, color);
    }


    @Override
    public void trafficAccidents() {
        System.out.println("!!! Traffic accidents");
    }

    public static String getMark(){return mark;}
    public static String getCountryBrand() {return countryBrand;}
}