package exercice3;

public class Etudiant extends Personne{

    String cne;

    public Etudiant(int id, String nom, String prenom, String cne) {
        super(id, nom, prenom);
        this.cne = cne;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "cne='" + cne + '\'' +
                ", id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}
