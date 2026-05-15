package uir.ac.gestionhandicape.uir.ac.gestionhandicape.dao;

public class TestReclamationDAO {

    public static void main(String[] args) {

        ReclamationDAO dao = new ReclamationDAO();

        boolean ok = dao.ajouterReclamation(
                "Problème accessibilité",
                "La salle n'est pas accessible facilement.",
                1
        );

        if (ok) {
            System.out.println("Réclamation ajoutée !");
        } else {
            System.out.println("Erreur ajout réclamation !");
        }

        dao.afficherReclamations();
    }
}