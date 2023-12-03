public class Main {
    public static void main(String[] args) {
        var car1 = new Cerato("Koup", 2011, 5, 18600, "Red");

        System.out.println("Sail Car List:");
        System.out.println("-----Mark-----");
        System.out.println(Kia.mark);
        System.out.println("-----Model-----");
        System.out.println(Cerato.getModel());
        System.out.println("-----Detail Information-----");
        System.out.println("Country Brand:" + Kia.countryBrand);
        System.out.println("Type:" + car1.getType());
        System.out.println("Year:" + car1.getYear());
        System.out.println("Number of Sits:" + car1.getNumSits());
        System.out.println("Distance,km:" + car1.getDistance());
        System.out.println("Color:" + car1.getColor());
        System.out.println("Gas:" + Cerato.getFuel());
    }

}
