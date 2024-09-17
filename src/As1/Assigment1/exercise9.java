package As1.Assigment1;

import java.util.Scanner;

public class exercise9 {
    public static int min(int[] a, int ind, int min) {
        if (ind == a.length) {
            return min;
        }
        if (min > a[ind]) {
            return min(a, ind + 1, a[ind]);
        }
        return min(a, ind + 1, min);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println(min(a, 0, Integer.MAX_VALUE));
    }
}

