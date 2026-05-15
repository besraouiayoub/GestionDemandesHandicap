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
import javafx.scene.control.DatePicker;

public class AdminStatsController extends AdminBaseController implements Initializable {

    @FXML private ComboBox<String> typeFilter;
    @FXML private DatePicker dateDebut;
    @FXML private DatePicker dateFin;
    @FXML private PieChart statutPieChart;
    @FXML private BarChart<String, Number> barChart;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        typeFilter.setItems(FXCollections.observableArrayList("Tous", "Demandes", "Réclamations"));

        // Données PieChart
        PieChart.Data slice1 = new PieChart.Data("Résolues", 30);
        PieChart.Data slice2 = new PieChart.Data("En attente", 15);
        PieChart.Data slice3 = new PieChart.Data("Rejetées", 5);
        statutPieChart.getData().addAll(slice1, slice2, slice3);

        // Données BarChart
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName("Demandes");
        series.getData().add(new XYChart.Data<>("Jan", 10));
        series.getData().add(new XYChart.Data<>("Fév", 15));
        series.getData().add(new XYChart.Data<>("Mar", 8));
        barChart.getData().add(series);
    }
}
