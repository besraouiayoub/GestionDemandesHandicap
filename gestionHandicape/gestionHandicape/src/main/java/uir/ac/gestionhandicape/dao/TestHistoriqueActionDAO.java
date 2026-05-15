package uir.ac.gestionhandicape.dao;

public class TestHistoriqueActionDAO {

    public static void main(String[] args) {

        HistoriqueActionDAO dao =
                new HistoriqueActionDAO();

        boolean ok =
                dao.ajouterAction(
                        "MODIFICATION",
                        "Modification de la réclamation",
                        1,
                        1
                );

        if (ok) {

            System.out.println(
                    "Historique ajouté !"
            );

        } else {

            System.out.println(
                    "Erreur ajout historique !"
            );
        }

        dao.afficherHistorique();
    }
}