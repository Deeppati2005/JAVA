import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*; //content all jdbc classes and interfaces

public class dynamicfetch extends HttpServlet
{
    public void doPost(HttpServletRequest req,
            HttpServletResponse res) throws IOException,
            ServletException
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
            pw1.println("<html><body><table border=2 width=100%>");
            pw1.println("<tr>"
                    + "<th>Email Id </th>"
                    + "<th>Password </th>"
                    + "<th>Name </th>"+
                    "<th>SQ </th>"+ 
                    "<th>ANS </th>"+
                    "<th>E_CNO </th>"+
                    "<th>E_ADD </th>"+
                    "</tr>");
            while(rs.next())
            {
                pw1.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+
                 "</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+
                 "</td><td>"+rs.getString(5)+"</td><td>"
                        +rs.getString(6)+"</td><td>"+rs.getString(7)+"</td><tr>");
            }
            pw1.println("</table></body></html>");
            con.close();
        }
        catch(Exception e)
        {
            pw1.println(e);
        }
    }
}