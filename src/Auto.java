public class Auto {
    static String type;
    static Integer year;
    static Integer numSits;
    static Integer distance;
    static String color;

    public Auto(String type, Integer year, Integer numSits, Integer distance, String color) {
        this.type = type;
        this.year = year;
        this.numSits = numSits;
        this.distance = distance;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public Integer getYear() {
        return year;
    }

    public Integer getNumSits() {
        return numSits;
    }

    public Integer getDistance() {
        return distance;
    }

    public String getColor() {
        return color;
    }
}


