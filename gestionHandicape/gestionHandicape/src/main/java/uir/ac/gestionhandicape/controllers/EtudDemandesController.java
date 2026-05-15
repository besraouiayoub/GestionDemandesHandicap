package uir.ac.gestionhandicape.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import uir.ac.gestionhandicape.model.Demande;
import uir.ac.gestionhandicape.model.EtudiantHandicape;
import uir.ac.gestionhandicape.model.TypeDemande;

public class EtudDemandesController extends BaseController implements Initializable {

    @FXML private Label avatarLabel;
    @FXML private Label nomEtudiantLabel;
    @FXML private Label numeroEtudiantLabel;
    @FXML private TextField topSearchField;

    @FXML private Label totalDemandes;
    @FXML private Label enAttenteCount;
    @FXML private Label accepteesCount;
    @FXML private Label refuseesCount;

    @FXML private TextField searchField;
    @FXML private ComboBox<String> typeFilter;
    @FXML private ComboBox<String> statutFilter;

    @FXML private TableView<Demande> demandesTable;
    @FXML private TableColumn<Demande, String> colRef;
    @FXML private TableColumn<Demande, String> colType;
    @FXML private TableColumn<Demande, String> colDescription;
    @FXML private TableColumn<Demande, String> colDate;
    @FXML private TableColumn<Demande, String> colStatut;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        avatarLabel.setText("A");
        nomEtudiantLabel.setText("Amine Benali");
        numeroEtudiantLabel.setText("N° 20230001");

        totalDemandes.setText("12");
        enAttenteCount.setText("3");
        accepteesCount.setText("8");
        refuseesCount.setText("1");

        typeFilter.setItems(FXCollections.observableArrayList("Tous", "Aménagement", "Assistance"));
        statutFilter.setItems(FXCollections.observableArrayList("Tous", "En attente", "Traitée"));

        colRef.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getId())));
        colType.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getType().name()));
        colDescription.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDescription()));
        colDate.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDateCreation().toString()));
        colStatut.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getStatut().name()));

        ObservableList<Demande> data = FXCollections.observableArrayList();
        EtudiantHandicape etud = new EtudiantHandicape(1, "Benali", "Amine", "amine@uir.ac.ma", "123", "20230001", "Moteur");
        data.add(new Demande(201, "Tiers temps", "Demande de tiers temps", TypeDemande.AMENAGEMENT_EXAMEN, "Moyenne", etud));
        demandesTable.setItems(data);
        
        System.out.println("--- AFFICHAGE DES DEMANDES DE L'ÉTUDIANT EN BASE DE DONNÉES ---");
        new uir.ac.gestionhandicape.dao.DemandeDAO().afficherDemandes();
    }
}
