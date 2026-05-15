package uir.ac.gestionhandicape.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class AdminCreationCompteController extends AdminBaseController implements Initializable {

    @FXML private TextField nomField;
    @FXML private TextField emailField;
    @FXML private TextField numeroField;
    @FXML private ComboBox<String> handicapBox;
    @FXML private PasswordField passwordField;
    @FXML private PasswordField confirmPasswordField;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        handicapBox.setItems(FXCollections.observableArrayList("Visuel", "Auditif", "Moteur", "Mental", "Autre"));
    }

    @Override
    @FXML
    public void handleCreerCompte(ActionEvent event) {
        String nom = nomField.getText();
        String email = emailField.getText();
        String numero = numeroField.getText();
        String handicap = handicapBox.getValue();
        String pass = passwordField.getText();
        String confPass = confirmPasswordField.getText();

        if (nom.isEmpty() || email.isEmpty() || pass.isEmpty() || !pass.equals(confPass)) {
            System.out.println("Erreur: Vérifiez les champs et les mots de passe.");
            return;
        }

        System.out.println("Compte étudiant créé avec succès : " + nom);
        handleEtudiants(event);
    }
}
