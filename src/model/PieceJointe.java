package model;

import java.io.File;
import java.util.Date;

public class PieceJointe {

    private int idPiece;
    private String nomFichier;
    private String typeMime;
    private long taille;
    private String cheminFichier;
    private Date dateAjout;
    private int idDemande;
    private int idReclamation;

    public PieceJointe() {
    }

    public PieceJointe(int idPiece, String nomFichier, String typeMime, long taille, String cheminFichier,
                       Date dateAjout, int idDemande, int idReclamation) {
        this.idPiece = idPiece;
        this.nomFichier = nomFichier;
        this.typeMime = typeMime;
        this.taille = taille;
        this.cheminFichier = cheminFichier;
        this.dateAjout = dateAjout;
        this.idDemande = idDemande;
        this.idReclamation = idReclamation;
    }

    public void ajouter() {
    }

    public void supprimer() {
    }

    public File telecharger() {
        if (cheminFichier == null) {
            return null;
        }
        return new File(cheminFichier);
    }

    public String getNomFichier() {
        return nomFichier;
    }

    public int getIdPiece() {
        return idPiece;
    }

    public void setIdPiece(int idPiece) {
        this.idPiece = idPiece;
    }

    public void setNomFichier(String nomFichier) {
        this.nomFichier = nomFichier;
    }

    public String getTypeMime() {
        return typeMime;
    }

    public void setTypeMime(String typeMime) {
        this.typeMime = typeMime;
    }

    public long getTaille() {
        return taille;
    }

    public void setTaille(long taille) {
        this.taille = taille;
    }

    public String getCheminFichier() {
        return cheminFichier;
    }

    public void setCheminFichier(String cheminFichier) {
        this.cheminFichier = cheminFichier;
    }

    public Date getDateAjout() {
        return dateAjout;
    }

    public void setDateAjout(Date dateAjout) {
        this.dateAjout = dateAjout;
    }

    public int getIdDemande() {
        return idDemande;
    }

    public void setIdDemande(int idDemande) {
        this.idDemande = idDemande;
    }

    public int getIdReclamation() {
        return idReclamation;
    }

    public void setIdReclamation(int idReclamation) {
        this.idReclamation = idReclamation;
    }
}