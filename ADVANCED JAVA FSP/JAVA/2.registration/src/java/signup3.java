import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*; //content all jdbc classes and interfaces

public class signup3 extends HttpServlet
{
    public void doPost(HttpServletRequest req,
            HttpServletResponse res) throws IOException,
            ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw1 = res.getWriter();
        String uid = req.getParameter("n1");
        String pass = req.getParameter("n2");
        String nm = req.getParameter("n3");
        String add = req.getParameter("n4");
        String sq = req.getParameter("n5");
        String ans = req.getParameter("n6");
        String con1 = req.getParameter("n7");
        
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection
               ("jdbc:oracle:thin:@localhost:1521:XE","system","root");
            Statement stmt = con.createStatement();
            
            String q1 = "insert into reg5 values('"+uid+"','"+pass+
                    "','"+nm+"','"+sq+"','"+ans+
                            "','"+con1+"','"+add+"')";
            
            int x = stmt.executeUpdate(q1);
            if (x>0)
            {
                pw1.println("<html><body>Registration Sucess <br>"
                +"<a href=reg.html>Goto Login Page </a> </body> </html>");
            }
            else{
                pw1.println("Registration Unsuccess");
            }
            con.close();
        }
        catch(Exception e)
        {
            pw1.println(e);
        }
    }
}