public class Cerato extends Kia {
    static String model = "Cerato";
    public static String fuel;
    public String transmission;

    public Cerato(String type, Integer year, Integer numSits, Integer distance, String color, String transmission)
        {super(type, year, numSits, distance, color);
            this.transmission = transmission;
        }

    public String getFuel(){return fuel;}
    public static String getModel(){return model;}
    public static String setFuel(String fuel){return Cerato.fuel = fuel;}
    public String getTransmission(){return transmission;}



    public Cerato(String type, Integer year, Integer numSits, Integer distance, String color)
        {super(type, year, numSits, distance, color);}

}

