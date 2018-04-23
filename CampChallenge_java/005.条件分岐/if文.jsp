<%-- 
    Document   : if文
    Created on : 2018/04/23, 10:38:40
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
            int num = 1;
            if(num == 1){
                out.print("1です！");
            } else if (num == 2){
                out.print("プログラミングキャンプ！");
            } else {
                out.print("その他です！");
            }
            %>
    </body>
</html>
