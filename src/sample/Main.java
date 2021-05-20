package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Button btOK = new Button("OK");
        Scene scene = new Scene(btOK, 200, 250);
        stage.setTitle(" First JavaFX GUI"); // Set the stage title
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); // Display the stage

    }



    public static void main(String[] args) throws IOException {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("brand_values.txt"))) {

            String line = null;

            String specialCharacter = ",";

            List<BrandValuesParser> brandValues = new ArrayList<>();

            while ((line = bufferedReader.readLine()) != null) {

                //System.out.println(line);

                String[] values = line.split(specialCharacter);

                BrandValuesParser valuesBrand=new BrandValuesParser();

               // valuesBrand.setValue(Integer.parseInt(values[3]));

                //valuesBrand.setDate(Integer.parseInt(values[0]));
                //valuesBrand.setBrand((values[1]));
                //valuesBrand.setCountry((values[2]));
                //valuesBrand.setValue(Integer.parseInt(values[3]));
                //valuesBrand.setDepartment((values[4]));

                String date=valuesBrand.setDate(values[0]);
                String brand=valuesBrand.setBrand(values[1]);
                String country=valuesBrand.setCountry(values[2]);
                String value=valuesBrand.setBrand(values[3]);
                String department=valuesBrand.setDepartment(values[4]);
                System.out.println(brand);


            }

        }

    }
}


