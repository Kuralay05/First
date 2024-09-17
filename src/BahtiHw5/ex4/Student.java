package BahtiHw5.ex4;

public class Student extends Person{
    private int studentid;
    public int getStudentid() {
        return studentid;
    }
    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }
    public void printDetails() {
        System.out.printf("Name: %s, age: %d, studentid: %d\n",getName(), getAge(), getStudentid());
    }
}
