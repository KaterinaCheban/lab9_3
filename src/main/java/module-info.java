module com.example.nesterenko_lr9_2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.desktop;

    opens com.example.lab9_3 to javafx.fxml;
    exports com.example.lab9_3;
}