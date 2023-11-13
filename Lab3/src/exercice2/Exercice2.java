package exercice2;

import java.util.Scanner;

public class Exercice2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Combien de valeurs:");
        int n = sc.nextInt();

        for(int i =0; i<n; i++){
            System.out.println((2*i + 1) + " a pour carre : " + ((int)Math.pow(2*i + 1, 2)));
        }

        int[] carre = new int[n];
        for(int i =0; i<n; i++){
            carre[i] = ((int)Math.pow(2*i + 1, 2));
        }
        for(int i =0; i<n; i++){
            System.out.println((2*i + 1) + " a pour carre : " + carre[i]);
        }

    }
        }
