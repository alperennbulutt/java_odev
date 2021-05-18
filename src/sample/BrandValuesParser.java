package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BrandValuesParser {

    Scanner scanner;

    public void openFileBrand(){
        try {
            scanner=new Scanner(new File("brand_values.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Dosya Bulunamadı!");
        }

    }

    public void readFileBrand(){
        while (scanner.hasNextLine()){

            String date= scanner.next();
            String brand=scanner.next();
            String country=scanner.next();
            String value= scanner.next();
            String department=scanner.next();

            System.out.println(date + "  " + brand + "  " + country + "  " +  value + "  " + department);

        }

    }

    public void closeFileBrand(){
        scanner.close();

    }
}
