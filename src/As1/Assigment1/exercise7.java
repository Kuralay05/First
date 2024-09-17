package As1.Assigment1;

import java.util.Scanner;

public class exercise7 {
    public static boolean check(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        if (check(str)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
