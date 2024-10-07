<%@page import="java.sql.* "%>
<html>
    <body>
        <% String eid=request.getParameter("n1");
           String nm=request.getParameter("n2");
           String sal=request.getParameter("n3");
           session.setAttribute("name",nm);
           try
           {
             Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection
               ("jdbc:oracle:thin:@localhost:1521:XE","system","root");
            Statement stmt = con.createStatement();
            String q1="insert into emp values('"+eid+"','"+nm+"','"+sal+"')";
            int x=stmt.executeUpdate(q1);
            if(x>0)
            {
                %>
                    <jsp:forward page="success.jsp"/>    
            <%}
            else
            {%>
                    <jsp:forward page="failure.jsp"/>
            <%}
            con.close();
            }
            catch(Exception e)
            {
               out.println(e);
            }
    %>
    </body>
</html>