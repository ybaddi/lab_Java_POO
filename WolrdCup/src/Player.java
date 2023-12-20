import enums.EnumPost;

import java.util.Objects;

public class Player extends Personne {


    private EnumPost post;
    private int numero_maillot;
    private String equipeOrigine;

    public Player(String nom, String prenom, EnumPost post, int numero_maillot, String equipeOrigine) {
        super(nom,prenom );
//        this.nom=nom;
//        this.prenom=prenom;
        this.post = post;
        this.numero_maillot = numero_maillot;
        this.equipeOrigine = equipeOrigine;
    }

    public EnumPost getPost() {
        return post;
    }

    public void setPost(EnumPost post) {
        this.post = post;
    }

    public int getNumero_maillot() {
        return numero_maillot;
    }

    public void setNumero_maillot(int numero_maillot) {
        this.numero_maillot = numero_maillot;
    }

    public String getEquipeOrigine() {
        return equipeOrigine;
    }

    public void setEquipeOrigine(String equipeOrigine) {
        this.equipeOrigine = equipeOrigine;
    }

    @Override
    public String toString() {
        return "Player{" +
                "post=" + post +
                ", numero_maillot=" + numero_maillot +
                ", equipeOrigine='" + equipeOrigine + '\'' +
                '}';
    }

    // TODO add nom et prenom
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return numero_maillot == player.numero_maillot && post.equals(player.post) && equipeOrigine.equals(player.equipeOrigine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(post, numero_maillot, equipeOrigine);
    }
}
