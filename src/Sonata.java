public class Sonata extends Ford{
    static String model = "Sonata";
    public static String fuel;
    public String transmission;
    public Sonata(String type, Integer year, Integer numSits, Integer distance, String color, String transmission)
    {super(type, year, numSits, distance, color);
        this.transmission = transmission;
    }
    public String getFuel() {
        return fuel;
    }

    public static String getModel() {
        return model;
    }

    public static String setFuel(String fuel) {
        return Cerato.fuel = fuel;
    }

    public String getTransmission() {
        return transmission;
    }
}

