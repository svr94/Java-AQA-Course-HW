public class Main {

    public static void main(String[] args) {
        System.out.println("----- Auto 1");
        System.out.println("Mark:"+ Hyundai.getMark());
        System.out.println("Country Brand:"+ Hyundai.getCountryBrand());
        var sonata = new Sonata.Builder()
                .createSonata();
        sonata.setType("Sedan");
        System.out.println("Type:" +sonata.getType());
        sonata.setYear(2013);
        System.out.println("Year:" +sonata.getYear());
        sonata.setNumSits(5);
        System.out.println("Count of sits:" +sonata.getNumSits());
        sonata.setDistance(156000);
        System.out.println("Distance:" +sonata.getDistance());
        sonata.setColor(Color.Black);
        System.out.println("Color:" +sonata.getColor());
        sonata.setTransmission("Automatic");
        System.out.println("Transmission:" +sonata.getTransmission());
        sonata.setNumDoors(4);
        System.out.println("Count of doors:" +sonata.getNumDoors());
        sonata.serve_auto("Yes");
        sonata.last_serve("01.12.2023");
        sonata.trafficAccidents();

        System.out.println("----- Auto 2");
        System.out.println("Mark:"+ Kia.getMark());
        System.out.println("Country Brand:"+ Kia.getCountryBrand());
        var cerato = new Cerato.Builder()
                .createCerato();
        cerato.setType("Koup");
        System.out.println("Type:" +cerato.getType());
        cerato.setYear(2011);
        System.out.println("Year:" +cerato.getYear());
        cerato.setNumSits(5);
        System.out.println("Count of sits:" +cerato.getNumSits());
        cerato.setDistance(185000);
        System.out.println("Distance:" +cerato.getDistance());
        cerato.setColor(Color.Red);
        System.out.println("Color:" +cerato.getColor());
        cerato.setTransmission("Automatic");
        System.out.println("Transmission:" +cerato.getTransmission());
        cerato.setNumDoors(2);
        System.out.println("Count of doors:" +cerato.getNumDoors());
        cerato.serve_auto("No");
        cerato.last_serve("26.08.2023");

        System.out.println("----- Auto 3");
        System.out.println("Mark:"+ Ford.getMark());
        System.out.println("Country Brand:"+ Ford.getCountryBrand());
        var focus = new Focus.Builder()
                .createFocus();
        focus.setType("");
        System.out.println("Type:" +focus.getType());
        focus.setYear(2011);
        System.out.println("Year:" +focus.getYear());
        focus.setNumSits(5);
        System.out.println("Count of sits:" +focus.getNumSits());
        focus.setDistance(185000);
        System.out.println("Distance:" +focus.getDistance());
        focus.setColor(Color.Red);
        System.out.println("Color:" +focus.getColor());
        focus.setTransmission("Automatic");
        System.out.println("Transmission:" +focus.getTransmission());
        focus.setNumDoors(4);
        System.out.println("Count of doors:" +focus.getNumDoors());
        focus.serve_auto("Yes");
        focus.last_serve("16.10.2023");

    }

}
