package As1.Assigment1;

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.println("Composite");
                return;
            }
        }
        System.out.println("Prime");
    }
}
