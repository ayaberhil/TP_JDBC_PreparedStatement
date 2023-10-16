

package ma.projet.beans;

    public class Personne {
    private int id;
    private String nom;
    private double salaire;

    public Personne() {
    }

    public Personne( String nom, double salaire) {
        this.nom = nom;
        this.salaire = salaire;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
    
}
    

