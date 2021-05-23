module java.odev {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    opens sample;
    opens sample.View;
    opens sample.Data;
    opens sample.Model;
    opens sample.Controller;
}