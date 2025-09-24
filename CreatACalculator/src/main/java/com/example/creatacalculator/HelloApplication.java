package com.example.creatacalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            final FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/com/example/creatacalculator/Calculator.fxml"));
            loader.setController(new Controller());
            final Parent root = loader.load();

            final Scene scene = new Scene(root,200, 300);
            primaryStage.setTitle("Calculator");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
