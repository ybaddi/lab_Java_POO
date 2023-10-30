package exercice1;

public class Personne {
    String nom;
    Montre m;

    Personne(String nom){
        this.nom=nom;
    }

    void  porteMontre(Montre m){
        if (m.p != null & this.m == null) {
            this.m = m;
            m.p = this;
        } else System.out.println("this personne already has montre");
    }

    void enleveMontre(){
        Montre m = this.m;
        this.m=null;
        if (m != null) {
            m.p=null;
        } else System.out.println("this personne already has'nt montre");
    }
}
