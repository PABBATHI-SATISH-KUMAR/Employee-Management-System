package employee.management.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;

    public Conn () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///employeemanagementsystem", "root", "S@tish_1_kum@r");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
