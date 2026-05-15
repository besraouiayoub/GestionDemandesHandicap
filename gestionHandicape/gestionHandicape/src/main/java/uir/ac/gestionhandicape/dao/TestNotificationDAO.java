package uir.ac.gestionhandicape.dao;

public class TestNotificationDAO {

    public static void main(String[] args) {

        NotificationDAO dao =
                new NotificationDAO();

        boolean ok =
                dao.ajouterNotification(
                        "Nouvelle demande",
                        "Votre demande a été acceptée.",
                        1
                );

        if (ok) {

            System.out.println(
                    "Notification ajoutée !"
            );

        } else {

            System.out.println(
                    "Erreur ajout notification !"
            );
        }

        dao.afficherNotifications();
    }
}