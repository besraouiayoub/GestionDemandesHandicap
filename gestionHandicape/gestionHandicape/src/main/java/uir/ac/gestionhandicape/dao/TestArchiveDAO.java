package uir.ac.gestionhandicape.dao;

public class TestArchiveDAO {

    public static void main(String[] args) {

        ArchiveDAO dao = new ArchiveDAO();

        boolean ok = dao.ajouterArchive(
                "DEMANDE",
                1,
                "{\"titre\":\"Demande test\"}",
                1,
                "Archivage test"
        );

        if (ok) {
            System.out.println("Archive ajoutée !");
        } else {
            System.out.println("Erreur ajout archive !");
        }
    }
}