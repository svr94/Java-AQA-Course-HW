public class Main {

    public static void main(String[] args) {
        var newAuto = new Cerato("Koup", 2011, 5, 18600, "Red", "Automatic");
        Cerato.setFuel("A-95 (recommended)");


        System.out.println("Sail Car List:");
        System.out.println("-----Mark-----");
        System.out.println(Kia.getMark());
        System.out.println("-----Model-----");
        System.out.println(Cerato.getModel());
        System.out.println("-----Detail Information-----");
        System.out.println("Country Brand:" + Kia.getCountryBrand());
        System.out.println("Type:" + newAuto.getType());
        System.out.println("Year:" + newAuto.getYear());
        System.out.println("Number of Sits:" + newAuto.getNumSits());
        System.out.println("Distance,km:" + newAuto.getDistance());
        System.out.println("Transmission:" + newAuto.getTransmission());
        System.out.println("Color:" + newAuto.getColor());
        System.out.println("Gas:" + newAuto.getFuel());
    }

}
