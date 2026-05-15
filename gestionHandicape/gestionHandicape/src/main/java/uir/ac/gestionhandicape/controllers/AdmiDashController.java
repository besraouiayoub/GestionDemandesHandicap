package uir.ac.gestionhandicape.controllers;

import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import uir.ac.gestionhandicape.model.EtudiantHandicape;
import uir.ac.gestionhandicape.model.Reclamation;

public class AdmiDashController extends AdminBaseController implements Initializable {

    @FXML private Label dateLabel;
    @FXML private Label totalLabel;
    @FXML private Label enAttenteLabel;
    @FXML private Label traiteeLabel;
    @FXML private Label rejeteeLabel;
    @FXML private Label etudiantLabel;

    @FXML private TableView<Reclamation> reclamationsTable;
    @FXML private TableColumn<Reclamation, String> colId;
    @FXML private TableColumn<Reclamation, String> colEtudiant;
    @FXML private TableColumn<Reclamation, String> colType;
    @FXML private TableColumn<Reclamation, String> colDate;
    @FXML private TableColumn<Reclamation, String> colStatut;
    @FXML private TableColumn<Reclamation, String> colAction;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialiser la date du jour
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        dateLabel.setText(LocalDate.now().format(formatter));

        // Statistiques simulées
        totalLabel.setText("128");
        enAttenteLabel.setText("34");
        traiteeLabel.setText("89");
        rejeteeLabel.setText("5");
        etudiantLabel.setText("247");

        // Configuration des colonnes
        colId.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getId())));
        colEtudiant.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEtudiant() != null ? cellData.getValue().getEtudiant().getNom() : "Inconnu"));
        colType.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getObjet()));
        colDate.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDateCreation().toString()));
        colStatut.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getStatut().name()));
        colAction.setCellValueFactory(cellData -> new SimpleStringProperty("Voir")); // Simulation d'un bouton

        // Données simulées
        ObservableList<Reclamation> mockData = FXCollections.observableArrayList();
        EtudiantHandicape e1 = new EtudiantHandicape(1, "Bennani", "Ali", "ali@uir.ac.ma", "123", "20230001", "Visuel");
        Reclamation r1 = new Reclamation(1, "Accès Rampe", "Rampe bloquée", e1);
        mockData.add(r1);

        reclamationsTable.setItems(mockData);
    }
}
