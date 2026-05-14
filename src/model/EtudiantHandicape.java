package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EtudiantHandicape extends Compte {

    private String cne;
    private String nom;
    private String prenom;
    private String typeHandicap;
    private String filiere;
    private int annee;
    private String telephone;

    public EtudiantHandicape() {
    }

    public EtudiantHandicape(int idCompte, String login, String motDePasse, String email, String role, Date dateCreation, boolean actif,
                             String cne, String nom, String prenom, String typeHandicap, String filiere, int annee, String telephone) {
        super(idCompte, login, motDePasse, email, role, dateCreation, actif);
        this.cne = cne;
        this.nom = nom;
        this.prenom = prenom;
        this.typeHandicap = typeHandicap;
        this.filiere = filiere;
        this.annee = annee;
        this.telephone = telephone;
    }

    public void soumettreDemandeX() {
    }

    public void soumettreReclamation() {
    }

    public List<Object> consulterHistorique() {
        return new ArrayList<>();
    }

    public void modifierProfil() {
    }

    public List<Object> chercher() {
        return new ArrayList<>();
    }

    public String getCne() {
        return cne;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTypeHandicap() {
        return typeHandicap;
    }

    public void setTypeHandicap(String typeHandicap) {
        this.typeHandicap = typeHandicap;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}