package uir.ac.gestionhandicape.uir.ac.gestionhandicape.dao;

import uir.ac.gestionhandicape.uir.ac.gestionhandicape.database.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CompteDAO {

    private final Connection connection;

    public CompteDAO() {

        connection =
                DBConnection.getInstance().getConnection();
    }

    public boolean login(String login, String motDePasse) {

        String sql =
                "SELECT * FROM compte WHERE login = ? AND mot_de_passe = ?";

        try {

            PreparedStatement ps =
                    connection.prepareStatement(sql);

            ps.setString(1, login);
            ps.setString(2, motDePasse);

            ResultSet rs = ps.executeQuery();

            return rs.next();

        } catch (SQLException e) {

            e.printStackTrace();
            return false;
        }
    }
}