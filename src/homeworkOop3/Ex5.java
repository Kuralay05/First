package homeworkOop3;

public class Ex5 {
    public static void main(String[] args) {
        printCityPopulation("Джакарта", 25.3);
        printCityPopulation("Сеул", 25.2);
        printCityPopulation("Дели", 23.1);
        printCityPopulation("Нью-Йорк", 21.6);
    }

    public static void printCityPopulation(String city, double population){
        System.out.println("The population of the city of " + city + " is " + population +" million people.");
        System.out.println("While the most populous city of Tokyo has a population of 34.5 million people.");
    }
}
