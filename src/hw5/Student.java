package hw5;

public class Student extends Person implements Printable{
    private int studentId;

    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Student ID: " + getStudentId());
    }

    public static void main(String[] args) {
        Student student = new Student("Куралай", 18, 230716);
        student.printDetails();
    }
}

