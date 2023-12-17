public class Sonata extends Hyundai implements Use_In_Taxi {
    static String model = "Sonata";
    public static FuelType fuel = FuelType.gas;
    public String transmission;
    public int numDoors = 4;

    public Sonata(String type, int year, int numSits, int distance, Color color, String transmission, int numDoors) {
        super(type, year, numSits, distance, color);
        this.transmission = transmission;
        this.numDoors = numDoors;
    }

    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {
        Sonata.model = model;
    }

    public static FuelType getFuel() {
        return fuel;
    }

    public static void setFuel(FuelType fuel) {
        Sonata.fuel = fuel;
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
        System.out.println("Use in Taxi:" + command);
    }

    @Override
    public void last_serve(String command) {
        Use_In_Taxi.super.last_serve(command);
    }


    public static class Builder {
        private String type;
        private int year;
        private int numSits;
        private int distance;
        private Color color;
        private String transmission;
        private int numDoors;

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setYear(int year) {
            this.year = year;
            return this;
        }

        public Builder setNumSits(int numSits) {
            this.numSits = numSits;
            return this;
        }

        public Builder setDistance(int distance) {
            this.distance = distance;
            return this;
        }

        public Builder setColor(Color color) {
            this.color = color;
            return this;
        }

        public Builder setTransmission(String transmission) {
            this.transmission = transmission;
            return this;
        }

        public Builder setNumDoors(int numDoors) {
            this.numDoors = numDoors;
            return this;
        }

        public Sonata createSonata() {
            return new Sonata(type, year, numSits, distance, color, transmission, numDoors);
        }
    }
    }


