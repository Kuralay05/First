package figure_calculator;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Figure f = null;
        while (true){
            String main = JOptionPane.showInputDialog(null, "Выберите команду:\n 1) Новая фигура \n 2) Вычислить периметр \n 3) Вычислить площадь \n 4) Завершить программу ");
            try {
                Integer.parseInt(main);

            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Ошибочка вышла :(");
                continue;
            }
            switch (Integer.parseInt(main)) {
                case 1:
                    f = newFigure();
                    break;
                case 2:
                    if (f != null) {
                        JOptionPane.showMessageDialog(null, "Периметр равен: " + f.getPerimeter());
                        break;
                    } else JOptionPane.showMessageDialog(null, " Вы еще не создали фигуру");
                    break;
                case 3:
                    if (f != null) {
                        JOptionPane.showMessageDialog(null, " Площадь равна: " + f.getSquare());
                        break;
                    }
                    else JOptionPane.showMessageDialog(null, " Вы еще не создали фигуру");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, " До новых задач :)");
                    return;
            }
        }
    }
    public static Figure newFigure() {
        int main = Integer.parseInt(JOptionPane.showInputDialog(null, "Выберите фигуру:\n 1) Круг \n 2) Прямоугольник \n 3) Треугольник"));
        switch (main) {
            case 1:
                return new Circle(Integer.parseInt(JOptionPane.showInputDialog(null, "Введите значение радиуса: ")));
            case 2:
                return new Rectangle(Integer.parseInt(JOptionPane.showInputDialog(null, "Введите значение a:")), Integer.parseInt(JOptionPane.showInputDialog(null, "Введите значение b: ")));
            case 3:
                return new Triangle(Integer.parseInt(JOptionPane.showInputDialog(null, "Введите значение a:")), Integer.parseInt(JOptionPane.showInputDialog(null, "Введите значение b: ")), Integer.parseInt(JOptionPane.showInputDialog(null, "Введите значение c: 9")));
        }
        return null;
    }

}
