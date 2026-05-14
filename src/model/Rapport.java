package model;

import java.io.File;
import java.util.Date;

public class Rapport {

    private int idRapport;
    private String titre;
    private String format;
    private Date dateGeneration;
    private String cheminFichier;
    private int idCompte;

    public Rapport() {
    }

    public Rapport(int idRapport, String titre, String format, Date dateGeneration, String cheminFichier, int idCompte) {
        this.idRapport = idRapport;
        this.titre = titre;
        this.format = format;
        this.dateGeneration = dateGeneration;
        this.cheminFichier = cheminFichier;
        this.idCompte = idCompte;
    }

    public File genererPDF() {
        return null;
    }

    public File genererCSV() {
        return null;
    }

    public void telecharger() {
    }

    public void inclureStatistiques() {
    }

    public int getIdRapport() {
        return idRapport;
    }

    public void setIdRapport(int idRapport) {
        this.idRapport = idRapport;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Date getDateGeneration() {
        return dateGeneration;
    }

    public void setDateGeneration(Date dateGeneration) {
        this.dateGeneration = dateGeneration;
    }

    public String getCheminFichier() {
        return cheminFichier;
    }

    public void setCheminFichier(String cheminFichier) {
        this.cheminFichier = cheminFichier;
    }

    public int getIdCompte() {
        return idCompte;
    }

    public void setIdCompte(int idCompte) {
        this.idCompte = idCompte;
    }
}