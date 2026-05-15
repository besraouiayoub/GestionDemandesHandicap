package uir.ac.gestionhandicape.uir.ac.gestionhandicape.dao;

public class TestPieceJointeDemandeDAO {

    public static void main(String[] args) {

        PieceJointeDemandeDAO dao = new PieceJointeDemandeDAO();

        boolean ok = dao.ajouterPieceJointe(
                "certificat.pdf",
                "application/pdf",
                204800,
                "C:/documents/certificat.pdf",
                1
        );

        if (ok) {
            System.out.println("Pièce jointe demande ajoutée !");
        } else {
            System.out.println("Erreur ajout pièce jointe demande !");
        }
    }
}