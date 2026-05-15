package uir.ac.gestionhandicape.dao;

import uir.ac.gestionhandicape.database.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RapportDAO {

    private final Connection connection;

    public RapportDAO() {
        connection = DBConnection.getInstance().getConnection();
    }

    public boolean ajouterRapport(String titre,
                                  String format,
                                  String cheminFichier,
                                  int idCompte) {

        String sql =
                "INSERT INTO rapport " +
                        "(titre, format, chemin_fichier, id_compte) " +
                        "VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, titre);
            ps.setString(2, format);
            ps.setString(3, cheminFichier);
            ps.setInt(4, idCompte);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}