package BahtiHw5.ex4;

import java.sql.Array;
import java.util.ArrayList;

public interface Printable {
    void printDetails();

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Bahtiyar");
        person.setAge(18);
        Student student = new Student();
        student.setName("Person");
        student.setAge(17);
        student.setStudentid(230623);
        Printable [] object = {person,student};
        for(Printable i : object){
            i.printDetails();
        }
    }
}
