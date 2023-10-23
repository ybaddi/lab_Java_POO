/*
Write a Java program to print the sum of two numbers. These two numbers are giving as parameters of the
programm in cmd line
 */
public class Exercice3 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Exercice <num1> <num2>");
            return;
        }
        int num1=Integer.parseInt(args[0]);
        int num2=Integer.parseInt(args[1]);
        int sum = num1+num2;
        System.out.println("the sum of " + num1 + " and " +num2+" is "+sum);
    }
}
