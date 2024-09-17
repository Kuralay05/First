package homeworkOop4;

import java.util.Arrays;
import java.util.List;

public class Ex7 {
    public static void arip(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = sum / numbers.size();
        System.out.println("Сумма: " + sum);
        System.out.println("Среднее арифметическое: " + average);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        arip(numbers);
    }
}
