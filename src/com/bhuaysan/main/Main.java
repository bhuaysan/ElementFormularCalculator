package com.bhuaysan.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * This application calculates the chemical formula of a mineral from the
 * weight percent of the oxides measured with EMP or XRF.
 *
 * TODO 1.: replace labels with TableView
 * TODO 2.: implement CSV-Export with filehandler class.
 */

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/layout.fxml"));
        primaryStage.setTitle("Mineral Formula Calculator");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
