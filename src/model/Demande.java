package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Demande {

    private int idDemande;
    private String titre;
    private String description;
    private TypeDemande type;
    private StatutDemande statut;
    private String priorite;
    private Date dateCreation;
    private Date dateTraitement;
    private String commentaireAdmin;
    private int idCompte;
    private List<PieceJointe> piecesJointes;

    public Demande() {
        this.piecesJointes = new ArrayList<>();
    }

    public Demande(int idDemande, String titre, String description, TypeDemande type, StatutDemande statut,
                   String priorite, Date dateCreation, Date dateTraitement, String commentaireAdmin, int idCompte) {
        this.idDemande = idDemande;
        this.titre = titre;
        this.description = description;
        this.type = type;
        this.statut = statut;
        this.priorite = priorite;
        this.dateCreation = dateCreation;
        this.dateTraitement = dateTraitement;
        this.commentaireAdmin = commentaireAdmin;
        this.idCompte = idCompte;
        this.piecesJointes = new ArrayList<>();
    }

    public void creer() {
    }

    public void modifier() {
    }

    public void supprimer() {
    }

    public void majStatut(StatutDemande s) {
        this.statut = s;
    }

    public void archiver() {
        this.statut = StatutDemande.ARCHIVEE;
    }

    public void ajouterPiece(PieceJointe p) {
        if (p != null) {
            piecesJointes.add(p);
        }
    }

    public List<PieceJointe> getPiecesJointes() {
        return piecesJointes;
    }

    public StatutDemande getStatut() {
        return statut;
    }

    public int getIdDemande() {
        return idDemande;
    }

    public void setIdDemande(int idDemande) {
        this.idDemande = idDemande;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TypeDemande getType() {
        return type;
    }

    public void setType(TypeDemande type) {
        this.type = type;
    }

    public void setStatut(StatutDemande statut) {
        this.statut = statut;
    }

    public String getPriorite() {
        return priorite;
    }

    public void setPriorite(String priorite) {
        this.priorite = priorite;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDateTraitement() {
        return dateTraitement;
    }

    public void setDateTraitement(Date dateTraitement) {
        this.dateTraitement = dateTraitement;
    }

    public String getCommentaireAdmin() {
        return commentaireAdmin;
    }

    public void setCommentaireAdmin(String commentaireAdmin) {
        this.commentaireAdmin = commentaireAdmin;
    }

    public int getIdCompte() {
        return idCompte;
    }

    public void setIdCompte(int idCompte) {
        this.idCompte = idCompte;
    }

    public void setPiecesJointes(List<PieceJointe> piecesJointes) {
        this.piecesJointes = piecesJointes;
    }
}