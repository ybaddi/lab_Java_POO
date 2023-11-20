package exercice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
    String nom;
    int age;
    double moyenne;

    // TODO look at Lombok

    public Student(String nom, int age, double moyenne) {
        this.nom = nom;
        this.age = age;
        this.moyenne = moyenne;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nom='" + nom + '\'' +
                ", age=" + age +
                ", moyenne=" + moyenne +
                '}';
    }


    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student student1 = new Student("ibtissam" , 19, 90);
        Student student2 = new Student("hind" , 18, 17);
        Student student3 = new Student("badi3a" , 20, 9);
        students.add(new Student("fatouma" , 19, 16));
        students.add(student1);
        students.add(student2);
        students.add(student3);

        students.forEach(System.out::println);
        // sort
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.moyenne == o2.moyenne){
                    return 0;
                }else if(o1.moyenne < o2.moyenne){
                    return 1;
                }else return -1;
            }
        });

        System.out.println("=================");
        students.forEach(System.out::println);
        Collections.sort(students, Comparator.comparingDouble(Student::getMoyenne).reversed());
        System.out.println("=================");
        students.forEach(System.out::println);

        for(Student st : students){
            if(st.getMoyenne()>80) System.out.println(st);
        }

        students.stream().filter(st -> st.getMoyenne()>80)
                .forEach(System.out::println);
    }
}
