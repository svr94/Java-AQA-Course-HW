public class Ford extends Auto{
    public static String mark = "Ford";
    public static String countryBrand = "USA";

    public Ford(String type, Integer year, Integer numSits, Integer distance, String color) {
        super(type, year, numSits, distance, color);
    }
    public static String getMark(){return mark;}
    public static String getCountryBrand() {return countryBrand;}
}
