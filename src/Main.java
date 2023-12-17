import com.example.autopark.Color;
import com.example.autopark.mark.ford.model.Focus;
import com.example.autopark.mark.hyundai.model.Sonata;
import com.example.autopark.mark.kia.model.Cerato;
import com.example.autopark.mark.ford.model.Explorer;

public class Main {

    public static void main(String[] args) {

        var sonata = new Sonata.Builder()
                .createSonata();
        sonata.setYear(2013);
        sonata.setTransmission("Automatic");
        sonata.setType("Sedan");
        sonata.setDistance(154000);
        sonata.setColor(Color.Black);
        sonata.setNumSits(5);
        sonata.setNumDoors(4);

        System.out.println();
        System.out.println("---Auto1");
        System.out.println(sonata);
        sonata.serve_auto("Yes");
        sonata.last_serve("01.12.2023");
        sonata.trafficAccidents();

        var cerato = new Cerato.Builder()
                .createCerato();
        cerato.setYear(2011);
        cerato.setTransmission("Automatic");
        cerato.setType("Koup");
        cerato.setDistance(186000);
        cerato.setColor(Color.Red);
        cerato.setNumSits(5);
        cerato.setNumDoors(2);

        System.out.println();
        System.out.println("---Auto2");
        System.out.println(cerato);
        cerato.serve_auto("No");
        cerato.last_serve("26.08.2023");

        var focus = new Focus.Builder()
                .createFocus();
        focus.setYear(2016);
        focus.setTransmission("Automatic");
        focus.setType("Hatchback");
        focus.setDistance(182000);
        focus.setColor(Color.Black);
        focus.setNumSits(5);
        focus.setNumDoors(4);

        System.out.println();
        System.out.println("---Auto3");
        System.out.println(focus);
        focus.serve_auto("Yes");
        focus.last_serve("16.10.2023");

        var explorer = new Explorer.Builder()
                .createExplorer();
        explorer.setYear(2017);
        explorer.setTransmission("Automatic");
        explorer.setType("Crossover");
        explorer.setDistance(82000);
        explorer.setColor(Color.Blue);
        explorer.setNumSits(7);
        explorer.setNumDoors(4);

        System.out.println();
        System.out.println("---Auto4");
        System.out.println(explorer);
        explorer.serve_auto("No");
        explorer.last_serve("12.03.2022");



    }

}
