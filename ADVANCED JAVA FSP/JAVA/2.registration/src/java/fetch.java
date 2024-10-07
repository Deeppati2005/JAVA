import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*; //content all jdbc classes and interfaces

public class fetch extends HttpServlet {
    public void doPost(HttpServletRequest req,
            HttpServletResponse res) throws IOException,
            ServletException {
        res.setContentType("text/html");
        PrintWriter pw1 = res.getWriter();
        String uid = req.getParameter("r1");
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection
            ("jdbc:oracle:thin:@localhost:1521:XE", "system", "root");
            Statement stmt = con.createStatement();

            String q1 = "select * from reg5 where E_ID='" + uid + "'";

            ResultSet rs = stmt.executeQuery(q1);

            if (rs.next()) {
                pw1.println("<html> <body bgcolor=lavender>Email Id is : " + rs.getString(1));
                pw1.println("<br>Name is : " + rs.getString(3));
                pw1.println("<br>Password is : " + rs.getString(2));
                pw1.println("<br>Security Question is : " + rs.getString(4));
                pw1.println("<br>Answer is : " + rs.getString(5));
                pw1.println("<br>ContactNo is : " + rs.getString(6) +
                        "</body></html>");
            } else {
                pw1.println("Information Not Found");
            }
            con.close();
        } catch (Exception e) {
            pw1.println(e);
        }
    }
}