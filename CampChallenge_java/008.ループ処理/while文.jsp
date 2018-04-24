<%-- 
    Document   : while文
    Created on : 2018/04/24, 11:20:37
    Author     : absolute
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            float num = 1000;
            while( num >=100 ){
                num = num / 2;
            }
            out.print(num);
            %>
    </body>
</html>
