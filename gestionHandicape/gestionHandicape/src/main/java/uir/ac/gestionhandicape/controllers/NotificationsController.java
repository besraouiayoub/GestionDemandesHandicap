package uir.ac.gestionhandicape.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

public class NotificationsController extends BaseController implements Initializable {

    @FXML private ListView<String> notificationsList;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> data = FXCollections.observableArrayList(
            "Votre demande de tiers temps a été validée.",
            "Nouveau document requis pour la réclamation #501.",
            "Bienvenue sur l'espace étudiant."
        );
        notificationsList.setItems(data);
    }

    @Override
    @FXML
    public void handleToutMarquerLu(ActionEvent event) {
        System.out.println("Toutes les notifications marquées comme lues.");
    }
    
    @Override
    @FXML
    public void handleActualiser(ActionEvent event) {
        System.out.println("Actualisation des notifications...");
    }
}
