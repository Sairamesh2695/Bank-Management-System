package bank.managment.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    Connection conn;
    Statement statement;
    public Conn(){
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSys",
                                            "root", "R@mesh2695");
            statement = conn.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
