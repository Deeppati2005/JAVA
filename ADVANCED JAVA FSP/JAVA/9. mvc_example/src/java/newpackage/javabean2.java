package newpackage;

import java.sql.*;

public class javabean2 {
    private String name;
    private String roll;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public boolean InsertMethod() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "root");
            Statement stmt = con.createStatement();
            String q1 = "insert into student values('" + name + "','" + roll + "')";
            int x = stmt.executeUpdate(q1);
            if (x > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
        }
        return false;
    }
}