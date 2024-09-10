import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class c3 extends HttpServlet
{
    public void doPost(HttpServletRequest req,
            HttpServletResponse res) throws IOException,
            ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw1 = res.getWriter();
        Cookie a[]=req.getCookies();
        if(a!=null)
        {
            for(int i=0;i<a.length;i++)
            {
                if(a[i].getName().equals("nm"))
                {
                    pw1.println("YOUR NAME IS : "+a[i].getValue());
                }
                else{
                    res.sendRedirect("c1.html");
                }
            }
        }
       
    }
}