<%@page import="java.sql.* "%>
<html>
    <body>
        <% String eid=request.getParameter("n1");
           String nm=request.getParameter("n3");
           String pass=request.getParameter("n2");
           String add=request.getParameter("n4");
           String conc=request.getParameter("n7");
           String secure=request.getParameter("n5");
           String ans=request.getParameter("n6");
           session.setAttribute("name",nm);
           try
           {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection
        ("jdbc:oracle:thin:@localhost:1521:XE","system","root");
            Statement stmt=con.createStatement();
            String q1=
             "insert into reg5 values('"+eid+"','"+pass+"','"+nm+"','"+secure+"','"+ans+"','"+conc+"','"+add+"')";
            int x=stmt.executeUpdate(q1);
            if(x>0)
            {
                %>
                <jsp:forward page="success.jsp"/>
                <%}
            else
            {%><jsp:forward page="failure.jsp"/>
            <%
            }
            con.close();
            }
            catch(Exception e)
            {
               out.println(e);
            }
    %></body>
</html>