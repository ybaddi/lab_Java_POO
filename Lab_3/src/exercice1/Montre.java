package exercice1;

public class Montre {
    int heur, min;
    Personne p;

    Montre(int h, int min){
        this.heur=h;
        this.min=min;
    }

    Montre(Montre m){
        this.heur = m.heur;
        this.min=m.min;
    }

    void avance(){
        if(this.min == 59){
            if (this.heur == 23 ) this.heur =0;
            else this.heur++;
            this.min=0;
        }else{
            this.min++;
        }
    }

    @Override
    public String toString() {
        return "Montre{" +
                "heur=" + heur +
                ", min=" + min +
                '}';
    }

    public static void main(String[] args) {
        Montre m = new Montre(13,59);
        Montre n = new Montre(m);
        m.avance();
        System.out.println(m);
    }
}
