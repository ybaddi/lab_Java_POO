/*
Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.
Test Data
Input an integer between 0 and 20000 : 565
Expected Output :
The sum of all digits in 565 is 16
 */

import java.util.Scanner;

public class Exercice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("veuillez entrer un entier entre 0 et 10000");
        int num = sc.nextInt();
        int number = num;
        int numOfDigits = 0;
        while (num > 0){
            int lastDigit = num % 10;
            numOfDigits += lastDigit;
            num /= 10;
        }

        System.out.println("sum of all digfits of " + number + " is " + numOfDigits);
    }
}
