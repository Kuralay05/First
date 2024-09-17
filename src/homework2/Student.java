package homework2;

import java.util.ArrayList;

public class Student<T> extends Person<T>{
    ArrayList<String> subjects = new ArrayList<>();

    public Student(String firstName, String lastName, T group, double averageMark){
        super(firstName, lastName, group, averageMark);
    }

    @Override
    public int getScholarship(){
        if (averageMark == 5){
            return 100;
        }
        else return 80;
    }
}
