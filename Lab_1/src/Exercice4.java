/*
Write a Java program to divide two numbers and print on the screen. These two numbers are giving as
parameters of the programm in cmd line
 */
public class Exercice4 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Exercice <num1> <num2>");
            return;
        }
        int num1=Integer.parseInt(args[0]);
        int num2=Integer.parseInt(args[1]);
        if (num2 == 0) {
            System.out.println("cannot divide by zero");
            return;
        }
        int div = num1/num2;
        System.out.println("the div of " + num1 + " on " +num2+" is "+div);
    }
}