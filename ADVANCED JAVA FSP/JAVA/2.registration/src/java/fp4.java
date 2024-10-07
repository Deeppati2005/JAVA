import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*; //content all jdbc classes and interfaces

public class fp4 extends HttpServlet
{
    public void doPost(HttpServletRequest req,
            HttpServletResponse res) throws IOException,
            ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw1 = res.getWriter();
        try{
            HttpSession ses = req.getSession();
            String eid = (String)ses.getAttribute("email");
            String npass = req.getParameter("n2");
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection
               ("jdbc:oracle:thin:@localhost:1521:XE","system","root");
            Statement stmt = con.createStatement();
            
            String q1 = 
                    "update reg5 set E_PASS='"+npass+"' where E_ID='"+eid+"'";
            
            ResultSet rs = stmt.executeQuery(q1);            
            if(rs.next())
            {
                pw1.println("Password Changed Succesfully<br>"
                        + "<a href = login.html>Go to Login Page </a>");
            }
            else{
                pw1.println("Failure");
            }
            con.close();
        }
        catch(Exception e)
        {
            pw1.println(e);
        }
    }
}