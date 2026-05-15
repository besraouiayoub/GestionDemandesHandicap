package uir.ac.gestionhandicape.uir.ac.gestionhandicape.dao;

import uir.ac.gestionhandicape.uir.ac.gestionhandicape.database.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReclamationDAO {

    private final Connection connection;

    public ReclamationDAO() {
        connection = DBConnection.getInstance().getConnection();
    }

    public boolean ajouterReclamation(String objet,
                                      String contenu,
                                      int idCompte) {

        String sql =
                "INSERT INTO reclamation " +
                        "(objet, contenu, id_compte) " +
                        "VALUES (?, ?, ?)";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, objet);
            ps.setString(2, contenu);
            ps.setInt(3, idCompte);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void afficherReclamations() {

        String sql = "SELECT * FROM reclamation";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("ID : " + rs.getInt("id_reclamation"));
                System.out.println("Objet : " + rs.getString("objet"));
                System.out.println("Contenu : " + rs.getString("contenu"));
                System.out.println("Statut : " + rs.getString("statut"));
                System.out.println("----------------");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}