package Assignments.Assignment4;
import java.sql.*;

public class ConnectionTestQ1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college_db";
        String user = "root";
        String pass = "root"; 

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connection Successful");
            con.close();
        } catch (Exception e) {
            System.out.println("Unable to connect");
            e.printStackTrace();
        }
    }
}