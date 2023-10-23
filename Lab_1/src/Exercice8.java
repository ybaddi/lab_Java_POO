/*
1. Écrivez la méthode int min(int[] elements) qui retourne le plus petit entier contenu dans le tableau
elements.
2. Écrivez la méthode int min(int[] elements) qui retourne le plus petit entier contenu dans le tableau elements. le tableau et sa taille passés en argument
1 $ java minTab 5 10 7 5 3 22 23
3. Écrivez la méthode int min(int[] elements) qui retourne le plus petit entier contenu dans le tableau elements. le tableau passé en argument
1 $ java minTab 10 7 5 3 22 23
4. Écrivez la méthode int find(int[] elements, int value) qui retourne la position de l’entier value dans le tableau elements ou -1 si l’entier n’est pas présent dans le tableau.
5. Écrivez la méthode int add(int[] elements) qui retourne la somme des éléments du tableau elements.
6. Écrivez la méthode int computePrimeNumber(int i) qui calcule le ime nombre premier.
7. Écrivezlaméthodevoidfill(int[]array,intvalue)quimetlavaleurvaluedanstouteslescasesdutableau array.
8. Écrivez la méthode int[] reverse(int[] array) qui retourne un nouveau tableau dont le jme élément est égal au ime élément du tableau array en partant de la fin de celui-ci.

 */
public class Exercice8 {

    private static int min(int[] items) {
        int min =Integer.MAX_VALUE;
        for(int item : items){
            if(item < min){
                min = item;
            }
        }
        return min;
    }

    public static int find(int[] items, int num){
        for(int i=0;i<items.length; i++){
            if(items[i] == num){ return i;}
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] items={};
        int min = min(items);
        System.out.println(min);
        System.out.println(find(5));
    }


}
