package exercice3;

public class Employe extends Personne{
    double salaire;

    public Employe(int id, String nom, String prenom, double salaire) {
        super(id, nom, prenom);
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "salaire=" + salaire +
                ", id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}
