import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*; //contains all JDBC classes and interfaces

public class nob extends HttpServlet
{
    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw1 = res.getWriter();
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection
        ("jdbc:oracle:thin:@localhost:1521:XE","system","root");
            Statement stmt = con.createStatement();
            String q1 = "select * from reg5";
            ResultSet rs = stmt.executeQuery(q1);
            int count = 0;
            while(rs.next())
            {
                count++;
            }
            pw1.println("<html><body>Total number of Entries is : " + count + "</body></html>");
            
            con.close();
        }
        catch(Exception e)
        {
            pw1.println(e);
        }
    }
}
