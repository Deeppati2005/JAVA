<%@page import="java.sql.* "%>
<html>
    <body>
        <% String eid=request.getParameter("n1");
           String pass=request.getParameter("n2");
           session.setAttribute("name",eid);
           try
           {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection
        ("jdbc:oracle:thin:@localhost:1521:XE","system","root");
            Statement stmt=con.createStatement();
            String q1=
                  "select * from reg5 where E_ID='"+eid+"' and E_PASS='"+pass+"'";
            ResultSet rs=stmt.executeQuery(q1);
            if(rs.next())
            {
                %>
                <jsp:forward page="success.jsp"/>
                <%
            }
            else
            {
                %><jsp:forward page="failure.jsp"/>
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