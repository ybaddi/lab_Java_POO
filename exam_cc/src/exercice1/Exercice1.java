package exercice1;

import java.util.Scanner;

public class Exercice1 {

    public static double compute(int n, int x){
        int i=1;
        double sum=0;
        while(i<=n){
            sum += Math.pow(i,x);
            i++;
        }
        return sum;
    }

    public static double computeFor(int n, int x){
        double sum=0;
        for(int i=1;i<=n;i++) sum += Math.pow(i,x);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("veuillez entrer la valeur de n");
        int n = sc.nextInt();

        System.out.println("veuillez entrer la valeur de x");
        int x = sc.nextInt();

        double sum = compute(n,x);
        System.out.println("la somme est " + sum);

        double sumFor = computeFor(n,x);
        System.out.println("la somme est " + sumFor);
    }
}
