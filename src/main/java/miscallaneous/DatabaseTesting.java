package src.main.java.miscallaneous;
import java.sql.*;

public class DatabaseTesting {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "password";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM users")) {

            while (resultSet.next()) {
                System.out.println("User: " + resultSet.getString("username"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
