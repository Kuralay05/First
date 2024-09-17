package hw5;

public class Person implements Printable {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

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

    public void printDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
    }


    public static void main(String[] args) {
        Person personObj = new Person("Асият", 18);
        personObj.printDetails();
    }
}
