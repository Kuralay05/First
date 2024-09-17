package As1.Assigment1;

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] k = new int[n];
        double avg = 0;
        for (int i = 0; i < n; i++) {
            k[i] = scanner.nextInt();
            avg += k[i];
        }
        System.out.println(avg / n);
    }
}
