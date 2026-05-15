package uir.ac.gestionhandicape.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import uir.ac.gestionhandicape.model.EtudiantHandicape;
import uir.ac.gestionhandicape.model.Reclamation;

public class EtudReclamationsController extends BaseController implements Initializable {

    @FXML private Label avatarLabel;
    @FXML private Label nomEtudiantLabel;
    @FXML private Label numeroEtudiantLabel;
    
    @FXML private TextField searchField;
    
    @FXML private Label statTotal;
    @FXML private Label statAttente;
    @FXML private Label statResolues;
    @FXML private Label statRejetees;

    @FXML private Button filtreAll;
    @FXML private Button filtreAttente;
    @FXML private Button filtreResolues;
    @FXML private Button filtreRejetees;
    @FXML private ComboBox<String> filtreType;

    @FXML private TableView<Reclamation> reclamationsTable;
    @FXML private TableColumn<Reclamation, String> colRef;
    @FXML private TableColumn<Reclamation, String> colType;
    @FXML private TableColumn<Reclamation, String> colDescription;
    @FXML private TableColumn<Reclamation, String> colDate;
    @FXML private TableColumn<Reclamation, String> colStatut;
    @FXML private TableColumn<Reclamation, String> colActions;

    @FXML private Label paginationInfo;
    @FXML private Button btnPrevPage;
    @FXML private Button btnPage1;
    @FXML private Button btnPage2;
    @FXML private Button btnNextPage;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        avatarLabel.setText("A");
        nomEtudiantLabel.setText("Amine Benali");
        numeroEtudiantLabel.setText("N° 20230001");

        statTotal.setText("3");
        statAttente.setText("2");
        statResolues.setText("1");
        statRejetees.setText("0");

        filtreType.setItems(FXCollections.observableArrayList("Tous", "Problème", "Question"));

        colRef.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getId())));
        colType.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getObjet()));
        colDescription.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getContenu()));
        colDate.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDateCreation().toString()));
        colStatut.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getStatut().name()));
        colActions.setCellValueFactory(cellData -> new SimpleStringProperty("Voir"));

        ObservableList<Reclamation> data = FXCollections.observableArrayList();
        EtudiantHandicape e1 = new EtudiantHandicape(1, "Benali", "Amine", "amine@uir.ac.ma", "123", "20230001", "Moteur");
        data.add(new Reclamation(501, "Comportement", "Le personnel a été désagréable.", e1));
        
        reclamationsTable.setItems(data);
        
        System.out.println("--- AFFICHAGE DES RÉCLAMATIONS DE L'ÉTUDIANT EN BASE DE DONNÉES ---");
        new uir.ac.gestionhandicape.dao.ReclamationDAO().afficherReclamations();
    }
}
