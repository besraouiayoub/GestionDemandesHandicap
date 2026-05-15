package uir.ac.gestionhandicape.dao;

public class TestStatistiqueDAO {

    public static void main(String[] args) {

        StatistiqueDAO dao = new StatistiqueDAO();

        System.out.println(
                "Nombre demandes : "
                        + dao.nombreDemandes()
        );

        System.out.println(
                "Nombre réclamations : "
                        + dao.nombreReclamations()
        );

        System.out.println(
                "Nombre comptes : "
                        + dao.nombreComptes()
        );
    }
}