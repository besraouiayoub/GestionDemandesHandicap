package uir.ac.gestionhandicape.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import uir.ac.gestionhandicape.model.EtudiantHandicape;

public class AdminEtudiantsController extends AdminBaseController implements Initializable {

    @FXML private TextField searchField;
    @FXML private TableView<EtudiantHandicape> etudiantsTable;
    @FXML private TableColumn<EtudiantHandicape, String> colNumero;
    @FXML private TableColumn<EtudiantHandicape, String> colNom;
    @FXML private TableColumn<EtudiantHandicape, String> colPrenom;
    @FXML private TableColumn<EtudiantHandicape, String> colEmail;
    @FXML private TableColumn<EtudiantHandicape, String> colStatut;
    @FXML private TableColumn<EtudiantHandicape, String> colAction;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        colNumero.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMassar()));
        colNom.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNom()));
        colPrenom.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getPrenom()));
        colEmail.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEmail()));
        colStatut.setCellValueFactory(cellData -> new SimpleStringProperty("Actif"));
        colAction.setCellValueFactory(cellData -> new SimpleStringProperty("Gérer"));

        ObservableList<EtudiantHandicape> data = FXCollections.observableArrayList();
        data.add(new EtudiantHandicape(1, "Azhari", "Yahya", "yahya@uir.ac.ma", "123", "20230002", "Visuel"));
        data.add(new EtudiantHandicape(2, "Benali", "Amine", "amine@uir.ac.ma", "123", "20230001", "Moteur"));
        
        etudiantsTable.setItems(data);
    }
}
