package dataBase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

public class GUI extends JFrame {

    private JButton addButton;
    private JButton deleteButton;
    private JButton displayButton;
    private JButton updateButton;
    private DatabaseConnection databaseConnection;

    public GUI() {
        setTitle("University Database Manager");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        try {
            databaseConnection = new DatabaseConnection();
        }

        catch (SQLException e) {
            e.printStackTrace();
            System.exit(1);
        }

        addButton = new JButton("Add Student");
        deleteButton = new JButton("Delete Student");
        displayButton = new JButton("Display All Students");
        updateButton = new JButton("Update Student Info");

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2, 2, 10, 10));
        buttonPanel.add(addButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(displayButton);
        buttonPanel.add(updateButton);

        add(buttonPanel, BorderLayout.CENTER);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int id = Integer.parseInt(JOptionPane.showInputDialog(GUI.this, "Enter student id;"));
                    String name = JOptionPane.showInputDialog(GUI.this, "Enter student name:");
                    int age = Integer.parseInt(JOptionPane.showInputDialog(GUI.this, "Enter student age:"));
                    String major = JOptionPane.showInputDialog(GUI.this, "Enter student major:");
                    Student student = new Student(id, name, age, major);
                    databaseConnection.addNewStudent(student);
                    JOptionPane.showMessageDialog(GUI.this, "Student added!", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Exception ex){
                    JOptionPane.showMessageDialog(GUI.this, "TRY AGAIN!", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(JOptionPane.showInputDialog(GUI.this, "Enter student ID to delete:"));
                try {
                    databaseConnection.deleteStudentInformation(id);
                    JOptionPane.showMessageDialog(GUI.this,"Student Deleted!");
                }
                catch (Exception ex){
                    JOptionPane.showMessageDialog(GUI.this, "TRY AGAIN!", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        displayButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    List<Student> students = databaseConnection.getStudentInfo();
                    StringBuilder output = new StringBuilder();
                    output.append("List of Students:\n");
                    for (Student student : students) {
                        output.append("ID: " + student.getId() + ", Name: " + student.getName() + ", Age: " + student.getAge() + ", Major: " + student.getMajor() + "\n");
                    }
                    JOptionPane.showMessageDialog(GUI.this, output.toString(), "Students List", JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Exception ex){
                    JOptionPane.showMessageDialog(GUI.this, "TRY AGAIN!", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(JOptionPane.showInputDialog(GUI.this, "Enter student ID to update:"));

                String[] options = {"Age", "Major"};
                int option = JOptionPane.showOptionDialog(GUI.this, "What do you want to update?", "Update Student Info", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, JOptionPane.CLOSED_OPTION);

                if (option == JOptionPane.CLOSED_OPTION) {
                    return;
                }

                switch (option) {
                    case 0:
                        int newAge = Integer.parseInt(JOptionPane.showInputDialog(GUI.this, "Enter new age:"));
                        try {
                            databaseConnection.updateStudent(id, newAge, null);
                            JOptionPane.showMessageDialog(GUI.this, "Age updated!", "Success", JOptionPane.INFORMATION_MESSAGE);
                        }
                        catch (Exception ex){
                            JOptionPane.showMessageDialog(GUI.this, "TRY AGAIN!", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                    case 1:
                        String newMajor = JOptionPane.showInputDialog(GUI.this, "Enter new major:");
                        try {
                            databaseConnection.updateStudent(id, -1, newMajor);
                            JOptionPane.showMessageDialog(GUI.this, "Major updated!", "Success", JOptionPane.INFORMATION_MESSAGE);
                        }
                        catch (Exception ex){
                            JOptionPane.showMessageDialog(GUI.this, "TRY AGAIN!", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GUI gui = new GUI();
                gui.setVisible(true);
            }
        });
    }
}
