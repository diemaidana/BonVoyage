package progiipoo.bonvoyageapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class BonVoyageApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(BonVoyageApplication.class.getResource("inicio.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 650);
        stage.setTitle("Bon Voyage!");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}