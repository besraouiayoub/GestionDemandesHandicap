package controllers;

public class TableauDeBordController {
    private StatistiqueService statService;
    
    public TableauDeBord chargerDonnees(Filtre filtre) {
        TableauDeBord tb = new TableauDeBord();
        tb.setTotalDemandes(statService.calculerTotalDemandes(filtre));
        tb.setDemandesTraitees(statService.calculerDemandesParStatut(StatutDemande.TRAITEE, filtre));
        return tb;
    }

    public void exporterRapportStats(TableauDeBord tb) {
        Rapport rapport = new Rapport(tb.getStatistiques());
        rapport.genererPDF();
    }
}
