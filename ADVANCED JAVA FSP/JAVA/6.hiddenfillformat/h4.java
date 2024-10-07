public class h4 {
  // cookie
  String s1 = req.getParameter("c1");
  Cookie ob = new Cookie("nm1", s1);res.addCookie(ob);

  // httpsession

  HttpSession ses = req.getSession();ses.setAttribute("nm1","s1");

  // url

  <a href=h3?id="+name+">Click Here</a>
}
