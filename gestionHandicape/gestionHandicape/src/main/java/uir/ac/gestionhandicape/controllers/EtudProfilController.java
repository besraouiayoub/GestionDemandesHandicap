package uir.ac.gestionhandicape.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class EtudProfilController extends BaseController implements Initializable {

    @FXML private TextField nomField;
    @FXML private TextField prenomField;
    @FXML private TextField emailField;
    @FXML private TextField telephoneField;
    @FXML private ComboBox<String> typeHandicapCombo;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        typeHandicapCombo.setItems(FXCollections.observableArrayList("Moteur", "Visuel", "Auditif", "Autre"));
        
        // Données mockées
        nomField.setText("Benali");
        prenomField.setText("Amine");
        emailField.setText("amine@uir.ac.ma");
        typeHandicapCombo.setValue("Moteur");
    }

    @Override
    @FXML
    public void handleSaveProfile(ActionEvent event) {
        System.out.println("Profil Étudiant mis à jour : " + nomField.getText());
    }
}
