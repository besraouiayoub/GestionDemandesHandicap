package uir.ac.gestionhandicape.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;

public class StatistiquesController extends AdminBaseController implements Initializable {

    @FXML private ComboBox<String> anneeCombo;
    @FXML private ComboBox<String> moisCombo;
    @FXML private ComboBox<String> typeCombo;
    
    @FXML private PieChart pieStatuts;
    @FXML private BarChart<String, Number> barAnnuel;
    @FXML private TableView<String> statsTable;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        anneeCombo.setItems(FXCollections.observableArrayList("2023", "2024", "2025", "2026"));
        moisCombo.setItems(FXCollections.observableArrayList("Tous", "Janvier", "Février", "Mars"));
        typeCombo.setItems(FXCollections.observableArrayList("Demandes", "Réclamations"));

        pieStatuts.getData().addAll(
            new PieChart.Data("En attente", 10),
            new PieChart.Data("Traitées", 45),
            new PieChart.Data("Rejetées", 5)
        );

        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName("Volume mensuel");
        series.getData().add(new XYChart.Data<>("Jan", 20));
        series.getData().add(new XYChart.Data<>("Fév", 25));
        barAnnuel.getData().add(series);
    }
}
