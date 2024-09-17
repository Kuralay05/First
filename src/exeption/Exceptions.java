package exeption;

import javax.swing.*;

public class Exceptions {
    public static void main(String[] args) {
        String in1 = JOptionPane.showInputDialog(null, "введите первое число");
        String in2 = JOptionPane.showInputDialog(null, "введите второе число");
        try{
            int a = Integer.parseInt(in1);
        int b = Integer.parseInt(in2);
        if (a <= 0 || b<=0) throw new NegativException();
        if( a > 100 || b > 100) throw new Exception();
        JOptionPane.showMessageDialog(null, "Сумма чисел = " + (a + b));
    }catch (NegativException e) {
            JOptionPane.showMessageDialog(null, "Minus number");
            System.out.println(e);
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "it's not a number");
            System.out.println(e);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "> 100 number");
            System.out.println(e);
        }
        finally {
            System.out.println("программа завершается");
        }
    }
}
