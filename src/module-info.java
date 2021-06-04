module java.odev {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.xml;
    requires  java.base;
    opens sample;
    opens sample.View;
    opens sample.Data;
    opens sample.Model;
    opens sample.Controller;
}