package uir.ac.gestionhandicape.dao;

import uir.ac.gestionhandicape.database.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DemandeDAO {

    private final Connection connection;

    public DemandeDAO() {

        connection =
                DBConnection.getInstance().getConnection();
    }

    public boolean ajouterDemande(String titre,
                                  String description,
                                  String typeDemande,
                                  int idEtudiant) {

        String sql =
                "INSERT INTO demande " +
                        "(titre, description, type_demande, id_etudiant) " +
                        "VALUES (?, ?, ?, ?)";

        try {

            PreparedStatement ps =
                    connection.prepareStatement(sql);

            ps.setString(1, titre);
            ps.setString(2, description);
            ps.setString(3, typeDemande);
            ps.setInt(4, idEtudiant);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {

            e.printStackTrace();
            return false;
        }
    }

    public void afficherDemandes() {

        String sql =
                "SELECT * FROM demande";

        try {

            PreparedStatement ps =
                    connection.prepareStatement(sql);

            ResultSet rs =
                    ps.executeQuery();

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
                        "Type : " +
                                rs.getString("type_demande")
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