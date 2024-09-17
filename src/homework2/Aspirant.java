package homework2;

import java.util.ArrayList;

public class Aspirant<T> extends Person<T> {
    ArrayList<Student<String>> students = new ArrayList<>();

    public Aspirant(String firstName, String lastName, T group, double averageMark){
        super(firstName, lastName, group, averageMark);
    }

    @Override
    public int getScholarship(){
        if (averageMark == 5){
            return 200;
        }
        else return 180;
    }
}
