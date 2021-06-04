package sample;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import sample.Data.GetData;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;


public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("View/home.fxml"));
        stage.setTitle("Home");
        stage.setScene(new Scene(root,900,400));
        stage.setResizable(false);

        stage.show();
    }

    public static void main(String[] args)  {
        GetData getData = new GetData();




        // reading country populations
        getData.GetCountryPopulation();


        // reading Brand Values
        getData.GetBrandValue();


        // reading City Populations values
         getData.GetCityPopulations();





        launch(args);











    }
}
