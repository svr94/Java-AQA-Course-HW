public class Main {

    public static void main(String[] args) {

        System.out.println("----- Auto 1");
        var sonata = new Sonata("Automatic");
        System.out.println("Mark:" + Hyundai.getMark());
        System.out.println("Country Mark:" + Hyundai.getCountryBrand());
        System.out.println("Model:" + Sonata.getModel());
        sonata.setType("Sedan");
        System.out.println("Type:" + sonata.getType());
        sonata.setYear(2014);
        System.out.println("Year:" + sonata.getYear());
        sonata.setNumSits(5);
        System.out.println("Count of sits:" + sonata.getNumSits());
        sonata.setDistance(155000);
        System.out.println("Distance:" + sonata.getDistance());
        System.out.println("Transmission:" + sonata.getTransmission());
        System.out.println("Color:" + Color.Black);
        sonata.serve_auto("Yes");
        sonata.last_serve("01.12.2023");

        System.out.println("----- Auto 2");
        var cerato = new Cerato("Automatic");
        System.out.println("Mark:" + Kia.getMark());
        System.out.println("Country Mark:" + Kia.getCountryBrand());
        System.out.println("Model:" + Cerato.getModel());
        cerato.setType("Koup");
        System.out.println("Type:" + cerato.getType());
        cerato.setYear(2011);
        System.out.println("Year:" + cerato.getYear());
        cerato.setNumSits(5);
        System.out.println("Count of sits:" + cerato.getNumSits());
        cerato.setDistance(185000);
        System.out.println("Distance:" + cerato.getDistance());
        System.out.println("Transmission:" + cerato.getTransmission());
        System.out.println("Color:" + Color.Red);
        cerato.serve_auto("No");
        cerato.last_serve("26.08.2023");

        System.out.println("----- Auto 3");
        var focus = new Focus("Automatic");
        System.out.println("Mark:" + Ford.getMark());
        System.out.println("Country Mark:" + Ford.getCountryBrand());
        System.out.println("Model:" + Focus.getModel());
        focus.setType("Hatchback");
        System.out.println("Type:" + focus.getType());
        focus.setYear(2016);
        System.out.println("Year:" + focus.getYear());
        focus.setNumSits(5);
        System.out.println("Count of sits:" + focus.getNumSits());
        focus.setDistance(183000);
        System.out.println("Distance:" + focus.getDistance());
        System.out.println("Transmission:" + focus.getTransmission());
        System.out.println("Color:" + Color.Blue);
        focus.serve_auto("Yes");
        focus.last_serve("15.10.2023");
    }

}
