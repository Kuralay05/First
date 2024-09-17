package homework2;

public abstract class Person<T> implements Scholarship {
    String firstName;
    String lastName;
    T group;
    double averageMark;

    @Override
    public int getScholarship(){
        return 0;
    }
    public Person(String firstName, String lastName, T group, double averageMark){
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }
}
