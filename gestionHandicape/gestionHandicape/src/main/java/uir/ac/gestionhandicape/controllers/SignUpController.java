package uir.ac.gestionhandicape.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;

public class SignUpController extends BaseController implements Initializable {

	@Override
	public void initialize(URL url, ResourceBundle rb) {
	}

	@FXML
	private void handleRegister(ActionEvent event) {
		ouvrirVue(event, "Login.fxml");
	}

	@FXML
	private void handleAideAdmin(MouseEvent event) {
		System.out.println("Veuillez contacter l'administrateur UIR.");
	}

	@FXML
	private void handleGoToLogin(MouseEvent event) {
		ouvrirVue(event, "Login.fxml");
	}
}
