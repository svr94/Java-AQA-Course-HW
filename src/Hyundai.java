public class Hyundai extends Auto{
    public static String mark = "Hyundai";
    public static String countryBrand = "South Korea";

    public Hyundai(String type, Integer year, Integer numSits, Integer distance, String color) {
        super(type, year, numSits, distance, color);
    }
    public static String getMark(){return mark;}
    public static String getCountryBrand() {return countryBrand;}
}