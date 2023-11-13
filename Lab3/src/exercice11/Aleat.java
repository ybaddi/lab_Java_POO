package exercice11;

public class Aleat {
    int[] values;
    int nmbrValue;
    int limite;

    public Aleat(int nmbrValue, int limite){
        this.limite = limite;
        this.nmbrValue = nmbrValue;
        values = new int[nmbrValue];
        for(int i =0; i<nmbrValue;i++){
            values[i]=(int)((limite+1)*Math.random());
        }
    }
    public int getValeur (int n) {
        return values[n];
    }

    public int[] getValeurs () {
return values;
    }

    public int[] histo() {
        int[] resultat = new int[limite + 1];
        for (int i = 0; i < nmbrValue; i++) {
            resultat[values[i]]++;
        }
        return resultat;
    }

    public static void main(String[] args) {
        Aleat al = new Aleat(100,10);
        // display values
        for(int i =0; i< al.nmbrValue; i++){
            System.out.println(al.getValeur(i));
        }

        System.out.println("=========");
        int[] al_histo = al.histo();
        // display values
        for(int i =0; i< al_histo.length; i++){
            System.out.println(al_histo[i]);
        }
    }
}
