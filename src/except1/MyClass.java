package except1;

import jdk.jshell.spi.ExecutionControl;

import javax.swing.*;
import java.awt.*;

public class MyClass {
    public static void main(String[] args) {
        String in = JOptionPane.showInputDialog(null, "Введите логин");
        User user = new User();
        try {
            user.setLogin(in);
            System.out.println(user.getLogin());
        }catch (UserException e){
            if (e.getCode() == UserException.SHORT_LOGIN){
                JOptionPane.showMessageDialog(null, "Логин короткий");
            }
            else if (e.getCode() == UserException.LONG_LOGIN){
                JOptionPane.showMessageDialog(null, "пароль слишком длинный");
            }
        }
    }
}