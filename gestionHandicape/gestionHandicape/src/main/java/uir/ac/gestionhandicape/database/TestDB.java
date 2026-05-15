package uir.ac.gestionhandicape.database;


import java.sql.Connection;

public class TestDB {

    public static void main(String[] args) {

        Connection conn =
                DBConnection.getInstance().getConnection();

        if (conn != null) {

            System.out.println("Connexion réussie !");

        } else {

            System.out.println("Connexion échouée !");
        }
    }
}