import java.util.Scanner;

/*
1. Java Program to Find GCD of two Numbers
2. Java Program to Find LCM of two Numbers
3. Java Program to Display Characters from A to Z using loop
4. Java Program to Count Number of Digits in an Integer
5. Java Program to Reverse a Number
6. Java Program to Calculate the Power of a Number
7. Java Program to Display Factors of a Number
8. Java Program to Make a Simple Calculator Using switch...case
9. Java Program to Convert Binary Number to Decimal and vice-versa
10. Java Program to Convert Octal Number to Decimal and vice-versa 11. Java Program to Convert Binary Number to Octal and vice-versa
 */
public class Exercice7 {

    private static int gCD(int num1, int num2) {
        while(num1 != num2){
            if(num1 > num2){
                num1 -= num2;
            }else{
                num2 -= num1;
            }
        }
        return num1;
    }

    public static int lcm( int a, int b) {
        return a*b / gCD(a,b);}

    private static void fromAToZ() {
    for(char c='A'; c <= 'Z';c++){
        System.out.println(c);
    }
    }

    private static int countOfDigits(int num) {
    int result = 0;
    while (num > 0){
        result ++;
        num /=10;
    }
    return result;
    }

    private static int reversNumber(int num) {
        int result = 0;
        while (num > 0){
            int lastDigit = num%10;
            result = result*10+lastDigit;
            num /=10;
        }
        return result;
    }

    private static int powerNumber(int num1, int num2) {
    int result = 1;
    for(int i=0; i< num2; i++ ){
        result *= num1;
    }
    return result;
    }

    private static int  factory(int num1) {
        int result = 1;
        if(num1<0 ) {
            System.out.println("the num is negative");
            return -1;
        }
        if (num1==0) return 1;
        else return num1 * factory(num1-1);
    }

    private static int calculate(int num1, int num2, char operator) {
    switch (operator){
        case '+':
            return num1+num2;
        case '-':
            return num1-num2;
        case '/':
            return num1/num2;
        case '*':
            return num1*num2;
        default:
            throw new IllegalArgumentException("invalid operation");
    }
    }



    private static int binaryToDecimal(String s) {
   int decimal = 0;
   int pow=0;
   for(int i =s.length()-1; i>=0;i--){
       int digit = s.charAt(i) - '0';
       decimal += digit * Math.pow(2, pow);
       pow++;
   }
return decimal;
    }

    private static String decimalToBinary(int i) {
        String binaire = "";

        while(i>0){
            int reste = i%2;
            binaire = reste + binaire;
            i /=2;
        }

        return binaire;
    }


    private static int octalToDecimal(String s) {
        int decimal = 0;
        int pow=0;
        for(int i =s.length()-1; i>=0;i--){
            int digit = s.charAt(i) - '0';
            decimal += digit * Math.pow(8, pow);
            pow++;
        }
        return decimal;
    }

    private static String decimalToOctal(int i) {
        String binaire = "";

        while(i>0){
            int reste = i%8;
            binaire = reste + binaire;
            i /=8;
        }

        return binaire;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("veuillez entrer un premier entier ");
        int num1 = sc.nextInt();
        System.out.println("veuillez entrer un deuxieme entier ");
        int num2 = sc.nextInt();

        num1= (num1>0) ? num1 : -num1;
        num2= (num2>0) ? num2 : -num2;

        System.out.println("the GCD de " + num1 + " et " +num2 +" est " + gCD(num1,num2));

        System.out.println("the LCM de " + num1 + " et " +num2 +" est " + lcm(num1,num2));

        fromAToZ();

        System.out.println("the number of digit of " + num1 + " is " + countOfDigits(num1));

        System.out.println("the reverse of th number  " + num1 + " is " + reversNumber(num1));


        System.out.println("the power of the number  " + num1 + " by the number " + num2 + " is " +
                powerNumber(num1, num2));

        System.out.println("the factory  of the number  " + num1 + " is " +
                factory(num1));

        System.out.println(calculate(num1,num2,'+'));

        System.out.println(binaryToDecimal("110110"));

        System.out.println(decimalToBinary(54));

        System.out.println(octalToDecimal("64"));

        System.out.println(decimalToOctal(52));

    }




}
