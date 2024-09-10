import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class signup extends HttpServlet
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
        
        pw1.println ("<html><body bgcolor = skyblue> Name : " + nm + 
                "<br>Email : " + uid + "<br>Address : " +add+
                "<br>Password : " +pass+
                "<br>Security Question : " +sq+ 
                "<br> Answer : " +ans+ "<br>Phone : " +con1+ "</body></html>");
    }
}