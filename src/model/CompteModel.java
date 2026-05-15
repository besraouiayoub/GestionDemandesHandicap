package uir.ac.gestionhandicape.model;

public class CompteModel {

    private int idCompte;
    private String login;
    private String motDePasse;
    private String email;
    private String role;
    private String nom;
    private String prenom;

    public CompteModel() {
    }

    public CompteModel(int idCompte,
                       String login,
                       String motDePasse,
                       String email,
                       String role,
                       String nom,
                       String prenom) {

        this.idCompte = idCompte;
        this.login = login;
        this.motDePasse = motDePasse;
        this.email = email;
        this.role = role;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getIdCompte() {
        return idCompte;
    }

    public void setIdCompte(int idCompte) {
        this.idCompte = idCompte;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}