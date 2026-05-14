package model;

import java.util.Date;

public abstract class Compte {

    protected int idCompte;
    protected String login;
    protected String motDePasse;
    protected String email;
    protected String role;
    protected Date dateCreation;
    protected boolean actif;

    public Compte() {
    }

    public Compte(int idCompte, String login, String motDePasse, String email, String role, Date dateCreation, boolean actif) {
        this.idCompte = idCompte;
        this.login = login;
        this.motDePasse = motDePasse;
        this.email = email;
        this.role = role;
        this.dateCreation = dateCreation;
        this.actif = actif;
    }

    public boolean seConnecter() {
        return actif;
    }

    public void seDeconnecter() {
        // Méthode prévue dans le diagramme UML.
    }

    public void modifierMotDePasse() {
        // Méthode prévue dans le diagramme UML.
    }

    public String getRole() {
        return role;
    }

    public boolean isActif() {
        return actif;
    }

    public int getIdCompte() {
        return idCompte;
    }

    public void setIdCompte(int idCompte) {
        this.idCompte = idCompte;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setRole(String role) {
        this.role = role;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }
}