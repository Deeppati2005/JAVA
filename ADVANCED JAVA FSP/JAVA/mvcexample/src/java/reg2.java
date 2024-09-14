import java.io.*; //this package is for PrintWriter class
import javax.servlet.*; 
import javax.servlet.http.*;
import newpackage.*;
public class reg2 extends HttpServlet
{
    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();
        String name=req.getParameter("n1");
        String roll=req.getParameter("n2");
        javabean2 ob=new javabean2();
        ob.setName(name);
        ob.setRoll(roll);
        boolean result=ob.InsertMethod();
        if(result==true)
        {
            pw.println("SUCCESS");
        }
        else
        {
           pw.println("FAILURE");
        }
    }
}