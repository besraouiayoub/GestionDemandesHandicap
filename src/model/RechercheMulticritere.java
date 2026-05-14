package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RechercheMulticritere {

    private int idRecherche;
    private String motCle;
    private Date dateDebut;
    private Date dateFin;
    private String typeElement;
    private String statut;
    private int idCompte;

    public RechercheMulticritere() {
    }

    public RechercheMulticritere(int idRecherche, String motCle, Date dateDebut, Date dateFin,
                                 String typeElement, String statut, int idCompte) {
        this.idRecherche = idRecherche;
        this.motCle = motCle;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.typeElement = typeElement;
        this.statut = statut;
        this.idCompte = idCompte;
    }

    public List<Demande> rechercherDemandes() {
        return new ArrayList<>();
    }

    public List<Reclamation> rechercherReclamations() {
        return new ArrayList<>();
    }

    public List<Archive> rechercherArchives() {
        return new ArrayList<>();
    }

    public List<Object> filtrerParDate() {
        return new ArrayList<>();
    }

    public List<Object> filtrerParMotCle() {
        return new ArrayList<>();
    }

    public void reinitialiser() {
        this.motCle = null;
        this.dateDebut = null;
        this.dateFin = null;
        this.typeElement = null;
        this.statut = null;
    }

    public int getIdRecherche() {
        return idRecherche;
    }

    public void setIdRecherche(int idRecherche) {
        this.idRecherche = idRecherche;
    }

    public String getMotCle() {
        return motCle;
    }

    public void setMotCle(String motCle) {
        this.motCle = motCle;
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

    public String getTypeElement() {
        return typeElement;
    }

    public void setTypeElement(String typeElement) {
        this.typeElement = typeElement;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public int getIdCompte() {
        return idCompte;
    }

    public void setIdCompte(int idCompte) {
        this.idCompte = idCompte;
    }
}
