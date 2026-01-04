package Assignments.Assignment4;
import java.sql.*;

public class DisplayECQ5 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college_db";
        String user = "root";
        String pass = "password";

        try {
            Connection con = DriverManager.getConnection(url, user, pass);
            
            String sql = "SELECT * FROM Students WHERE branch = 'EC' AND semester = 7";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + 
                                   ", Name: " + rs.getString("name") + 
                                   ", Percentage: " + rs.getDouble("percentage"));
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}