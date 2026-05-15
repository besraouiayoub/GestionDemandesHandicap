package uir.ac.gestionhandicape.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import uir.ac.gestionhandicape.model.Demande;
import uir.ac.gestionhandicape.model.EtudiantHandicape;
import uir.ac.gestionhandicape.model.TypeDemande;

public class AdminDemandesController extends AdminBaseController implements Initializable {

    @FXML private TextField searchField;
    @FXML private ComboBox<String> filtreStatut;
    @FXML private ComboBox<String> filtreType;

    @FXML private TableView<Demande> adminDemandesTable;
    @FXML private TableColumn<Demande, String> colRef;
    @FXML private TableColumn<Demande, String> colEtudiant;
    @FXML private TableColumn<Demande, String> colType;
    @FXML private TableColumn<Demande, String> colDate;
    @FXML private TableColumn<Demande, String> colPriorite;
    @FXML private TableColumn<Demande, String> colStatut;
    @FXML private TableColumn<Demande, String> colActions;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialiser les filtres
        filtreStatut.setItems(FXCollections.observableArrayList("Tous", "En attente", "En cours", "Traitée", "Rejetée"));
        filtreType.setItems(FXCollections.observableArrayList("Tous", "Aménagement", "Assistance", "Accessibilité"));

        // Configurer les colonnes
        colRef.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getId())));
        colEtudiant.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEtudiant().getNom() + " " + cellData.getValue().getEtudiant().getPrenom()));
        colType.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getType().name()));
        colDate.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDateCreation().toString()));
        colPriorite.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getPriorite()));
        colStatut.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getStatut().name()));
        colActions.setCellValueFactory(cellData -> new SimpleStringProperty("Gérer"));

        // Données mockées
        ObservableList<Demande> data = FXCollections.observableArrayList();
        EtudiantHandicape e1 = new EtudiantHandicape(1, "Azhari", "Yahya", "yahya@uir.ac.ma", "123", "20230002", "Visuel");
        data.add(new Demande(1001, "Tiers temps", "Demande de tiers temps", TypeDemande.AMENAGEMENT_EXAMEN, "Haute", e1));
        
        adminDemandesTable.setItems(data);
        
        System.out.println("--- AFFICHAGE DES DEMANDES EN BASE DE DONNÉES ---");
        new uir.ac.gestionhandicape.dao.DemandeDAO().afficherDemandes();
    }
}
