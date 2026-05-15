package uir.ac.gestionhandicape.uir.ac.gestionhandicape.dao;

import uir.ac.gestionhandicape.uir.ac.gestionhandicape.database.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HistoriqueActionDAO {

    private final Connection connection;

    public HistoriqueActionDAO() {
        connection = DBConnection.getInstance().getConnection();
    }

    public boolean ajouterAction(String typeAction,
                                 String description,
                                 int idCompte,
                                 int idReclamation) {

        String sql =
                "INSERT INTO historique_action " +
                        "(type_action, description, id_compte, id_reclamation) " +
                        "VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, typeAction);
            ps.setString(2, description);
            ps.setInt(3, idCompte);
            ps.setInt(4, idReclamation);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void afficherHistorique() {

        String sql =
                "SELECT * FROM historique_action";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(
                        "ID : " +
                                rs.getInt("id_action")
                );

                System.out.println(
                        "Type : " +
                                rs.getString("type_action")
                );

                System.out.println(
                        "Description : " +
                                rs.getString("description")
                );

                System.out.println("----------------");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}