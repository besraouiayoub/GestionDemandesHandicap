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
public class EtudiantHandicape extends Compte {
    
    private String cne;
    private String nom;
    private String prenom;
    private String typeHandicape;
    private String filliere;
    private int Annee;
    private String tel;

    public EtudiantHandicape(String cne, String nom, String prenom, String typeHandicape, String filliere, int Annee, String tel, int idCompte, String login, String motDePasse, String email, LocalDate dateCreation, boolean actif) {
        super(idCompte, login, motDePasse, email, dateCreation, actif);
        this.cne = cne;
        this.nom = nom;
        this.prenom = prenom;
        this.typeHandicape = typeHandicape;
        this.filliere = filliere;
        this.Annee = Annee;
        this.tel = tel;
    }
   
     public void soumettreDemande() {
        System.out.println("Demande soumise.");
    }

    public void modifierDemande() {
        System.out.println("Demande modifiée.");
    }

    public void supprimerDemande() {
        System.out.println("Demande supprimée.");
    }

    public void consulterDemandes() {
        System.out.println("Consultation des demandes.");
    }

    public void soumettreReclamation() {
        System.out.println("Réclamation soumise.");
    }

    public void consulterReclamations() {
        System.out.println("Consultation des réclamations.");
    }

    public void modifierProfil() {
        System.out.println("Profil modifié.");
    }
    
    @Override
    public String getRole() {
        return "EtudiantHandicape";
    }

    public String getCne() {
        return cne;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getTypeHandicape() {
        return typeHandicape;
    }

    public String getFilliere() {
        return filliere;
    }

    public int getAnnee() {
        return Annee;
    }

    public String getTel() {
        return tel;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setTypeHandicape(String typeHandicape) {
        this.typeHandicape = typeHandicape;
    }

    public void setFilliere(String filliere) {
        this.filliere = filliere;
    }

    public void setAnnee(int Annee) {
        this.Annee = Annee;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "EtudiantHandicape{" + "cne=" + cne + ", nom=" + nom + ", prenom=" + prenom + ", typeHandicape=" + typeHandicape + ", filliere=" + filliere + ", Annee=" + Annee + ", tel=" + tel + '}';
    }
    
    
    
}
