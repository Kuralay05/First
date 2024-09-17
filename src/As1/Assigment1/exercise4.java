package As1.Assigment1;

import java.util.Scanner;

public class exercise4 {
    public static int fibonacci(int n, int n1, int n2, int n3) {
        if (n == 0 || n == 1) {
            return n3;
        }
        return fibonacci(n - 1, n2, n3, n2 + n3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fibonacci(n, 0, 0, 1));
    }
}
