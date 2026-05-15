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

public class NouvelleReclamationController extends BaseController implements Initializable {

    @FXML private TextField objetField;
    @FXML private ComboBox<String> typeCombo;
    @FXML private TextArea contenuArea;
    @FXML private TextField pieceJointeField;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        typeCombo.setItems(FXCollections.observableArrayList(
            "Problème technique", 
            "Comportement", 
            "Retard de traitement", 
            "Autre"
        ));
    }

    @Override
    @FXML
    public void handleEnvoyer(ActionEvent event) {
        String objet = objetField.getText();
        String type = typeCombo.getValue();
        String contenu = contenuArea.getText();

        if (objet.isEmpty() || type == null || contenu.isEmpty()) {
            System.out.println("Erreur: Veuillez remplir l'objet, le type et le contenu.");
            return;
        }

        System.out.println("Tentative d'ajout de réclamation en base...");
        uir.ac.gestionhandicape.dao.ReclamationDAO reclamationDAO = new uir.ac.gestionhandicape.dao.ReclamationDAO();
        boolean success = reclamationDAO.ajouterReclamation(objet, contenu, 1); // 1 = id compte par defaut
        
        if (success) {
            System.out.println("Nouvelle réclamation envoyée et enregistrée en base: " + objet);
        } else {
            System.out.println("Erreur lors de l'enregistrement en base de données.");
        }
        // Retour à la liste des réclamations
        handleReclamations(event);
    }
    
    @Override
    @FXML
    public void handleChoisirFichier(ActionEvent event) {
        System.out.println("Sélecteur de fichier ouvert pour réclamation...");
        pieceJointeField.setText("C:\\Users\\Amine\\Images\\capture_ecran.png");
    }
}
