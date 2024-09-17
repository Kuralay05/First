package homeworkOop4;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        while (n != 0){
            sum+=n;
        }
        System.out.println(sum);
    }
}
