package progiipoo.bonvoyageapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class BonVoyageApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(BonVoyageApplication.class.getResource("inicio.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 650);
        stage.setTitle("BonVoyage!");
        Image icon = new Image(getClass().getResourceAsStream("/images/Bon Voyage Logo Avion.png"));
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}