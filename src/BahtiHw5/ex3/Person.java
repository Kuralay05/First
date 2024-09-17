package BahtiHw5.ex3;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void printDetails(){
        System.out.printf("Name: %s, age: %d",getName(), getAge());
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Bahtiyar");
        person.setAge(18);
        person.printDetails();
    }
}
