public class Kia extends Auto{
    public static String mark = "Kia";
    public static String countryBrand = "South Korea";

    public Kia(String type, int year, int numSits, int distance, Color color) {
        super(type, year, numSits, distance, color);
    }

    @Override
    public void trafficAccidents() {
        System.out.println("!!! Traffic accidents");
    }

    public static String getMark(){return mark;}
    public static String getCountryBrand() {return countryBrand;}

}

