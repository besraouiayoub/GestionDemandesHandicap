package uir.ac.gestionhandicape.uir.ac.gestionhandicape.dao;

import uir.ac.gestionhandicape.uir.ac.gestionhandicape.database.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PieceJointeDemandeDAO {

    private final Connection connection;

    public PieceJointeDemandeDAO() {
        connection = DBConnection.getInstance().getConnection();
    }

    public boolean ajouterPieceJointe(String nomFichier,
                                      String typeMime,
                                      long taille,
                                      String cheminFichier,
                                      int idDemande) {

        String sql =
                "INSERT INTO piece_jointe_demande " +
                        "(nom_fichier, type_mime, taille, chemin_fichier, id_demande) " +
                        "VALUES (?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, nomFichier);
            ps.setString(2, typeMime);
            ps.setLong(3, taille);
            ps.setString(4, cheminFichier);
            ps.setInt(5, idDemande);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}