package exercice3;

import java.util.*;

public class Student {
    String nom;
    int age;
    double moyenne;

    Map<String , Double> notes = new HashMap<>();

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

    public Map<String, Double> getNotes() {
        return notes;
    }

    public void setNotes(Map<String, Double> notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nom='" + nom + '\'' +
                ", age=" + age +
                ", moyenne=" + moyenne +
                '}';
    }


    public void initNotes(List<String> cours){
        for (String c: cours             ) {
            notes.put(c, 0.00);
        }
    }


    public void updateMoyenne(){
        double sum=0.00;
        for (Map.Entry<String, Double> e: notes.entrySet()             ) {
            sum +=e.getValue();
        }
    this.setMoyenne(sum / notes.size());
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

        System.out.println("=================");
        Map<String, Double> notes = new HashMap<>();

        notes.put("java",80.00);
        notes.put("php",60.00);
        notes.put("python",60.00);

        notes.forEach((k,v)-> System.out.println(k + " " +v));
        System.out.println("=================");
        for (Map.Entry<String, Double> s: notes.entrySet()  ) {
            System.out.println("key : "+ s.getKey() + " value : " + s.getValue());
        }

        student1.setNotes(notes);

        student1.updateMoyenne();
        System.out.println(student1);
    }
}
