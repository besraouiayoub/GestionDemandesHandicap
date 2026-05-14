# GestionDemandesHandicap

Application Desktop en Java pour la gestion des demandes et des réclamations des personnes en situation de handicap au sein d'une université.

## Objectif du projet

Ce projet permet de centraliser et structurer la gestion des demandes et réclamations des étudiants en situation de handicap.

L'application permet :
- la gestion des comptes utilisateurs ;
- la création et le suivi des demandes ;
- la gestion des réclamations ;
- l'ajout de pièces justificatives ;
- l'affichage des statistiques ;
- l'archivage des dossiers.

## Technologies utilisées

- Java
- Swing ou JavaFX
- MySQL
- JDBC
- Architecture MVC
- NetBeans

## Structure du projet

```text
GestionDemandesHandicap/
│
├── src/
│   ├── gestiondemandeshandicap/
│   │   └── GestionDemandesHandicap.java
│   │
│   └── model/
│       ├── Compte.java
│       ├── Administrateur.java
│       ├── EtudiantHandicape.java
│       ├── Demande.java
│       ├── TypeDemande.java
│       ├── StatutDemande.java
│       ├── Reclamation.java
│       ├── StatutReclamation.java
│       ├── PieceJointe.java
│       ├── HistoriqueAction.java
│       ├── Archive.java
│       ├── RechercheMulticritere.java
│       ├── GestionnaireArchivage.java
│       ├── Statistique.java
│       ├── Filtre.java
│       ├── Rapport.java
│       └── TableauDeBord.java
│
├── nbproject/
├── build.xml
├── manifest.mf
└── README.md
