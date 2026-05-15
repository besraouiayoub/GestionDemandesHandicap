package uir.ac.gestionhandicape.uir.ac.gestionhandicape.dao;

public class TestDemandeDAO {

    public static void main(String[] args) {

        DemandeDAO dao =
                new DemandeDAO();

        boolean ok =
                dao.ajouterDemande(
                        "Demande transport",
                        "Besoin de transport adapté",
                        "TRANSPORT",
                        1
                );

        if (ok) {

            System.out.println(
                    "Demande ajoutée !"
            );

        } else {

            System.out.println(
                    "Erreur ajout demande !"
            );
        }

        dao.afficherDemandes();
    }
}