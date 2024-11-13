package progiipoo.bonvoyageapp.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminControlador {

    @FXML
    private Button btnCerrarSesion;

    @FXML
    private Button btnCrearAlojamiento;

    @FXML
    private Button btnCrearPaquete;

    @FXML
    private Button btnCrearSeguroDeVijae;

    @FXML
    private Button btnCrearVuelo;

    @FXML
    void onCerrarSesionClick(ActionEvent event) {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/progiipoo/bonvoyageapp/inicio.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    @FXML
    void onCrearAlojamientoClick(ActionEvent event) {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/progiipoo/bonvoyageapp/crearAlojamiento.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    @FXML
    void onCrearPaqueteClick(ActionEvent event) {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/progiipoo/bonvoyageapp/crearPaquete.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    @FXML
    void onCrearSeguroDeViajeClick(ActionEvent event) {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/progiipoo/bonvoyageapp/crearSeguro.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    @FXML
    void onCrearVueloClick(ActionEvent event) {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/progiipoo/bonvoyageapp/crearVuelo.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
