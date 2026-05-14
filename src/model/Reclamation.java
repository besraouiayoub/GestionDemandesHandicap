package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reclamation {

    private int idReclamation;
    private String objet;
    private String contenu;
    private StatutReclamation statut;
    private Date dateCreation;
    private Date dateTraitement;
    private String reponseAdmin;
    private int idCompte;
    private List<PieceJointe> piecesJointes;
    private List<HistoriqueAction> historique;

    public Reclamation() {
        this.piecesJointes = new ArrayList<>();
        this.historique = new ArrayList<>();
    }

    public Reclamation(int idReclamation, String objet, String contenu, StatutReclamation statut,
                       Date dateCreation, Date dateTraitement, String reponseAdmin, int idCompte) {
        this.idReclamation = idReclamation;
        this.objet = objet;
        this.contenu = contenu;
        this.statut = statut;
        this.dateCreation = dateCreation;
        this.dateTraitement = dateTraitement;
        this.reponseAdmin = reponseAdmin;
        this.idCompte = idCompte;
        this.piecesJointes = new ArrayList<>();
        this.historique = new ArrayList<>();
    }

    public void saisir() {
    }

    public void supprimer() {
    }

    public void majStatut(StatutReclamation s) {
        this.statut = s;
    }

    public void archiver() {
        this.statut = StatutReclamation.ARCHIVEE;
    }

    public void ajouterPiece(PieceJointe p) {
        if (p != null) {
            piecesJointes.add(p);
        }
    }

    public List<HistoriqueAction> getHistorique() {
        return historique;
    }

    public List<PieceJointe> getPiecesJointes() {
        return piecesJointes;
    }

    public int getIdReclamation() {
        return idReclamation;
    }

    public void setIdReclamation(int idReclamation) {
        this.idReclamation = idReclamation;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public StatutReclamation getStatut() {
        return statut;
    }

    public void setStatut(StatutReclamation statut) {
        this.statut = statut;
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

    public String getReponseAdmin() {
        return reponseAdmin;
    }

    public void setReponseAdmin(String reponseAdmin) {
        this.reponseAdmin = reponseAdmin;
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

    public void setHistorique(List<HistoriqueAction> historique) {
        this.historique = historique;
    }
}
