package exercice11;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        for(int i = 1; i<= h; i++){
            for(int j=1; j<= h-i; j++){
                System.out.print(" ");
            }
            for (int z=1; z<= 2*i-1; z++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}