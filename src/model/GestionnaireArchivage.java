package model;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GestionnaireArchivage {

    private int idGestionnaire;
    private Date dateOuverture;
    private int idAdmin;

    public GestionnaireArchivage() {
    }

    public GestionnaireArchivage(int idGestionnaire, Date dateOuverture, int idAdmin) {
        this.idGestionnaire = idGestionnaire;
        this.dateOuverture = dateOuverture;
        this.idAdmin = idAdmin;
    }

    public void afficherHistorique() {
    }

    public List<Object> lancerRecherche() {
        return new ArrayList<>();
    }

    public void supprimerArchive() {
    }

    public void restaurerElement() {
    }

    public File exporterArchives() {
        return null;
    }

    public int getIdGestionnaire() {
        return idGestionnaire;
    }

    public void setIdGestionnaire(int idGestionnaire) {
        this.idGestionnaire = idGestionnaire;
    }

    public Date getDateOuverture() {
        return dateOuverture;
    }

    public void setDateOuverture(Date dateOuverture) {
        this.dateOuverture = dateOuverture;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }
}