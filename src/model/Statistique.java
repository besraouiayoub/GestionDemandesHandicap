package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Statistique {

    private int idStatistique;
    private String periode;
    private int nbDemandesTotal;
    private int nbDemandesAcceptees;
    private int nbDemandesRefusees;
    private int nbReclamations;
    private Date dateCalcul;

    public Statistique() {
    }

    public Statistique(int idStatistique, String periode, int nbDemandesTotal, int nbDemandesAcceptees,
                       int nbDemandesRefusees, int nbReclamations, Date dateCalcul) {
        this.idStatistique = idStatistique;
        this.periode = periode;
        this.nbDemandesTotal = nbDemandesTotal;
        this.nbDemandesAcceptees = nbDemandesAcceptees;
        this.nbDemandesRefusees = nbDemandesRefusees;
        this.nbReclamations = nbReclamations;
        this.dateCalcul = dateCalcul;
    }

    public void calculer() {
    }

    public Map<String, Integer> getParStatut() {
        return new HashMap<>();
    }

    public Map<String, Integer> getParType() {
        return new HashMap<>();
    }

    public List<Statistique> getAnnuel() {
        return new ArrayList<>();
    }

    public void afficherGraphique() {
    }

    public int getIdStatistique() {
        return idStatistique;
    }

    public void setIdStatistique(int idStatistique) {
        this.idStatistique = idStatistique;
    }

    public String getPeriode() {
        return periode;
    }

    public void setPeriode(String periode) {
        this.periode = periode;
    }

    public int getNbDemandesTotal() {
        return nbDemandesTotal;
    }

    public void setNbDemandesTotal(int nbDemandesTotal) {
        this.nbDemandesTotal = nbDemandesTotal;
    }

    public int getNbDemandesAcceptees() {
        return nbDemandesAcceptees;
    }

    public void setNbDemandesAcceptees(int nbDemandesAcceptees) {
        this.nbDemandesAcceptees = nbDemandesAcceptees;
    }

    public int getNbDemandesRefusees() {
        return nbDemandesRefusees;
    }

    public void setNbDemandesRefusees(int nbDemandesRefusees) {
        this.nbDemandesRefusees = nbDemandesRefusees;
    }

    public int getNbReclamations() {
        return nbReclamations;
    }

    public void setNbReclamations(int nbReclamations) {
        this.nbReclamations = nbReclamations;
    }

    public Date getDateCalcul() {
        return dateCalcul;
    }

    public void setDateCalcul(Date dateCalcul) {
        this.dateCalcul = dateCalcul;
    }
}
