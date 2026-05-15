package uir.ac.gestionhandicape.controllers;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BaseController {

	protected void ouvrirVue(Event event, String vue) {
		if (!(event.getSource() instanceof Node)) {
			return;
		}

		try {
			Node source = (Node) event.getSource();
			Parent root = FXMLLoader.load(getClass().getResource("/vue/" + vue));
			Stage stage = (Stage) source.getScene().getWindow();
			stage.setScene(new Scene(root));
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FXML
	public void handleDashboard(ActionEvent event) {
		ouvrirVue(event, "EtudDash.fxml");
	}

	@FXML
	public void handleDemandes(ActionEvent event) {
		ouvrirVue(event, "EtudDemandes.fxml");
	}

	@FXML
	public void handleReclamations(ActionEvent event) {
		ouvrirVue(event, "EtudReclamationsDash.fxml");
	}

	@FXML
	public void handleProfil(ActionEvent event) {
		ouvrirVue(event, "MonProfil.fxml");
	}

	@FXML
	public void handleNouvelleDemande(ActionEvent event) {
		ouvrirVue(event, "NouvelleDemande.fxml");
	}

	@FXML
	public void handleNouvelleReclamation(ActionEvent event) {
		ouvrirVue(event, "NouvelleReclamation.fxml");
	}

	@FXML
	public void handleNotifications(ActionEvent event) {
		ouvrirVue(event, "Notifications.fxml");
	}

	@FXML
	public void handleStats(ActionEvent event) {
		ouvrirVue(event, "Statistiques.fxml");
	}

	@FXML
	public void handleStatistiques(ActionEvent event) {
		ouvrirVue(event, "Statistiques.fxml");
	}

	@FXML
	public void handleArchives(ActionEvent event) {
		ouvrirVue(event, "Archivage.fxml");
	}

	@FXML
	public void handleComptes(ActionEvent event) {
		ouvrirVue(event, "AdminCreationCompte.fxml");
	}

	@FXML
	public void handleEtudiants(ActionEvent event) {
		ouvrirVue(event, "AdminEtudiants.fxml");
	}

	@FXML
	public void handleCreationCompte(ActionEvent event) {
		ouvrirVue(event, "AdminCreationCompte.fxml");
	}

	@FXML
	public void handleLogout(ActionEvent event) {
		ouvrirVue(event, "Login.fxml");
	}

	@FXML
	public void handleSoumettre(ActionEvent event) {
		handleNouvelleDemande(event);
	}

	@FXML
	public void handleNouvelle(ActionEvent event) {
		handleNouvelleDemande(event);
	}

	@FXML
	public void handleOpenForm(ActionEvent event) {
		handleNouvelleReclamation(event);
	}

	@FXML public void handleSearch(ActionEvent event) {}
	@FXML public void handleAjouter(ActionEvent event) {}
	@FXML public void handleModifier(ActionEvent event) {}
	@FXML public void handleSupprimer(ActionEvent event) {}
	@FXML public void handleVoir(ActionEvent event) {}
	@FXML public void handleSave(ActionEvent event) {}
	@FXML public void handleSaveProfile(ActionEvent event) {}
	@FXML public void handleChangePassword(ActionEvent event) {}
	@FXML public void handleChooseFile(ActionEvent event) {}
	@FXML public void handleChoisirFichier(ActionEvent event) {}
	@FXML public void handleReset(ActionEvent event) {}
	@FXML public void handleSubmitDemande(ActionEvent event) {}
	@FXML public void handleAnnuler(ActionEvent event) {}
	@FXML public void handleEnvoyer(ActionEvent event) {}
	@FXML public void handleCreerCompte(ActionEvent event) {}
	@FXML public void handleFiltrer(ActionEvent event) {}
	@FXML public void handleExporter(ActionEvent event) {}
	@FXML public void handleGeneratePdf(ActionEvent event) {}
	@FXML public void handleAccept(ActionEvent event) {}
	@FXML public void handleReject(ActionEvent event) {}
	@FXML public void handlePending(ActionEvent event) {}
	@FXML public void handleResolve(ActionEvent event) {}
	@FXML public void handleInProgress(ActionEvent event) {}
	@FXML public void handleRestore(ActionEvent event) {}
	@FXML public void handleDeleteArchive(ActionEvent event) {}
	@FXML public void handleExportArchives(ActionEvent event) {}
	@FXML public void handleToutMarquerLu(ActionEvent event) {}
	@FXML public void handleActualiser(ActionEvent event) {}
	@FXML public void handleFiltreAll(ActionEvent event) {}
	@FXML public void handleFiltreAttente(ActionEvent event) {}
	@FXML public void handleFiltreResolues(ActionEvent event) {}
	@FXML public void handleFiltreRejetees(ActionEvent event) {}
	@FXML public void handlePrevPage(ActionEvent event) {}
	@FXML public void handlePage1(ActionEvent event) {}
	@FXML public void handlePage2(ActionEvent event) {}
	@FXML public void handleNextPage(ActionEvent event) {}
}
