public class Cerato extends Kia {
    static String model = "Cerato";
    static String fuel = "patrol";
    public static String getFuel(){return fuel;}
    public static String getModel(){return model;}
    public static void setFuel(String fuel){Cerato.fuel = fuel;}


    public Cerato(String type, Integer year, Integer numSits, Integer distance, String color)
        {super(type, year, numSits, distance, color);}

}



