package uir.ac.gestionhandicape.uir.ac.gestionhandicape.service;

import uir.ac.gestionhandicape.uir.ac.gestionhandicape.dao.CompteDAO;

public class CompteService {

    private final CompteDAO compteDAO;

    public CompteService() {
        compteDAO = new CompteDAO();
    }

    public boolean connecter(String login,
                             String motDePasse) {

        if (login == null || login.isEmpty()) {
            return false;
        }

        if (motDePasse == null || motDePasse.isEmpty()) {
            return false;
        }

        return compteDAO.login(
                login,
                motDePasse
        );
    }
}