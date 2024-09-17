package homeworkOop4;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum+=i;

        }
        System.out.println(sum + n);
    }
}
