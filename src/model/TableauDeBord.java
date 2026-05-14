package model;

import java.io.File;
import java.util.Date;

public class TableauDeBord {

    private int idTableau;
    private Date dateOuverture;
    private int idCompte;

    public TableauDeBord() {
    }

    public TableauDeBord(int idTableau, Date dateOuverture, int idCompte) {
        this.idTableau = idTableau;
        this.dateOuverture = dateOuverture;
        this.idCompte = idCompte;
    }

    public void afficher() {
    }

    public void actualiser() {
    }

    public void appliquerFiltre(Filtre filtre) {
    }

    public void chargerStatistiques() {
    }

    public File exporterRapport() {
        return null;
    }

    public int getIdTableau() {
        return idTableau;
    }

    public void setIdTableau(int idTableau) {
        this.idTableau = idTableau;
    }

    public Date getDateOuverture() {
        return dateOuverture;
    }

    public void setDateOuverture(Date dateOuverture) {
        this.dateOuverture = dateOuverture;
    }

    public int getIdCompte() {
        return idCompte;
    }

    public void setIdCompte(int idCompte) {
        this.idCompte = idCompte;
    }
}