package uir.ac.gestionhandicape.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ArchivageController extends AdminBaseController implements Initializable {

    @FXML private TextField searchField;
    @FXML private DatePicker dateDebutPicker;
    @FXML private DatePicker dateFinPicker;
    @FXML private ComboBox<String> typeArchiveCombo;

    @FXML private TableView<ArchiveMock> archivesTable;
    @FXML private TableColumn<ArchiveMock, String> colId;
    @FXML private TableColumn<ArchiveMock, String> colType;
    @FXML private TableColumn<ArchiveMock, String> colElement;
    @FXML private TableColumn<ArchiveMock, String> colDate;
    @FXML private TableColumn<ArchiveMock, String> colMotif;
    @FXML private TableColumn<ArchiveMock, String> colActions;

    // Classe interne pour remplacer le modèle manquant
    public static class ArchiveMock {
        private String id, type, element, date, motif;
        public ArchiveMock(String id, String type, String element, String date, String motif) {
            this.id = id; this.type = type; this.element = element; this.date = date; this.motif = motif;
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        typeArchiveCombo.setItems(FXCollections.observableArrayList("Tous", "Demande", "Réclamation", "Compte"));

        colId.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().id));
        colType.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().type));
        colElement.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().element));
        colDate.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().date));
        colMotif.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().motif));
        colActions.setCellValueFactory(cellData -> new SimpleStringProperty("Restaurer"));

        ObservableList<ArchiveMock> data = FXCollections.observableArrayList();
        data.add(new ArchiveMock("1", "Demande", "Demande #201", "2026-05-10", "Dossier clôturé"));
        archivesTable.setItems(data);
    }
}
