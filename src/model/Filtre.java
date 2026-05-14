package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Filtre {

    private int idFiltre;
    private Date dateDebut;
    private Date dateFin;
    private String type;
    private String statut;
    private String filiere;

    public Filtre() {
    }

    public Filtre(int idFiltre, Date dateDebut, Date dateFin, String type, String statut, String filiere) {
        this.idFiltre = idFiltre;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.type = type;
        this.statut = statut;
        this.filiere = filiere;
    }

    public List<Object> appliquer() {
        return new ArrayList<>();
    }

    public void reinitialiser() {
        this.dateDebut = null;
        this.dateFin = null;
        this.type = null;
        this.statut = null;
        this.filiere = null;
    }

    public List<Object> filtrerParDate() {
        return new ArrayList<>();
    }

    public List<Object> filtrerParType() {
        return new ArrayList<>();
    }

    public int getIdFiltre() {
        return idFiltre;
    }

    public void setIdFiltre(int idFiltre) {
        this.idFiltre = idFiltre;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }
}