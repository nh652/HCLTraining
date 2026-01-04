package Assignments.Assignment4;
import java.sql.*;

public class CreateInsertQ2 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college_db";
        String user = "root";
        String pass = "root";

        try {
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();

            String sqlCreate = "CREATE TABLE IF NOT EXISTS Students (" +
                               "id INT PRIMARY KEY, " +
                               "name VARCHAR(50), " +
                               "branch VARCHAR(20), " +
                               "semester INT, " +
                               "percentage DOUBLE, " +
                               "yearOfPassing INT)";
            stmt.executeUpdate(sqlCreate);
            System.out.println("Table Created");

            String sqlInsert = "INSERT INTO Students VALUES " +
                               "(1, 'Amit', 'CSE', 5, 75.5, 2025), " +
                               "(2, 'Rahul', 'Civil', 8, 60.0, 2024), " +
                               "(3, 'Sneha', 'EC', 7, 82.0, 2025), " +
                               "(4, 'Priya', 'CSE', 6, 68.0, 2026)";
            stmt.executeUpdate(sqlInsert);
            System.out.println("Records Inserted");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}