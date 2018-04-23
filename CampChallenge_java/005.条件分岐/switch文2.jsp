<%-- 
    Document   : switch文2
    Created on : 2018/04/23, 11:58:38
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
            char name = 'A';
            switch(name) {
                case('A'):
                    out.print("英語");
                    break;
                case('あ'):
                    out.print("日本語");
                    break;
                    
            }
            %>
    </body>
</html>
