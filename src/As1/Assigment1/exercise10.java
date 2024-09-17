package As1.Assigment1;

import java.util.Scanner;

public class exercise10 {
    public static int min(int[] a, int ind, int min) {
        if (ind == (-1)) {
            return min;
        }
        if (min > a[ind]) {
            return min(a, ind - 1, a[ind]);
        }
        return min(a, ind - 1, min);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println(min(a, n - 1, Integer.MAX_VALUE));
    }
}

