<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<html:form action="/login1">
    <table border="0">
        <tbody>
            <tr>
                <td>Enter your name : </td>
                <td><html:text property="name"/></td>
            </tr>
            <tr>
                <td>Enter your email : </td>
                <td><html:text property="email"/></td>
            </tr>
            <tr>
                <td></td>
                <td><html:submit value="Login"/></td>
            </tr>
        </tbody>
    </table>
</html:form>