package uir.ac.gestionhandicape.uir.ac.gestionhandicape.dao;

import uir.ac.gestionhandicape.uir.ac.gestionhandicape.database.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ArchiveDAO {

    private final Connection connection;

    public ArchiveDAO() {
        connection = DBConnection.getInstance().getConnection();
    }

    public boolean ajouterArchive(String typeElement,
                                  int idElement,
                                  String contenuJson,
                                  int archivedBy,
                                  String motif) {

        String sql =
                "INSERT INTO archive " +
                        "(type_element, id_element, contenu_json, archived_by, motif) " +
                        "VALUES (?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, typeElement);
            ps.setInt(2, idElement);
            ps.setString(3, contenuJson);
            ps.setInt(4, archivedBy);
            ps.setString(5, motif);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}