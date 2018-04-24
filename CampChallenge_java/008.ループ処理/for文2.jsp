<%-- 
    Document   : for文2
    Created on : 2018/04/23, 16:01:50
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
           String num = "";
            for(int i=0;i<30;i++){
            num = num + "A";
            }
            out.print(num);
            %>
    </body>
</html>
