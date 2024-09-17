package homeworKu;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public static void main(String[] args) {
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);

        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:/Users/Space/IdeaProjects/OOP/Lesson4/src/homework_files/test.txt"));

            String line;
            StringBuilder content = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }

            reader.close();
            textArea.setText(content.toString());

            JOptionPane.showMessageDialog(null, scrollPane);

        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ошибка при чтении из файла", "Ошибка", JOptionPane.ERROR_MESSAGE);
        }
    }
}
