package exercice9;

import java.util.Scanner;

public class RaccineCarree {

    public static void main(String[] args) {
        double x;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("donnez un nombre positif : ");

            x = sc.nextDouble();
            if (x < 0) System.out.println("svp positif");
            if (x <= 0) continue;
            System.out.println("sa racine carree est : " + Math.sqrt(x));
        }
        while (x != 0);
    }
}
