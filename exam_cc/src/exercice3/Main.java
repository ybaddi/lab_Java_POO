package exercice3;

public class Main {

    public static void main(String[] args) {
        Etudiant e1=new Etudiant(1,"hamdan", "badi3aa", "123456");
        Etudiant e2=new Etudiant(2,"saadan", "karima", "654321");


        Employe em1=new Employe(3,"nom1", "prenom1", 15000);
        Employe em2=new Employe(4,"saadan", "karima", 30000);


        Professeur prof1=new Professeur(5,"baddi", "youssef", 13000, "info");
        Professeur prof2=new Professeur(6,"Toumi", "Hicham", 13000, "info");

        System.out.println(e1);
        System.out.println(e2);

        System.out.println(em1);
        System.out.println(em2);

        System.out.println(prof1);
        System.out.println(prof2);
    }
}
