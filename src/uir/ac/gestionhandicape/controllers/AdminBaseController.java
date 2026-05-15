package uir.ac.gestionhandicape.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class AdminBaseController extends BaseController {

	@Override
	@FXML
	public void handleDashboard(ActionEvent event) {
		ouvrirVue(event, "AdmiDash.fxml");
	}

	@Override
	@FXML
	public void handleDemandes(ActionEvent event) {
		ouvrirVue(event, "AdminDemandes.fxml");
	}

	@Override
	@FXML
	public void handleReclamations(ActionEvent event) {
		ouvrirVue(event, "AdminReclamations.fxml");
	}

	@Override
	@FXML
	public void handleStats(ActionEvent event) {
		ouvrirVue(event, "Statistiques.fxml");
	}

	@Override
	@FXML
	public void handleStatistiques(ActionEvent event) {
		ouvrirVue(event, "Statistiques.fxml");
	}

	@Override
	@FXML
	public void handleEtudiants(ActionEvent event) {
		ouvrirVue(event, "AdminEtudiants.fxml");
	}
}
