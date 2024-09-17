import javax.swing.*;

public class Calculator {
    public static void main(String[] args) {
                String s = JOptionPane.showInputDialog(null, "Выберите операцию 1) Сложения, 2)Вычетания, 3)Умножения, 4)Деление, 5) Остаток от деления:");
                if(Integer.parseInt(s) < 1 || Integer.parseInt(s) > 5){
                    JOptionPane.showMessageDialog(null, "Такой операции не существует");
                }
                else{
                    System.out.println("Введите числа над которыме хотите провести операцию");
                    String s1 = JOptionPane.showInputDialog(null, "Число номер 1:");
                    int a = Integer.parseInt(s1);
                    String s2 = JOptionPane.showInputDialog(null, "Число номер 2:");
                    int b = Integer.parseInt(s2);
                    switch (Integer.parseInt(s)) {
                        case 1:
                            JOptionPane.showMessageDialog(null, "Результат Сложения: " + (a + b));
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "Результат Вычетания: " + (a - b));
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null, "Результат Умножения: " + (a * b));
                        case 4:
                            JOptionPane.showMessageDialog(null, "Результат Деления: " + (a / b));
                        case 5:
                            JOptionPane.showMessageDialog(null, "Результат Деления: " + (a % b));
                            break;
                    }
                }
            }
        }
