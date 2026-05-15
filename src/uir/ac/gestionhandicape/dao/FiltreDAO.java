package uir.ac.gestionhandicape.uir.ac.gestionhandicape.dao;

import uir.ac.gestionhandicape.uir.ac.gestionhandicape.database.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FiltreDAO {

    private final Connection connection;

    public FiltreDAO() {
        connection = DBConnection.getInstance().getConnection();
    }

    public void filtrerDemandesParStatut(String statut) {

        String sql =
                "SELECT * FROM demande WHERE statut = ?";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, statut);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(
                        "ID : " +
                                rs.getInt("id_demande")
                );

                System.out.println(
                        "Titre : " +
                                rs.getString("titre")
                );

                System.out.println(
                        "Statut : " +
                                rs.getString("statut")
                );

                System.out.println("----------------");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void filtrerReclamationsParStatut(String statut) {

        String sql =
                "SELECT * FROM reclamation WHERE statut = ?";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, statut);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(
                        "ID : " +
                                rs.getInt("id_reclamation")
                );

                System.out.println(
                        "Objet : " +
                                rs.getString("objet")
                );

                System.out.println(
                        "Statut : " +
                                rs.getString("statut")
                );

                System.out.println("----------------");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}