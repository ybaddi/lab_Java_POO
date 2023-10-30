package exercice10;

import java.util.Scanner;

public class SerieHarmonique {
    public static void main (String[] args)
    {  Scanner sc = new Scanner(System.in);
        int nt ;
        float som ;
        int i ;
        do
        { System.out.print ("combien de termes : ") ;

            nt = sc.nextInt();
        }
        while (nt<1) ;
        for (i=1, som=0 ; i<=nt ; i++) som += (float)1/i ;
        System.out.println ("Somme des " + nt + " premiers termes = " + som) ;
    }
}
