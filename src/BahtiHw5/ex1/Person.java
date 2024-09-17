package BahtiHw5.ex1;

public class Person {
    String name;
    int age;

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

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Bahtiyar");
        person.setAge(18);
        System.out.println(person.getName() + " " + person.getAge());
    }
}

