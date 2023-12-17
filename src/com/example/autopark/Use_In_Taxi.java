package com.example.autopark;

public interface Use_In_Taxi {
    boolean useInTaxi = true;
    double weight = 0;

    void serve_auto(String command);
    default void last_serve(String command){System.out.println("Last time on Service:"+command);}
}