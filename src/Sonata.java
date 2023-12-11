public class Sonata extends Hyundai implements Use_In_Taxi{
    static String model = "Sonata";
    public static String fuel;
    public String transmission;
    private String type;
    private Integer year;
    private Integer numSits;
    private Integer distance;

    public Sonata(String transmission)
    {super();
        this.transmission = transmission;
    }

    public static String getModel() {
        return model;
    }
    public static String setFuel(String fuel) {
        return Sonata.fuel = fuel;
    }
    public String getFuel() {
        return fuel;
    }

    public String getTransmission() {
        return transmission;
    }

    public Sonata setType(String type) {
        this.type = type;
        return this;
    }
    public String getType(){return type;}

    public Sonata setYear(Integer year) {
        this.year = year;
        return this;
    }
    public Integer getYear(){return year;}

    public Sonata setNumSits(Integer numSits) {
        this.numSits = numSits;
        return this;
    }
    public Integer getNumSits(){return numSits;}

    public Sonata setDistance(Integer distance) {
        this.distance = distance;
        return this;
    }
    public Integer getDistance(){return distance;}

    public Sonata createSonata() {
        return new Sonata(transmission);
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

