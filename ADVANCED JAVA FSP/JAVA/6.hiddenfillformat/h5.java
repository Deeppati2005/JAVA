public class h5 {
  //cookie
  Cookie a[] = req.getCookies();
  if(a!=null)
  {
    for(int i =0 i<a.length;i++)
    {
      if(a[i].getName().equals("nm1"))
      {
        pw.println("welcome : "+a[i].getValue());
      }
    }
  }

  //httpSession

  HttpSession ses = req.getSession();
  String name = (String) ses.getAttribute("nm1");
}
