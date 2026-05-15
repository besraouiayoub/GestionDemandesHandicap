package uir.ac.gestionhandicape.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ProfilController extends BaseController implements Initializable {

    @FXML private TextField nomField;
    @FXML private TextField prenomField;
    @FXML private TextField emailField;
    @FXML private TextField telephoneField;
    @FXML private TextField filiereField;
    @FXML private TextField niveauField;
    @FXML private ComboBox<String> handicapCombo;
    @FXML private TextField numeroField;
    @FXML private TextArea adresseArea;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        handicapCombo.setItems(FXCollections.observableArrayList("Moteur", "Visuel", "Auditif", "Autre"));
        
        // Charger données mockées
        nomField.setText("Benali");
        prenomField.setText("Amine");
        emailField.setText("amine@uir.ac.ma");
        numeroField.setText("20230001");
        handicapCombo.setValue("Moteur");
    }

    @Override
    @FXML
    public void handleSaveProfile(ActionEvent event) {
        System.out.println("Profil mis à jour : " + nomField.getText());
    }

    @Override
    @FXML
    public void handleChangePassword(ActionEvent event) {
        System.out.println("Changement de mot de passe...");
    }
}
