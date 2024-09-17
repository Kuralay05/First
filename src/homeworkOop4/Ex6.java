package homeworkOop4;

public class Ex6 {
    public static void main(String[] args) {
        int[] numbers = {-3, 9, 8, 7, 4, -67, 45, -33, 88, 2};
        int countNeg = 0;
        int countPoz = 0;
        for (int i = 0; i < 10; i++) {
            if (numbers[i] < 0) countNeg++;
            else countPoz++;
        }
        System.out.println("Negative numbers: "+ countNeg);
        System.out.println("Positive numbers: " + countPoz);
    }
}
