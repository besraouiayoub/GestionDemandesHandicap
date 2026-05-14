package controllers;

import java.util.Date;
import java.util.List;

public class DemandeController {
    private DemandeService demandeService;

    public Demande soumettreDemande(EtudiantHandicape etudiant, String titre, String description, TypeDemande type, List<PieceJointe> pieces) {
        Demande nouvelleDemande = new Demande(titre, description, type, StatutDemande.EN_ATTENTE, new Date(), etudiant);
        nouvelleDemande.setPiecesJointes(pieces);
        return demandeService.sauvegarder(nouvelleDemande);
    }

    public void traiterDemande(Demande demande, StatutDemande nouveauStatut) {
        demande.setStatut(nouveauStatut);
        demande.setDateTraitement(new Date());
        demandeService.mettreAJour(demande);
    }
}
