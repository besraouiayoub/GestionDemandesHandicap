package uir.ac.gestionhandicape.dao;

import uir.ac.gestionhandicape.database.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NotificationDAO {

    private final Connection connection;

    public NotificationDAO() {

        connection =
                DBConnection.getInstance().getConnection();
    }

    public boolean ajouterNotification(String titre,
                                       String message,
                                       int idCompte) {

        String sql =
                "INSERT INTO notification " +
                        "(titre, message, id_compte) " +
                        "VALUES (?, ?, ?)";

        try {

            PreparedStatement ps =
                    connection.prepareStatement(sql);

            ps.setString(1, titre);
            ps.setString(2, message);
            ps.setInt(3, idCompte);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {

            e.printStackTrace();
            return false;
        }
    }

    public void afficherNotifications() {

        String sql =
                "SELECT * FROM notification";

        try {

            PreparedStatement ps =
                    connection.prepareStatement(sql);

            ResultSet rs =
                    ps.executeQuery();

            while (rs.next()) {

                System.out.println(
                        "ID : " +
                                rs.getInt("id_notification")
                );

                System.out.println(
                        "Titre : " +
                                rs.getString("titre")
                );

                System.out.println(
                        "Message : " +
                                rs.getString("message")
                );

                System.out.println("----------------");
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
}