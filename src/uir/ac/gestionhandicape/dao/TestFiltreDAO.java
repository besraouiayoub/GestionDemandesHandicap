package uir.ac.gestionhandicape.uir.ac.gestionhandicape.dao;

public class TestFiltreDAO {

    public static void main(String[] args) {

        FiltreDAO dao = new FiltreDAO();

        System.out.println("=== DEMANDES ===");

        dao.filtrerDemandesParStatut(
                "EN_ATTENTE"
        );

        System.out.println("=== RECLAMATIONS ===");

        dao.filtrerReclamationsParStatut(
                "SOUMISE"
        );
    }
}