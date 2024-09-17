package dataBase;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseConnection {
    private Connection connection;

    public DatabaseConnection() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/university", "postgres", "0000");
    }
    public List<Student> getStudentInfo() {
        List<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM students";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                students.add(new Student(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age"), rs.getString("major")));
            }
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
        return students;
    }
    public void addNewStudent(Student student) {
        String sql = "insert into students (id, name, age, major) values (?, ?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, student.getId());
            pstmt.setString(2, student.getName());
            pstmt.setInt(3, student.getAge());
            pstmt.setString(4, student.getMajor());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
    }
    public void updateStudent(int id, int age, String major) throws SQLException {
        String query = "UPDATE students SET ";
        if (age >= 0) {
            query += "age = " + age;
            if (major != null) {
                query += ", ";
            }
        }
        if (major != null) {
            query += "major = '" + major + "'";
        }
        query += " WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        }
    }
    public void deleteStudentInformation(int id){
        String sql = "delete from students where id = ?";
        try(PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e){
            throw new IllegalArgumentException(e);
        }
    }
}
