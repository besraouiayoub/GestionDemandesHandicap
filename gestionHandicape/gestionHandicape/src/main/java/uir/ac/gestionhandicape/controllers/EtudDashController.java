package uir.ac.gestionhandicape.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import uir.ac.gestionhandicape.model.Demande;
import uir.ac.gestionhandicape.model.EtudiantHandicape;
import uir.ac.gestionhandicape.model.Reclamation;
import uir.ac.gestionhandicape.model.TypeDemande;

public class EtudDashController extends BaseController implements Initializable {

    @FXML private Label avatarLabel;
    @FXML private Label nomEtudiantLabel;
    @FXML private Label numeroEtudiantLabel;
    
    @FXML private TextField topSearchField;
    
    @FXML private Label totalSoumises;
    @FXML private Label enAttenteCount;
    @FXML private Label traiteeCount;
    @FXML private Label notifCount;

    @FXML private TableView<Reclamation> reclamationsTable;
    @FXML private TableColumn<Reclamation, String> colRef;
    @FXML private TableColumn<Reclamation, String> colType;
    @FXML private TableColumn<Reclamation, String> colDate;
    @FXML private TableColumn<Reclamation, String> colStatut;

    @FXML private TableView<Demande> demandesTable;
    @FXML private TableColumn<Demande, String> colRef1;
    @FXML private TableColumn<Demande, String> colType1;
    @FXML private TableColumn<Demande, String> colDate1;
    @FXML private TableColumn<Demande, String> colStatut1;

    @FXML private ListView<String> notificationsList;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Infos étudiant simulées
        EtudiantHandicape etudiant = new EtudiantHandicape(1, "Amine", "Benali", "amine@uir.ac.ma", "123", "20230001", "Moteur");
        avatarLabel.setText("A");
        nomEtudiantLabel.setText(etudiant.getNom() + " " + etudiant.getPrenom());
        numeroEtudiantLabel.setText("N° " + etudiant.getMassar());

        // Statistiques
        totalSoumises.setText("5");
        enAttenteCount.setText("2");
        traiteeCount.setText("3");
        notifCount.setText("3");

        // Config Table Réclamations
        colRef.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getId())));
        colType.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getObjet()));
        colDate.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDateCreation().toString()));
        colStatut.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getStatut().name()));

        // Données Réclamations
        ObservableList<Reclamation> recData = FXCollections.observableArrayList();
        recData.add(new Reclamation(101, "Problème ascenseur", "L'ascenseur bâtiment B est en panne", etudiant));
        reclamationsTable.setItems(recData);

        // Config Table Demandes
        colRef1.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getId())));
        colType1.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getType().name()));
        colDate1.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDateCreation().toString()));
        colStatut1.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getStatut().name()));

        // Données Demandes
        ObservableList<Demande> demData = FXCollections.observableArrayList();
        demData.add(new Demande(201, "Tiers temps", "Demande de tiers temps", TypeDemande.AMENAGEMENT_EXAMEN, "Haute", etudiant));
        demandesTable.setItems(demData);

        // Notifications
        ObservableList<String> notifs = FXCollections.observableArrayList(
            "Votre demande #201 a été traitée.",
            "L'ascenseur bâtiment B est réparé.",
            "Rappel : Soumission des justificatifs médicaux."
        );
        notificationsList.setItems(notifs);
    }
}
