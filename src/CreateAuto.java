public class CreateAuto extends Auto{
    private String type;
    public Integer year;
    public Integer numSits;
    public Integer distance;
    public String color;

    public CreateAuto(String type, Integer year, Integer numSits, Integer distance, String color) {
        super(type, year, numSits, distance, color);
    }

    public CreateAuto setType(String type) {
        this.type = type;
        return this;
    }

    public CreateAuto setYear(Integer year) {
        this.year = year;
        return this;
    }

    public CreateAuto setNumSits(Integer numSits) {
        this.numSits = numSits;
        return this;
    }

    public CreateAuto setDistance(Integer distance) {
        this.distance = distance;
        return this;
    }

    public CreateAuto setColor(String color) {
        this.color = color;
        return this;
    }
}