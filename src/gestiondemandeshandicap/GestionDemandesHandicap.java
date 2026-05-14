package gestiondemandeshandicap;

import java.util.Date;
import model.*;

public class GestionDemandesHandicap {

    public static void main(String[] args) {

        Administrateur admin = new Administrateur(
                1,
                "admin",
                "1234",
                "admin@uir.ac.ma",
                "ADMIN",
                new Date(),
                true,
                "ADM001",
                "Besraoui",
                "Ayoub",
                "0600000000",
                "TOTAL"
        );

        EtudiantHandicape etudiant = new EtudiantHandicape(
                2,
                "etudiant",
                "1234",
                "etudiant@uir.ac.ma",
                "ETUDIANT",
                new Date(),
                true,
                "CNE123",
                "Test",
                "Etudiant",
                "Moteur",
                "Genie Informatique",
                3,
                "0611111111"
        );

        Demande demande = new Demande(
                1,
                "Demande accessibilite",
                "Besoin d'accompagnement pour acceder aux salles.",
                TypeDemande.ACCESSIBILITE,
                StatutDemande.EN_ATTENTE,
                "Normale",
                new Date(),
                null,
                "",
                etudiant.getIdCompte()
        );

        Reclamation reclamation = new Reclamation(
                1,
                "Retard de traitement",
                "Ma demande n'a pas encore ete traitee.",
                StatutReclamation.SOUMISE,
                new Date(),
                null,
                "",
                etudiant.getIdCompte()
        );

        Archive archive = new Archive();
        RechercheMulticritere recherche = new RechercheMulticritere();
        GestionnaireArchivage gestionnaireArchivage = new GestionnaireArchivage();

        System.out.println("Admin : " + admin.getNom());
        System.out.println("Etudiant : " + etudiant.getNom());
        System.out.println("Demande : " + demande.getTitre());
        System.out.println("Statut demande : " + demande.getStatut());
        System.out.println("Reclamation : " + reclamation.getObjet());

        System.out.println("Test des classes model termine avec succes.");
    }
}