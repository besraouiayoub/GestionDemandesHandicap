/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uir.ac.gestionhandicape.model;


import java.time.LocalDate;

/**
 *
 * @author yahyaazhari
 */
public abstract class Compte {
    protected int idCompte;
    protected String login;
    protected String motDePasse;
    protected String email;
    protected LocalDate dateCreation;
    protected boolean actif;

    public Compte(int idCompte, String login, String motDePasse, String email, LocalDate dateCreation, boolean actif) {
        this.idCompte = idCompte;
        this.login = login;
        this.motDePasse = motDePasse;
        this.email = email;
        this.dateCreation = dateCreation;
        this.actif = actif;
    }
    
    public boolean seConnecter(){
        return true;
    }
    
    public void seDeconnecter(){
        System.out.println("Deco resussite");
    }
    
    public void modifierMDP(String NVmotDePasse){
        this.motDePasse = NVmotDePasse;
    }
    
    public abstract String getRole();

    public int getIdCompte() {
        return idCompte;
    }

    public String getLogin() {
        return login;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public boolean isActif() {
        return actif;
    }

    public void setIdCompte(int idCompte) {
        this.idCompte = idCompte;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }

    @Override
    public String toString() {
        return "Compte{" + "idCompte=" + idCompte + ", login=" + login + ", motDePasse=" + motDePasse + ", email=" + email + ", dateCreation=" + dateCreation + ", actif=" + actif + '}';
    }
    
    
}
