public class Kia extends Auto{
    public static String mark = "Kia";
    public static String countryBrand = "South Korea";

    public Kia(String type, Integer year, Integer numSits, Integer distance, String color) {
        super(type, year, numSits, distance, color);
    }
    public static String getMark(){return mark;}
    public static String getCountryBrand() {return countryBrand;}
}

