package controllers;

import java.util.Date;
import java.util.List;

public class GestionnaireArchivage {
    private ArchiveService archiveService;

    public Archive archiverElement(Object element, String motif) {
        Archive archive = new Archive();
        archive.setDateArchivage(new Date());
        archive.setContenu(element.toString()); 
        archive.setMotif(motif);
        return archiveService.sauvegarder(archive);
    }

    public List<Archive> lancerRecherche(RechercheMulticritere criteres) {
        return archiveService.rechercher(criteres);
    }
}
