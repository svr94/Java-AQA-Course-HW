public class Focus extends Ford implements Use_In_Taxi{
    static String model = "Focus";
    public static String fuel;
    public String transmission;
    public Focus(String type, Integer year, Integer numSits, Integer distance, String color, String transmission)
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

    @Override
    public void serve_auto(String command) {
        System.out.println("Served:" +command);
    }
}
