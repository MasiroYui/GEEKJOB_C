<%-- 
    Document   : kadaiFotuneTelling
    Created on : 2018/05/01, 11:05:45
    Author     : absolute
--%>
<%@page import="org.camp.servlet.kadaiResultData" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            kadaiResultData data = (kadaiResultData)request.getAttribute("DATA");
            %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            if (data != null) {
            out.print("<h1>あなたの" + data.getD() + "の運勢は、" + data.getLuck() + "です！</h1>");
            }
            %>
    </body>
</html>
