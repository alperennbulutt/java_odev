package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CityPopulationsParser {
    Scanner scanner;

    public void openFileCity(){
        try {
            scanner=new Scanner(new File("city_populations.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Dosya Bulunamadı!");
        }

    }

    public void readFileCity(){
        while (scanner.hasNextLine()){

            String year= scanner.nextLine();
            String city=scanner.nextLine();
            String country=scanner.nextLine();
            String population= scanner.nextLine();
            String continent=scanner.nextLine();

            System.out.println(year +  city + country  + population + continent);

        }

    }

    public void closeFileCity(){
        scanner.close();

    }
}
