public class Cerato extends Kia implements Use_In_Taxi {
    static String model = "Cerato";
    public static String fuel;
    public String transmission;
    private String type;
    private Integer year;
    private Integer numSits;
    private Integer distance;
    private String color;

    public Cerato(String transmission)
    {super();
        this.transmission = transmission;
    }
    public static String getModel() {
        return model;
    }
    public static String setFuel(String fuel) {
        return Cerato.fuel = fuel;
    }
    public String getFuel() {
        return fuel;
    }

    public String getTransmission() {
        return transmission;
    }

    public Cerato setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return type;
    }

    public Cerato setYear(Integer year) {
        this.year = year;
        return this;
    }
    public Integer getYear() {
        return year;
    }

    public Cerato setNumSits(Integer numSits) {
        this.numSits = numSits;
        return this;
    }
    public Integer getNumSits() {
        return numSits;
    }

    public Cerato setDistance(Integer distance) {
        this.distance = distance;
        return this;
    }
    public Integer getDistance() {
        return distance;
    }

    public Cerato setTransmission(String transmission) {
        this.transmission = transmission;
        return this;
    }

    public Cerato createCerato() {
        return new Cerato(transmission);
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

