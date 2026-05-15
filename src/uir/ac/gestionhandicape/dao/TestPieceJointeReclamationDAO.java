package uir.ac.gestionhandicape.uir.ac.gestionhandicape.dao;

public class TestPieceJointeReclamationDAO {

    public static void main(String[] args) {

        PieceJointeReclamationDAO dao =
                new PieceJointeReclamationDAO();

        boolean ok =
                dao.ajouterPieceJointe(
                        "preuve.pdf",
                        "application/pdf",
                        150000,
                        "C:/documents/preuve.pdf",
                        1
                );

        if (ok) {

            System.out.println(
                    "Pièce jointe réclamation ajoutée !"
            );

        } else {

            System.out.println(
                    "Erreur ajout pièce jointe réclamation !"
            );
        }
    }
}