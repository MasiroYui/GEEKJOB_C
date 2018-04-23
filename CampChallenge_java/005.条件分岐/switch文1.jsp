<%-- 
    Document   : switch文1
    Created on : 2018/04/23, 11:43:41
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
            int type = 1;
            switch (type){
                case 1:
                    out.print("oneと表示する");
                    break;
                case 2:
                    out.print("twoと表示する");
                    break;
                default:
                    out.print("想定外");
                    break;
               }
            %>
    </body>
</html>
