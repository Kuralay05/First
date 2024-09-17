package oopmidtermka;

import javax.swing.*;
import java.util.Scanner;

import static javax.swing.JOptionPane.showMessageDialog;

public class Main {
    public static void check(int n){
        JOptionPane.showMessageDialog(null, "У Вас есть " + n + " тенге");
    }

    public static int putMoney(int n){
        String put = JOptionPane.showInputDialog(null, "Сколько вы хотите внести: " );
        return n + Integer.parseInt(put);
    }

    public static int withdrawMoney(int n){
        String put = JOptionPane.showInputDialog(null, "Сколько вы хотите снять: " );
        if (Integer.parseInt(put) > n){
            JOptionPane.showMessageDialog(null, "Извините, вы не настолько богат :(");
            return withdrawMoney(n);
        }
        return n - Integer.parseInt(put);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean i = true;

        while (i){
            String in = JOptionPane.showInputDialog(null, "Выберете операцию: " +
                    "1) Проверить счет" +
                    "2) Снять деньги" +
                    "3)Внести деньги"+
                    "4) Выйти");
            switch (in) {
                case "1":
                    check(n);
                    break;
                case "2":
                    n = withdrawMoney(n);
                    break;
                case "3":
                    n = putMoney(n);
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "Пока пока");
                    i = false;
                    break;
            }
        }
    }
}
