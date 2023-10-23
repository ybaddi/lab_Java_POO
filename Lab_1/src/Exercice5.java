/*
1. Écrivez la méthode int add(int a, int b) qui retourne la somme des entiers a et b.
2. Écrivez la méthode int max(int a, int b) qui retourne le maximum de a et de b. Faites de même avec le minimum.
3. Écrivez la méthode int min(int a, int b, int c) qui retourne le minimum de a, de b et de c.
4. Écrivez la méthode int gcd(int a, int b) qui retourne le plus grand commun diviseur de a et de b.
 */
public class Exercice5 {
    public static int add(int a, int b) { return a+b;}
    public static int max(int a, int b){
        if(a>b)
            return a;
        else
            return b;
    }

    public static int min(int a, int b, int c){
        return Math.min(Math.min(a,b),c);
    }

    public static void main(String[] args) {
        // test add
        System.out.println(add(10,12));

        // test max
        System.out.println(max(10,20));
        System.out.println(max(-10,20));

        // test min
        System.out.println(min(10,9,13));

        // test gcd
        System.out.println(gcd(48,18));
    }

    public static int gcd(int a, int b){
        if(b==0){
            return a;
        }else{
            return gcd(b, a%b);
        }
    }
}
