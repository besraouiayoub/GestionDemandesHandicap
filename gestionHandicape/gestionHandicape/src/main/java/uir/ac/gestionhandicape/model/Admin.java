/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uir.ac.gestionhandicape.model;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author yahyaazhari
 */
public class Admin extends Compte {
    
    private String matricule;
    private String nom;
    private String prenom;
    private String tel;
    private String niveauAcces;

   

    public Admin(String matricule, String nom, String prenom, String tel, String niveauAcces, int idCompte, String login, String motDePasse, String email, LocalDate dateCreation, boolean actif) {
        super(idCompte, login, motDePasse, email, dateCreation, actif);
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.niveauAcces = niveauAcces;
    }
    
    
      public void ajouterCompte() {
        System.out.println("Compte ajouté.");
    }

    public void modifierCompte() {
        System.out.println("Compte modifié.");
    }

    public void supprimerCompte() {
        System.out.println("Compte supprimé.");
    }

    public void bloquerCompte() {
        System.out.println("Compte bloqué.");
    }

    
    public void validerDemande() {
        System.out.println("Demande validée.");
    }

    public void refuserDemande() {
        System.out.println("Demande refusée.");
    }

    public void traiterDemande() {
        System.out.println("Demande traitée.");
    }

    
    public void traiterReclamation() {
        System.out.println("Réclamation traitée.");
    }

    public void repondreReclamation() {
        System.out.println("Réponse envoyée.");
    }

    
    public void afficherStatistiques() {
        System.out.println("Statistiques affichées.");
    }

    public void genererRapport() {
        System.out.println("Rapport généré.");
    }

    
    public void archiverDossier() {
        System.out.println("Dossier archivé.");
    }

    public void restaurerArchive() {
        System.out.println("Archive restaurée.");
    }

    
    @Override
    public String getRole() {
        return "Administrateur";
    }

    public String getMatricule() {
        return matricule;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getTel() {
        return tel;
    }

    public String getNiveauAcces() {
        return niveauAcces;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setNiveauAcces(String niveauAcces) {
        this.niveauAcces = niveauAcces;
    }

    @Override
    public String toString() {
        return "Admin{" + "matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + ", tel=" + tel + ", niveauAcces=" + niveauAcces + '}';
    }
    
    
    

   
   
    
}
