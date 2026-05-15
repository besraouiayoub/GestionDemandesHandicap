package uir.ac.gestionhandicape.dao;

public class TestCompteDAO {

    public static void main(String[] args) {

        CompteDAO dao = new CompteDAO();

        boolean ok =
                dao.login("admin", "admin");

        if (ok) {

            System.out.println("Connexion réussie");

        } else {

            System.out.println("Erreur login");
        }
    }
}