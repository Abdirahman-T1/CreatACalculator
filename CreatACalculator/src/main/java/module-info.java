module com.example.creatacalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.creatacalculator to javafx.fxml;
    exports com.example.creatacalculator;
}