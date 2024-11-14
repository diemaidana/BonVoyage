package progiipoo.bonvoyageapp.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import progiipoo.bonvoyageapp.controller.sesionCliente.SesionClienteController;
import progiipoo.bonvoyageapp.model.usuarios.Usuario;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class GestorEscenas implements Initializable {
    private Parent root;
    private Stage stage;
    private Scene scene;

    public static void abrirEscena(ActionEvent event, String archivo){
        try{
            Parent root = FXMLLoader.load(GestorEscenas.class.getResource(archivo));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void abrirEscena(ActionEvent event, String archivo, Usuario u){
        try{
            FXMLLoader loader = new FXMLLoader(GestorEscenas.class.getResource(archivo));
            Parent root = loader.load();

            SesionClienteController sesion = loader.getController();

            sesion.setUsuario(u);

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        }catch(IOException e){
            e.printStackTrace();
            e.getCause();
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
