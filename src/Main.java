import com.example.autopark.mark.bmw.model.X3;
import com.example.autopark.mark.bmw.model.X5;
import com.example.autopark.mark.hyundai.model.Santa_Fe;
import com.example.autopark.mark.kia.model.Cerato;
import com.example.autopark.mark.ford.model.Focus;
import com.example.autopark.mark.hyundai.model.Kona;
import com.example.autopark.mark.ford.model.Explorer;
import com.example.autopark.Auto;
import com.example.autopark.mark.kia.model.Rio;
import com.example.autopark.mark.lexus.model.GS;
import com.example.autopark.mark.lexus.model.LS;

import java.time.chrono.ChronoPeriod;
import java.util.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;


public class Main {

    private static final String FILE_NAME = "resources/autoCatalog.csv";
    private static String[] pieces;


//  SCANNER
//    static String[] readFileUsingScanner(String fileName) {
//        ArrayList<String> data = new ArrayList<String>();
//        var file = new File(fileName);
//        Scanner scanner = null;
//        try {
//            scanner = new Scanner(file);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//
//        boolean finished = false;
//        do {
//            try {
//                data.add(scanner.nextLine());
//            } catch (NoSuchElementException e) {
//                finished = true;
//            }
//        } while (!finished);
//
//        scanner.close();
//        return Arrays.copyOf(data.toArray(), data.size(), String[].class);
//    }


    // FILEREADER
    static String[] readFileUsingFileReader(String fileName) {
        var newLine = System.lineSeparator();
        var sb = new StringBuffer();
        FileReader reader;
        try {
            reader = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int c;
        try {
            while ((c = reader.read()) != -1) {
                sb.append((char) c);
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString().split(newLine);
    }

    public static void main(String[] args) {
        var start = System.currentTimeMillis();
//  SCANNER
//        String[] data = readFileUsingScanner(FILE_NAME);
        String[] data = readFileUsingFileReader(FILE_NAME);
        var importLengthTime = System.currentTimeMillis() - start;
        System.out.println("Import data time:" + importLengthTime);
        autoObjects(data);
//        var createObjectTime = System.currentTimeMillis() - start;
//        System.out.println("Create object time:" + createObjectTime);

        LocalDateTime date1= LocalDateTime.of(2022, 1, 17, 12, 55, 44);
        LocalDateTime date2= LocalDateTime.of(2024, 5, 12, 7, 33, 55);
        long daysBetween = ChronoUnit.DAYS.between(date1, date2);
        System.out.println("Days between first and second date:" + daysBetween);

    }

    private static void autoObjects(String[] data) {
        var createObjectStart = System.currentTimeMillis();
        HashSet<Auto> autoList = new HashSet<>();
        for (int i = 1; i < data.length; i++) {
            var pieces = data[i].split(";");
            Auto auto = null;
            switch (pieces[2]) {
                case "Cerato":
                    auto = new Cerato(Integer.parseInt(pieces[0]), pieces[4], Integer.parseInt(pieces[5]), Integer.parseInt(pieces[6]),
                            Integer.parseInt(pieces[7]), pieces[10]);
                    break;
                case "Rio":
                    auto = new Rio(Integer.parseInt(pieces[0]), pieces[4], Integer.parseInt(pieces[5]), Integer.parseInt(pieces[6]),
                            Integer.parseInt(pieces[7]), pieces[10]);
                    break;
                case "Kona":
                    auto = new Kona(Integer.parseInt(pieces[0]), pieces[4], Integer.parseInt(pieces[5]), Integer.parseInt(pieces[6]),
                            Integer.parseInt(pieces[7]), pieces[10]);
                    break;
                case "Santa Fe":
                    auto = new Santa_Fe(Integer.parseInt(pieces[0]), pieces[4], Integer.parseInt(pieces[5]), Integer.parseInt(pieces[6]),
                            Integer.parseInt(pieces[7]), pieces[10]);
                    break;
                case "Focus":
                    auto = new Focus(Integer.parseInt(pieces[0]), pieces[4], Integer.parseInt(pieces[5]), Integer.parseInt(pieces[6]),
                            Integer.parseInt(pieces[7]), pieces[10]);
                    break;
                case "Explorer":
                    auto = new Explorer(Integer.parseInt(pieces[0]), pieces[4], Integer.parseInt(pieces[5]), Integer.parseInt(pieces[6]),
                            Integer.parseInt(pieces[7]), pieces[10]);
                    break;
                case "X3":
                    auto = new X3(Integer.parseInt(pieces[0]), pieces[4], Integer.parseInt(pieces[5]), Integer.parseInt(pieces[6]),
                            Integer.parseInt(pieces[7]), pieces[10]);
                    break;
                case "X5":
                    auto = new X5(Integer.parseInt(pieces[0]), pieces[4], Integer.parseInt(pieces[5]), Integer.parseInt(pieces[6]),
                            Integer.parseInt(pieces[7]), pieces[10]);
                    break;
                case "GS":
                    auto = new GS(Integer.parseInt(pieces[0]), pieces[4], Integer.parseInt(pieces[5]), Integer.parseInt(pieces[6]),
                            Integer.parseInt(pieces[7]), pieces[10]);
                    break;
                case "LS":
                    auto = new LS(Integer.parseInt(pieces[0]), pieces[4], Integer.parseInt(pieces[5]), Integer.parseInt(pieces[6]),
                            Integer.parseInt(pieces[7]), pieces[10]);
                    break;
            }
            autoList.add(auto);
//            System.out.println("Сar available: " + auto);
        }
        var createObjectTime = System.currentTimeMillis() - createObjectStart;
        System.out.println("Create object time:" + createObjectTime);

        var streamsStart = System.currentTimeMillis();
        System.out.println("--------------------");
        Stream<Auto> autoSortStream = autoList.stream();
        autoSortStream
                .sorted((a, b) -> a.getId() - b.getId())
                .skip(12)
                .limit(12)
                .forEach(System.out::println);

        System.out.println("--------------------");
        Stream<Auto> autoDistance = autoList.stream();
        autoDistance
                .filter(auto -> auto.getDistance()<20000)
                .limit(25)
                .forEach(System.out::println);

        System.out.println("--------------------");

        Stream<Auto> autoMap = autoList.stream();

        Map<Integer, String> stringAutoMap = autoMap.collect(Collectors.toMap(Auto::getId, Auto::getType));
        System.out.println(stringAutoMap);
        var streamsTime = System.currentTimeMillis() - streamsStart;
        System.out.println("Streams time:" + streamsTime);
    }


//        System.out.println(autoList);
}

//        interface MyFunctionalInterface {
//            void doSomething();
//        }
//        MyFunctionalInterface myFunctionalInterface = () -> {
//            System.out.println("Hello, world!");
//        };
//        myFunctionalInterface.doSomething();


