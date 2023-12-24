import com.example.autopark.mark.kia.model.Cerato;
import com.example.autopark.mark.ford.model.Focus;
import com.example.autopark.mark.hyundai.model.Sonata;
import com.example.autopark.mark.ford.model.Explorer;
import com.example.autopark.Auto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

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
                while ((c = reader.read()) != -1){
                    sb.append((char) c);
            }
                reader.close();
            } catch (IOException e){
                throw new RuntimeException(e);
            }
            return sb.toString().split(newLine);
        }

        public static void main (String[]args){
//  SCANNER
//        String[] data = readFileUsingScanner(FILE_NAME);
            String[] data = readFileUsingFileReader(FILE_NAME);
            for (int i = 1; i < data.length; i++) {
                var pieces = data[i].split(";");
                Auto auto = null;
                switch (pieces[1]) {
                    case "Cerato":
                        auto = new Cerato(pieces[3], Integer.parseInt(pieces[4]), Integer.parseInt(pieces[5]),
                                Integer.parseInt(pieces[6]), pieces[9]);
                        break;
                    case "Focus":
                        auto = new Focus(pieces[3], Integer.parseInt(pieces[4]), Integer.parseInt(pieces[5]),
                                Integer.parseInt(pieces[6]), pieces[9]);
                        break;
                    case "Sonata":
                        auto = new Sonata(pieces[3], Integer.parseInt(pieces[4]), Integer.parseInt(pieces[5]),
                                Integer.parseInt(pieces[6]), pieces[9]);
                        break;
                    case "Explorer":
                        auto = new Explorer(pieces[3], Integer.parseInt(pieces[4]), Integer.parseInt(pieces[5]),
                                Integer.parseInt(pieces[6]), pieces[9]);
                        break;
                }
                System.out.println("Сar available: " + auto);
            }
        }

    }