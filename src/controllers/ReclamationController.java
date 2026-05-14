package controllers;

import java.util.Date;

public class ReclamationController {
    private ReclamationService reclamationService;

    public void ajouterReclamation(EtudiantHandicape etudiant, String objet, String contenu) {
        Reclamation rec = new Reclamation(objet, contenu, StatutReclamation.NOUVELLE, new Date(), etudiant);
        HistoriqueAction action = new HistoriqueAction("Création de réclamation", new Date());
        rec.ajouterHistorique(action);
        reclamationService.enregistrer(rec);
    }
}
