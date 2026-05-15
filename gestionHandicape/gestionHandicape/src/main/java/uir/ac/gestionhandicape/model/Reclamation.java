package uir.ac.gestionhandicape.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Reclamation {
    private int id;
    private String objet;
    private String contenu;
    private StatutReclamation statut;
    private LocalDate dateCreation;
    private String reponseAdministrative;
    private EtudiantHandicape etudiant;
    private List<PieceJointe> piecesJointes;

    public Reclamation(int id, String objet, String contenu, EtudiantHandicape etudiant) {
        this.id = id;
        this.objet = objet;
        this.contenu = contenu;
        this.statut = StatutReclamation.NOUVELLE;
        this.dateCreation = LocalDate.now();
        this.etudiant = etudiant;
        this.piecesJointes = new ArrayList<>();
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getObjet() { return objet; }
    public void setObjet(String objet) { this.objet = objet; }
    public String getContenu() { return contenu; }
    public void setContenu(String contenu) { this.contenu = contenu; }
    public StatutReclamation getStatut() { return statut; }
    public void setStatut(StatutReclamation statut) { this.statut = statut; }
    public LocalDate getDateCreation() { return dateCreation; }
    public void setDateCreation(LocalDate dateCreation) { this.dateCreation = dateCreation; }
    public String getReponseAdministrative() { return reponseAdministrative; }
    public void setReponseAdministrative(String reponseAdministrative) { this.reponseAdministrative = reponseAdministrative; }
    public EtudiantHandicape getEtudiant() { return etudiant; }
    public void setEtudiant(EtudiantHandicape etudiant) { this.etudiant = etudiant; }
    public List<PieceJointe> getPiecesJointes() { return piecesJointes; }
    public void addPieceJointe(PieceJointe pj) { this.piecesJointes.add(pj); }
}
