package model;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Administrateur extends Compte {

    private String matricule;
    private String nom;
    private String prenom;
    private String telephone;
    private String niveauAcces;
    
    public Administrateur() {
    }
    
    public Administrateur(int idCompte, String login, String motDePasse, String email, String role, Date dateCreation, boolean actif,
                          String matricule, String nom, String prenom, String telephone, String niveauAcces) {
        super(idCompte, login, motDePasse, email, role, dateCreation, actif);
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.niveauAcces = niveauAcces;
    }
    public void gererComptes() {
    }

    public void validerDemande() {
    }

    public List<Compte> listerComptes() {
        return new ArrayList<>();
    }

    public void archiverDossier() {
    }

    public File genererRapport() {
        return null;
    }

    public void supprimerCompte() {
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getNiveauAcces() {
        return niveauAcces;
    }

    public void setNiveauAcces(String niveauAcces) {
        this.niveauAcces = niveauAcces;
    }
}