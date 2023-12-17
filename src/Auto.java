abstract class Auto {
    protected String type;
    protected int year;
    protected int numSits;
    protected int distance;
    protected Color color;

    public Auto(String type, int year, int numSits, int distance, Color color) {
        this.type = type;
        this.year = year;
        this.numSits = numSits;
        this.distance = distance;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumSits() {
        return numSits;
    }

    public void setNumSits(int numSits) {
        this.numSits = numSits;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void trafficAccidents();
}