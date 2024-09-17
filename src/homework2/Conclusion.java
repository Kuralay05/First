package homework2;

import java.util.ArrayList;

public class Conclusion {
    public static void main(String[] args){
        Student<Integer> student1 = new Student<>("Zhanerke", "Pernesh", 2326, 3.57);
        Student<Integer> student2 = new Student<>("Darina", "Zhiterbaeva", 2345, 5);
        Student<Integer> student3 = new Student<>("Alana", "Ruzikova", 2222, 3.9);
        Student<Integer> student4 = new Student<>("Daniar", "Elimbaev", 2367, 4.8);
        Student<Integer> student5 = new Student<>("Draco", "Malfoy", 2377, 5);

        Aspirant<Integer> aspirant1 = new Aspirant<>("Zhansaya", "Tolkin", 2026, 5);
        Aspirant<Integer> aspirant2 = new Aspirant<>("Sanzhar", "Nurahmetov", 2002, 2.87);
        Aspirant<Integer> aspirant3 = new Aspirant<>("Daryn", "Myktanyly", 2032, 4.49);
        Aspirant<Integer> aspirant4 = new Aspirant<>("Gulnara", "Telgarina", 2000, 3.45);
        Aspirant<Integer> aspirant5 = new Aspirant<>("Aigul", "Nepadai", 2009, 3.33);

        ArrayList<Student<Integer>> students = new ArrayList<>();
        ArrayList<Aspirant<Integer>> aspirants = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        aspirants.add(aspirant1);
        aspirants.add(aspirant2);
        aspirants.add(aspirant3);
        aspirants.add(aspirant4);
        aspirants.add(aspirant5);

        for(Student<Integer> student : students){
            System.out.println(student.getScholarship());
        }
        System.out.println(" ");

        for (Aspirant<Integer> aspirant : aspirants){
            System.out.println(aspirant.getScholarship());
        }
    }
}
