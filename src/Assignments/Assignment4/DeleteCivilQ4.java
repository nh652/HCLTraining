package Assignments.Assignment4;
import java.sql.*;

public class DeleteCivilQ4 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college_db";
        String user = "root";
        String pass = "password";

        try {
            Connection con = DriverManager.getConnection(url, user, pass);
            
            String sql = "DELETE FROM Students WHERE branch = 'Civil' AND yearOfPassing = 2024";
            PreparedStatement pstmt = con.prepareStatement(sql);
            
            int rows = pstmt.executeUpdate();
            System.out.println(rows + " records deleted.");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}