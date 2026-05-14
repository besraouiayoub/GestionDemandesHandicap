package controllers;

public class AuthentificationController {
    private CompteService compteService; // Fait le lien avec la base de données

    public AuthentificationController() {
        this.compteService = new CompteService();
    }

    public Compte login(String email, String motDePasse) {
        Compte compte = compteService.trouverParEmail(email);
        if (compte != null && compte.getMotDePasse().equals(motDePasse) && compte.isActif()) {
            Session.setUtilisateurConnecte(compte);
            return compte;
        }
        throw new IllegalArgumentException("Identifiants incorrects ou compte inactif");
    }

    public void logout() {
        Session.clear();
    }
}
