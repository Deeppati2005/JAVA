import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*; //content all jdbc classes and interfaces

public class fp2 extends HttpServlet {
    public void doPost(HttpServletRequest req,
            HttpServletResponse res) throws IOException,
            ServletException {
        res.setContentType("text/html");
        PrintWriter pw1 = res.getWriter();
        String uid = req.getParameter("l1");
        try {
            HttpSession ses = req.getSession();
            ses.setAttribute("email", uid);
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "root");
            Statement stmt = con.createStatement();
            String q1 = "select * from reg5 where E_ID='" + uid + "'";
            ResultSet rs = stmt.executeQuery(q1);
            if (rs.next()) {
                pw1.println("<form method=post action=fp3> <h1> Security Question :"
                        + rs.getString(4) +
                        "</h1>" +
                        "Answer : "
                        + "<input type=text name=n1><br><br>"
                        + "<input type=submit value=SUBMIT></form>");
            } else {
                pw1.println("Failure");
            }
        } catch (Exception e) {
            pw1.println(e);
        }
    }
}