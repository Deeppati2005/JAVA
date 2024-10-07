import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class h3 extends HttpServlet {
    public void doPost(HttpServletRequest req,
            HttpServletResponse res) throws IOException,
            ServletException {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        String s1 = req.getParameter("n1");
        pw.println("Welcome " + s1);
    }
}