public class Ford extends Auto{
    public static String mark = "Ford";
    public static String countryBrand = "USA";

    public Ford(String type, int year, int numSits, int distance, Color color ) {
        super(type, year, numSits, distance, color);
    }

    @Override
    public void trafficAccidents() {
        System.out.println("!!! Traffic accidents");
    }

    public static String getMark(){
        return mark;
    }
    public static String getCountryBrand() {
        return countryBrand;
    }

}
