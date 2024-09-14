import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*; //content all jdbc classes and interfaces

public class fp3 extends HttpServlet
{
    public void doPost(HttpServletRequest req,
            HttpServletResponse res) throws IOException,
            ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw1 = res.getWriter();
        String ans = req.getParameter("n1");
        try{
            HttpSession ses = req.getSession();
            String eid = (String)ses.getAttribute("email");
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection
               ("jdbc:oracle:thin:@localhost:1521:XE","system","root");
            Statement stmt = con.createStatement();
            
            String q1 = "select * from reg5 where E_ID='"+eid+
                    "' and ANS='"+ans+"'";
            
            ResultSet rs = stmt.executeQuery(q1);            
            if(rs.next())
            {
                pw1.println("<form method=post action=fp4>\n" +
"      <h2>\n" +
"        <u>Enter New Password : </u>\n <br> <br>" +
"        <input type=\"text\" name=\"n2\" />\n" +
"      </h2>\n" +
"      <button>Submit</button>\n" +
"    </form>");
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