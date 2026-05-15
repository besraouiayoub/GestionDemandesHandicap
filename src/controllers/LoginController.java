package uir.ac.gestionhandicape.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;

public class LoginController {

    @FXML private TextField emailField;
    @FXML private PasswordField passwordField;
    @FXML private Label errorLabel;

    @FXML
    public void initialize() {
        if (errorLabel != null) {
            errorLabel.setVisible(false);
        }
    }

    // Appelé par le bouton "Se connecter" (onAction)
    @FXML
    private void handleLogin(ActionEvent event) {
        String email = emailField.getText().trim();
        String password = passwordField.getText().trim();

        if (email.isEmpty() || password.isEmpty()) {
            showError("Veuillez remplir tous les champs.");
            return;
        }

        if (!email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
            showError("Adresse e-mail invalide.");
            return;
        }

        if (authenticate(email, password)) {
            navigateWithAction(event, "/vue/AdmiDash.fxml");
        } else {
            showError("Email ou mot de passe incorrect.");
        }
    }

    // Appelé par le Label "S'inscrire" (onMouseClicked)
    @FXML
    private void handleGoToRegister(MouseEvent event) {
        navigateWithMouse(event, "/vue/SignUp.fxml");
    }

    // ----------------------------------------------------------------
    //  Méthodes utilitaires
    // ----------------------------------------------------------------

    private boolean authenticate(String email, String password) {
        // TODO: remplacer par une vraie vérification base de données
        return email.equals("admin@uir.ac.ma") && password.equals("1234");
    }

    private void showError(String message) {
        if (errorLabel != null) {
            errorLabel.setText(message);
            errorLabel.setVisible(true);
        }
    }

    private void navigateWithAction(ActionEvent event, String fxmlPath) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
            Parent root = loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
            showError("Erreur de navigation : " + e.getMessage());
        }
    }

    private void navigateWithMouse(MouseEvent event, String fxmlPath) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
            Parent root = loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
            showError("Erreur de navigation : " + e.getMessage());
        }
    }
}
