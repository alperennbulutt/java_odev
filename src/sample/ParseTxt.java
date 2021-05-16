package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ParseTxt {

    Scanner scanner;

    public void openFile(){
        try {
            scanner=new Scanner(new File("brand_values.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Dosya Bulunamadı!");
        }

    }

    public void readFile(){
        while (scanner.hasNext()){

            int date= Integer.parseInt(scanner.next());
            String brand=scanner.next();
            String country=scanner.next();
            int value= Integer.parseInt(scanner.next());
            String department=scanner.next();

            System.out.println(date + " "+  brand + " " + country +" " + value +" " +department);

        }

    }

    public void closeFile(){
        scanner.close();

    }
}
