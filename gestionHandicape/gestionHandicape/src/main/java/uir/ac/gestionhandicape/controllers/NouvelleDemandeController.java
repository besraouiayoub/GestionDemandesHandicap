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
import uir.ac.gestionhandicape.model.TypeDemande;

public class NouvelleDemandeController extends BaseController implements Initializable {

    @FXML private ComboBox<String> typeDemandeCombo;
    @FXML private TextField objetField;
    @FXML private ComboBox<String> prioriteCombo;
    @FXML private TextArea descriptionArea;
    @FXML private TextField pieceJointeField;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        typeDemandeCombo.setItems(FXCollections.observableArrayList(
            TypeDemande.AMENAGEMENT_EXAMEN.name(),
            TypeDemande.ASSISTANCE_PEDAGOGIQUE.name(),
            TypeDemande.ACCESSIBILITE_INFRASTRUCTURE.name(),
            TypeDemande.AUTRE.name()
        ));
        
        prioriteCombo.setItems(FXCollections.observableArrayList("Basse", "Moyenne", "Haute", "Urgente"));
    }

    @Override
    @FXML
    public void handleSubmitDemande(ActionEvent event) {
        String type = typeDemandeCombo.getValue();
        String objet = objetField.getText();
        String priorite = prioriteCombo.getValue();
        String description = descriptionArea.getText();
        String pieceJointe = pieceJointeField.getText();

        if (type == null || objet.isEmpty() || priorite == null || description.isEmpty()) {
            System.out.println("Erreur: Veuillez remplir tous les champs obligatoires.");
            return;
        }

        System.out.println("Tentative d'ajout de demande en base...");
        uir.ac.gestionhandicape.dao.DemandeDAO demandeDAO = new uir.ac.gestionhandicape.dao.DemandeDAO();
        boolean success = demandeDAO.ajouterDemande(objet, description, type, 1); // 1 = id etudiant par défaut
        
        if(success) {
            System.out.println("Nouvelle demande soumise avec succès en base de données: " + objet);
        } else {
            System.out.println("Échec de l'insertion en base de données.");
        }
        
        // Redirection après soumission
        handleDemandes(event);
    }
    
    @Override
    @FXML
    public void handleChooseFile(ActionEvent event) {
        System.out.println("Ouverture du sélecteur de fichier...");
        pieceJointeField.setText("C:\\Users\\Amine\\Documents\\certificat_medical.pdf");
    }
}
