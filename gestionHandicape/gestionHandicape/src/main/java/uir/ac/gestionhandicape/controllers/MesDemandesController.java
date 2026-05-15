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

public class MesDemandesController extends BaseController implements Initializable {

    @FXML private TextField searchField;
    @FXML private Label statTotal;
    @FXML private Label statAttente;
    @FXML private Label statAcceptees;
    @FXML private Label statRefusees;

    @FXML private ComboBox<String> filtreStatut;
    @FXML private ComboBox<String> filtreType;

    @FXML private TableView<Demande> demandesTable;
    @FXML private TableColumn<Demande, String> colRef;
    @FXML private TableColumn<Demande, String> colType;
    @FXML private TableColumn<Demande, String> colObjet;
    @FXML private TableColumn<Demande, String> colDate;
    @FXML private TableColumn<Demande, String> colStatut;
    @FXML private TableColumn<Demande, String> colActions;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        statTotal.setText("5");
        statAttente.setText("1");
        statAcceptees.setText("4");
        statRefusees.setText("0");

        filtreStatut.setItems(FXCollections.observableArrayList("Tous", "En attente", "Traitée"));
        filtreType.setItems(FXCollections.observableArrayList("Tous", "Aménagement", "Assistance"));

        colRef.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getId())));
        colType.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getType().name()));
        colObjet.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTitre()));
        colDate.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDateCreation().toString()));
        colStatut.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getStatut().name()));
        colActions.setCellValueFactory(cellData -> new SimpleStringProperty("Voir"));

        ObservableList<Demande> data = FXCollections.observableArrayList();
        EtudiantHandicape etud = new EtudiantHandicape(1, "Amine", "Benali", "amine@uir.ac.ma", "123", "20230001", "Moteur");
        data.add(new Demande(301, "Aide matérielle", "Fauteuil", TypeDemande.ACCESSIBILITE_INFRASTRUCTURE, "Haute", etud));
        demandesTable.setItems(data);
        
        System.out.println("--- AFFICHAGE DE MES DEMANDES EN BASE DE DONNÉES ---");
        new uir.ac.gestionhandicape.dao.DemandeDAO().afficherDemandes();
    }
}
