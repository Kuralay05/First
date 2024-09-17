package As1.Assigment1;

import java.util.Scanner;

public class exercise5 {
    public static int power(int a, int c, int n) {
        if (n == 0 || n == 1) {
            return a;
        }
        return power(a * c, c, n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(power(a, a, n));
    }
}

