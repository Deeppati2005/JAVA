import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*; //content all jdbc classes and interfaces

public class update extends HttpServlet {
    public void doPost(HttpServletRequest req,
            HttpServletResponse res) throws IOException,
            ServletException {
        res.setContentType("text/html");
        PrintWriter pw1 = res.getWriter();
        String uid = req.getParameter("r1");
        String ncno = req.getParameter("r2");

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "root");
            Statement stmt = con.createStatement();

            String q1 = "update reg5 set E_CNO='" + ncno + "'where E_ID='" + uid + "'";

            int x = stmt.executeUpdate(q1);
            if (x > 0) {
                pw1.println("<html><body>Update Sucess <br>"
                        + "<a href=update.html>Goto Update Page </a> </body> </html>");
            } else {
                pw1.println("Update Unsuccess");
            }
            con.close();
        } catch (Exception e) {
            pw1.println(e);
        }
    }
}