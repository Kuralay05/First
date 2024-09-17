package homeworKu;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст для записи в файл (для завершения 'exit'):");

        StringBuilder content = new StringBuilder();
        String line;

        while (!(line = scanner.nextLine()).equalsIgnoreCase("exit")) {
            content.append(line).append("\n");
        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:/Users/Space/IdeaProjects/OOP/Lesson4/src/homework_files/test.txt"));
            writer.write(content.toString());
            writer.close();

            System.out.println("Текст успешно записан в файл!");

        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Ошибка при записи в файл");
        }
    }
}