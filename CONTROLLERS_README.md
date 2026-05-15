# Documentation des Contrôleurs - Application de Gestion de Handicap

Ce document décrit l'architecture et le rôle de chaque contrôleur (Controller) de l'application JavaFX `gestionHandicape`, en se basant sur les modules définis dans le rapport UML (`Rapport_UML.pdf`). Les contrôleurs agissent comme le lien principal entre les interfaces graphiques (Vues) et les données métier (Modèles).

---

## Architecture de Base (Base Controllers)

L'application utilise un système d'héritage pour centraliser les comportements communs et éviter la duplication de code.

* **`BaseController`** : Le contrôleur racine dont héritent la plupart des contrôleurs de l'application. Il contient les méthodes utilitaires communes (navigation entre les vues, affichage des alertes et des erreurs).
* **`AdminBaseController`** : Hérite de `BaseController` et ajoute des fonctionnalités spécifiques à l'espace administrateur (vérification des droits d'accès, gestion du menu de navigation côté admin).

---

## Module 1 : Authentification & Gestion des Comptes

Ce module gère l'accès à l'application et la différenciation des rôles entre les **Administrateurs** et les **Étudiants en situation de handicap**.

* **`LoginController`** : Constitue le point d'entrée de l'application. Il gère la vérification des identifiants (email et mot de passe), la validation des saisies, et redirige l'utilisateur vers le bon tableau de bord (`AdmiDashController` ou `EtudDashController`) en fonction de son rôle.
* **`SignUpController`** : Gère le formulaire d'inscription pour les nouveaux étudiants. Il assure la création de l'objet `EtudiantHandicape`.
* **`AdminCreationCompteController`** : Utilisé par l'administrateur pour créer manuellement de nouveaux comptes (autres administrateurs ou comptes spécifiques).
* **`AdminEtudiantsController`** : Permet à l'administrateur de lister, consulter, modifier ou bloquer les comptes étudiants.
* **`ProfilController`** / **`EtudProfilController`** : Gèrent l'affichage et la modification des informations personnelles de l'utilisateur connecté.

---

## Module 2 : Gestion des Demandes

Ce module est au cœur du système. Il permet la soumission, le suivi et le traitement des demandes, en associant les entités `Demande`, `TypeDemande`, `StatutDemande` et `PieceJointe`.

* **`NouvelleDemandeController`** : Gère l'interface de dépôt d'une nouvelle demande par l'étudiant. Il collecte le titre, la description, le type, la priorité, et permet de lier des pièces jointes.
* **`EtudDemandesController`** / **`MesDemandesController`** : Affiche l'historique et l'état d'avancement des demandes soumises par un étudiant spécifique.
* **`AdminDemandesController`** : Fournit à l'administrateur une vue globale de toutes les demandes. Permet de filtrer par statut et de modifier l'état des demandes (ex: En cours de traitement, Validée, Refusée).

---

## Module 3 : Gestion des Réclamations

Ce module permet de signaler un problème ou une insatisfaction et d'en assurer la traçabilité.

* **`NouvelleReclamationController`** : Gère la soumission d'une nouvelle réclamation par l'étudiant (objet, contenu et éventuelles pièces jointes).
* **`EtudReclamationsController`** : Permet à l'étudiant de suivre l'évolution de ses réclamations et de voir les réponses de l'administration.
* **`AdminReclamationsController`** : Interface d'administration pour traiter les réclamations, avec la possibilité d'ajouter des réponses administratives et de mettre à jour le statut (`StatutReclamation`).

---

## Module 4 : Tableau de Bord, Statistiques et Rapports

Ce module offre une vue synthétique des données pour faciliter la prise de décision.

* **`AdmiDashController`** : Le tableau de bord de l'administrateur. Il centralise l'affichage des principaux indicateurs et permet une navigation rapide vers la gestion des demandes, réclamations et étudiants.
* **`EtudDashController`** : Le tableau de bord de l'étudiant, offrant un aperçu de ses demandes récentes, réclamations en cours et notifications.
* **`AdminStatsController`** / **`StatistiquesController`** : Utilisent la classe `Statistique` pour calculer et afficher graphiquement (via JavaFX Charts) l'évolution des demandes, la répartition par type, ou le taux de traitement.
* **`NotificationsController`** : Gère l'affichage des notifications et alertes récentes pour l'utilisateur.

---

## Module 5 : Archivage

L'archivage assure la conservation sécurisée de l'historique complet des dossiers traités (demandes finalisées, anciens comptes).

* **`ArchivageController`** : Fait le lien avec le `GestionnaireArchivage` décrit dans l'UML. Il permet à l'administrateur de :
  * Lancer des recherches multicritères via la classe `RechercheMulticritere`.
  * Consulter l'historique des éléments archivés.
  * Restaurer ou supprimer définitivement certains éléments selon les habilitations.

---

*Ce document a été généré en adéquation avec l'architecture UML globale du projet, garantissant une séparation claire des responsabilités au sein du code.*
