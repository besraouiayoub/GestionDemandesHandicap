package uir.ac.gestionhandicape.model;

public class PieceJointe {
    private int id;
    private String nomFichier;
    private String cheminAcces;

    public PieceJointe(int id, String nomFichier, String cheminAcces) {
        this.id = id;
        this.nomFichier = nomFichier;
        this.cheminAcces = cheminAcces;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNomFichier() { return nomFichier; }
    public void setNomFichier(String nomFichier) { this.nomFichier = nomFichier; }
    public String getCheminAcces() { return cheminAcces; }
    public void setCheminAcces(String cheminAcces) { this.cheminAcces = cheminAcces; }
}
