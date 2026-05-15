package uir.ac.gestionhandicape.service;

public class TestCompteService {

    public static void main(String[] args) {

        CompteService service =
                new CompteService();

        boolean ok =
                service.connecter(
                        "admin",
                        "admin"
                );

        if (ok) {

            System.out.println(
                    "Connexion service réussie !"
            );

        } else {

            System.out.println(
                    "Erreur connexion service !"
            );
        }
    }
}