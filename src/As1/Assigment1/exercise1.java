package As1.Assigment1;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] k = new int[n];
        k[0] = scanner.nextInt();
        int min = k[0];
        for (int i = 1; i < n; i++) {
            k[i] = scanner.nextInt();
            if (k[i] < min) {
                min = k[i];
            }
        }
        System.out.println(min);
    }
}
