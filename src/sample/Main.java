package sample;

import javafx.application.Application;
import javafx.stage.Stage;



public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{

    }


        public static void main(String[] args)  {

             BrandValuesParser brandValues=new BrandValuesParser();
             CityPopulationsParser cityPopulation=new CityPopulationsParser();

             brandValues.openFileBrand();
             brandValues.readFileBrand();
             brandValues.closeFileBrand();

             cityPopulation.openFileCity();
             cityPopulation.readFileCity();
             cityPopulation.closeFileCity();
        }


    }


