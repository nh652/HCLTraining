package Assignments.Assignment4;
import java.sql.*;

public class UpdateCSEQ3 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college_db";
        String user = "root";
        String pass = "root";

        try {
            Connection con = DriverManager.getConnection(url, user, pass);
            
            String sql = "UPDATE Students SET percentage = percentage + 5 WHERE branch = 'CSE'";
            PreparedStatement pstmt = con.prepareStatement(sql);
            
            int rows = pstmt.executeUpdate();
            System.out.println(rows + " records updated.");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}