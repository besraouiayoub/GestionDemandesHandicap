package uir.ac.gestionhandicape.dao;

public class TestRapportDAO {

    public static void main(String[] args) {

        RapportDAO dao = new RapportDAO();

        boolean ok = dao.ajouterRapport(
                "Rapport mensuel",
                "PDF",
                "C:/rapports/rapport_mensuel.pdf",
                1
        );

        if (ok) {
            System.out.println("Rapport ajouté !");
        } else {
            System.out.println("Erreur ajout rapport !");
        }
    }
}