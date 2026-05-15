package uir.ac.gestionhandicape.dao;

import uir.ac.gestionhandicape.database.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StatistiqueDAO {

    private final Connection connection;

    public StatistiqueDAO() {
        connection = DBConnection.getInstance().getConnection();
    }

    public int nombreDemandes() {

        String sql = "SELECT COUNT(*) AS total FROM demande";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt("total");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }

    public int nombreReclamations() {

        String sql = "SELECT COUNT(*) AS total FROM reclamation";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt("total");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }

    public int nombreComptes() {

        String sql = "SELECT COUNT(*) AS total FROM compte";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt("total");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }
}