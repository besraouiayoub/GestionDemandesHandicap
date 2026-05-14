package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HistoriqueAction {

    private int idAction;
    private String typeAction;
    private String description;
    private Date dateAction;
    private int idCompte;
    private int idReclamation;

    public HistoriqueAction() {
    }

    public HistoriqueAction(int idAction, String typeAction, String description, Date dateAction, int idCompte, int idReclamation) {
        this.idAction = idAction;
        this.typeAction = typeAction;
        this.description = description;
        this.dateAction = dateAction;
        this.idCompte = idCompte;
        this.idReclamation = idReclamation;
    }

    public void enregistrer() {
    }

    public List<HistoriqueAction> getActionsParReclamation() {
        return new ArrayList<>();
    }

    public Date getDate() {
        return dateAction;
    }

    public int getIdAction() {
        return idAction;
    }

    public void setIdAction(int idAction) {
        this.idAction = idAction;
    }

    public String getTypeAction() {
        return typeAction;
    }

    public void setTypeAction(String typeAction) {
        this.typeAction = typeAction;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateAction() {
        return dateAction;
    }

    public void setDateAction(Date dateAction) {
        this.dateAction = dateAction;
    }

    public int getIdCompte() {
        return idCompte;
    }

    public void setIdCompte(int idCompte) {
        this.idCompte = idCompte;
    }

    public int getIdReclamation() {
        return idReclamation;
    }

    public void setIdReclamation(int idReclamation) {
        this.idReclamation = idReclamation;
    }
}