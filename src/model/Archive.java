package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Archive {

    private int idArchive;
    private String typeElement;
    private int idElement;
    private String contenuJson;
    private Date dateArchivage;
    private int archivedBy;
    private String motif;

    public Archive() {
    }

    public Archive(int idArchive, String typeElement, int idElement, String contenuJson,
                   Date dateArchivage, int archivedBy, String motif) {
        this.idArchive = idArchive;
        this.typeElement = typeElement;
        this.idElement = idElement;
        this.contenuJson = contenuJson;
        this.dateArchivage = dateArchivage;
        this.archivedBy = archivedBy;
        this.motif = motif;
    }

    public void archiverDemande(Demande d) {
    }

    public void archiverReclamation(Reclamation r) {
    }

    public void restaurer() {
    }

    public void supprimer() {
    }

    public List<Archive> getHistoriqueComplet() {
        return new ArrayList<>();
    }

    public List<Archive> getParType() {
        return new ArrayList<>();
    }

    public int getIdArchive() {
        return idArchive;
    }

    public void setIdArchive(int idArchive) {
        this.idArchive = idArchive;
    }

    public String getTypeElement() {
        return typeElement;
    }

    public void setTypeElement(String typeElement) {
        this.typeElement = typeElement;
    }

    public int getIdElement() {
        return idElement;
    }

    public void setIdElement(int idElement) {
        this.idElement = idElement;
    }

    public String getContenuJson() {
        return contenuJson;
    }

    public void setContenuJson(String contenuJson) {
        this.contenuJson = contenuJson;
    }

    public Date getDateArchivage() {
        return dateArchivage;
    }

    public void setDateArchivage(Date dateArchivage) {
        this.dateArchivage = dateArchivage;
    }

    public int getArchivedBy() {
        return archivedBy;
    }

    public void setArchivedBy(int archivedBy) {
        this.archivedBy = archivedBy;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }
}