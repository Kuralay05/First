package homeworkOop3;

public class Ex2 {
    public static void main(String[] args) {
        String firstName = "Sultan";
        String lastName = "Suleyman";
        String favouriteDish = "Steak";
        printPersonInfo(firstName, lastName, favouriteDish);
    }

    public static void printPersonInfo(String name, String surname, String meal){
        System.out.println("First name: "+ name);
        System.out.println("Second name: "+ surname);
        System.out.println("Favourite dish: "+ meal);
    }
}
