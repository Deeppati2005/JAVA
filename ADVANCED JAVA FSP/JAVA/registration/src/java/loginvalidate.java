import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*; //content all jdbc classes and interfaces

public class loginvalidate extends HttpServlet
{
    public void doPost(HttpServletRequest req,
            HttpServletResponse res) throws IOException,
            ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw1 = res.getWriter();
        String uid = req.getParameter("l1");  
        String pass = req.getParameter("l2");
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection
               ("jdbc:oracle:thin:@localhost:1521:XE","system","root");
            Statement stmt = con.createStatement();
            
            String q1 = "select * from reg5 where E_ID='"+uid+
                    "' and E_PASS='"+pass+"'";
                        

            ResultSet rs = stmt.executeQuery(q1);
            
            if(rs.next())
            {
                pw1.println("Welcome "+rs.getString(3));
            }
            else{
                pw1.println("Login Failed!!!");
            }
            con.close();
        }
        catch(Exception e)
        {
            pw1.println(e);
        }
    }
}