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
import uir.ac.gestionhandicape.model.EtudiantHandicape;
import uir.ac.gestionhandicape.model.Reclamation;

public class AdminReclamationsController extends AdminBaseController implements Initializable {

    @FXML private TextField searchField;
    @FXML private ComboBox<String> filtreStatut;
    @FXML private ComboBox<String> filtreType;

    @FXML private TableView<Reclamation> adminReclamationsTable;
    @FXML private TableColumn<Reclamation, String> colRef;
    @FXML private TableColumn<Reclamation, String> colEtudiant;
    @FXML private TableColumn<Reclamation, String> colType;
    @FXML private TableColumn<Reclamation, String> colDate;
    @FXML private TableColumn<Reclamation, String> colPriorite;
    @FXML private TableColumn<Reclamation, String> colStatut;
    @FXML private TableColumn<Reclamation, String> colActions;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        filtreStatut.setItems(FXCollections.observableArrayList("Tous", "Nouvelle", "En cours", "Résolue"));
        filtreType.setItems(FXCollections.observableArrayList("Tous", "Problème technique", "Insatisfaction", "Autre"));

        colRef.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getId())));
        colEtudiant.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEtudiant().getNom() + " " + cellData.getValue().getEtudiant().getPrenom()));
        colType.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getObjet()));
        colDate.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDateCreation().toString()));
        colPriorite.setCellValueFactory(cellData -> new SimpleStringProperty("Moyenne")); // Pas de priorité dans Reclamation par défaut
        colStatut.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getStatut().name()));
        colActions.setCellValueFactory(cellData -> new SimpleStringProperty("Traiter"));

        ObservableList<Reclamation> data = FXCollections.observableArrayList();
        EtudiantHandicape e1 = new EtudiantHandicape(1, "Azhari", "Yahya", "yahya@uir.ac.ma", "123", "20230002", "Visuel");
        data.add(new Reclamation(401, "Retard", "Le traitement de ma demande prend trop de temps.", e1));
        
        adminReclamationsTable.setItems(data);
        
        System.out.println("--- AFFICHAGE DES RÉCLAMATIONS EN BASE DE DONNÉES ---");
        new uir.ac.gestionhandicape.dao.ReclamationDAO().afficherReclamations();
    }
}
