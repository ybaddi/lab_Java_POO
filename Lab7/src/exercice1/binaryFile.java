package exercice1;

import java.io.*;
import java.util.Scanner;

public class binaryFile {

    public static void main(String[] args)
            {
//        Scanner sc = new Scanner(System.in);
//        String fileName = sc.nextLine();

                try {

        BufferedReader bfd = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("the file name pls");
        String fileName = bfd.readLine();


            DataOutputStream dis = new DataOutputStream(
                    new FileOutputStream(fileName));

            int i=1;
            while(true){

                // nom
                System.out.print("le nom " + i+ ":");
                String nom=bfd.readLine();

                if(nom.isEmpty()) {
                    break;
                }

                // prenom
                System.out.print("Prenom :");
                String prenom=bfd.readLine();

                // age
                System.out.print("l'age :");
                int age=Integer.parseInt(
                        bfd.readLine());

                dis.writeChars( String.format("%-20s",nom));
                dis.writeChars( String.format("%-20s",prenom));
//                dis.writeChars( String.format("%-20s",age));
                dis.writeInt(age);
i++;
            }
            dis.close();
            System.out.print("******* Fin creation fichier *******");
        }catch (IOException fne){
            fne.printStackTrace();
        }
    }
}
