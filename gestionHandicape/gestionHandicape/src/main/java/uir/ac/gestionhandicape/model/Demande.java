package uir.ac.gestionhandicape.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Demande {
    private int id;
    private String titre;
    private String description;
    private TypeDemande type;
    private StatutDemande statut;
    private String priorite;
    private LocalDate dateCreation;
    private LocalDate dateTraitement;
    private EtudiantHandicape etudiant;
    private List<PieceJointe> piecesJointes;

    public Demande(int id, String titre, String description, TypeDemande type, String priorite, EtudiantHandicape etudiant) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.type = type;
        this.priorite = priorite;
        this.statut = StatutDemande.EN_ATTENTE;
        this.dateCreation = LocalDate.now();
        this.etudiant = etudiant;
        this.piecesJointes = new ArrayList<>();
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTitre() { return titre; }
    public void setTitre(String titre) { this.titre = titre; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public TypeDemande getType() { return type; }
    public void setType(TypeDemande type) { this.type = type; }
    public StatutDemande getStatut() { return statut; }
    public void setStatut(StatutDemande statut) { this.statut = statut; }
    public String getPriorite() { return priorite; }
    public void setPriorite(String priorite) { this.priorite = priorite; }
    public LocalDate getDateCreation() { return dateCreation; }
    public void setDateCreation(LocalDate dateCreation) { this.dateCreation = dateCreation; }
    public LocalDate getDateTraitement() { return dateTraitement; }
    public void setDateTraitement(LocalDate dateTraitement) { this.dateTraitement = dateTraitement; }
    public EtudiantHandicape getEtudiant() { return etudiant; }
    public void setEtudiant(EtudiantHandicape etudiant) { this.etudiant = etudiant; }
    public List<PieceJointe> getPiecesJointes() { return piecesJointes; }
    public void addPieceJointe(PieceJointe pj) { this.piecesJointes.add(pj); }
}
