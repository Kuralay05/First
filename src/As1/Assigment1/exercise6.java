package As1.Assigment1;

import java.util.Scanner;

public class exercise6 {
    public static String f(int n) {
        Scanner scanner = new Scanner(System.in);
        if (n == 0) return "";
        int a = scanner.nextInt();
        return f(n - 1)+ " " + a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(f(n));
    }
}

