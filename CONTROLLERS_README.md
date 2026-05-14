# Application Controllers Documentation

This document provides an overview of the **Controller layer** implemented for the Java application. Following the MVC (Model-View-Controller) architecture, these classes act as the bridge between the user interface (Views) and the underlying data and business logic (Models/Services).

## Overview

The controller layer manages the application's core workflows, broken down into five distinct modules:
1. **Authentication**
2. **Request Management (Demandes)**
3. **Complaint Management (Réclamations)**
4. **Dashboard & Statistics**
5. **Archiving**

---

## 1. Authentication Module
**Class:** `AuthentificationController`

Handles all aspects of user sessions and authentication.
* **`login(String email, String motDePasse)`**: Authenticates a user by checking their credentials against the database via `CompteService`. It verifies if the account exists, if the password matches, and if the account is currently active. On success, it creates a global user session.
* **`logout()`**: Clears the current user session and logs the user out of the application.

## 2. Request Management Module
**Class:** `DemandeController`

Manages the lifecycle of requests (demandes) submitted by users (e.g., students).
* **`soumettreDemande(...)`**: Allows a user to create a new request with a title, description, type, and attached files. It initializes the request with a `PENDING` (EN_ATTENTE) status and saves it via the `DemandeService`.
* **`traiterDemande(Demande demande, StatutDemande nouveauStatut)`**: Used by administrators to update the status of a request and automatically record the processing date.

## 3. Complaint Management Module
**Class:** `ReclamationController`

Handles the submission of complaints and tracks their history for transparency.
* **`ajouterReclamation(...)`**: Creates a new complaint with an initial `NEW` status. It automatically generates a historical action log ("Création de réclamation") to ensure traceability before saving it to the database via `ReclamationService`.

## 4. Dashboard & Statistics Module
**Class:** `TableauDeBordController`

Provides data aggregation for the administrative dashboard.
* **`chargerDonnees(Filtre filtre)`**: Aggregates statistical data such as the total number of requests and the number of processed requests, applying any relevant filters (e.g., time periods).
* **`exporterRapportStats(TableauDeBord tb)`**: Generates a downloadable PDF report based on the dashboard's current statistical data.

## 5. Archiving Module
**Class:** `GestionnaireArchivage`

Acts as a control component for long-term data storage and retrieval.
* **`archiverElement(Object element, String motif)`**: Archives a specific object (like an old request or complaint) by saving its current state/content along with the date and the specific reason for archiving.
* **`lancerRecherche(RechercheMulticritere criteres)`**: Allows administrators to search through the archives using multiple criteria.

---
*Note: These controllers are designed to be cleanly decoupled and integrated with their respective Service and Model classes which handle direct database interactions.*
