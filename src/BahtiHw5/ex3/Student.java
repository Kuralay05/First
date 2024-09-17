package BahtiHw5.ex3;

import BahtiHw5.ex2.Person;

public class Student extends Person {
    private int studentid;
    public int getStudentid() {
        return studentid;
    }
    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    @Override
    public void printDetails() {
        System.out.printf("Name: %s, age: %d, studentid: %d",getName(), getAge(), getStudentid());
    }

    public static void main(String[] args) {
        Student person = new Student();
        person.setName("Bahtiyar");
        person.setAge(18);
        person.setStudentid(230623);
        person.printDetails();
    }
}
