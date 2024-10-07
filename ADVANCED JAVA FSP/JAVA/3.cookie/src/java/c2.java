import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class c2 extends HttpServlet {
    
    public void doPost(HttpServletRequest req,
            HttpServletResponse res) throws IOException,
            ServletException {
        res.setContentType("text/html");
        PrintWriter pw1 = res.getWriter();
        String s1 = req.getParameter("c1");
        Cookie ob = new Cookie("nm", s1); // creating a cookie
        res.addCookie(ob); // Adding cookie to clientside
        pw1.println("<form method=post action=c3>"
                + "<input type=submit value=submit></form>");
    }
}