<%-- 
    Document   : 連想配列の作成
    Created on : 2018/04/23, 14:19:57
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
        <%@page import = "java.util.HashMap" %>
        <%
            HashMap<String,String> data1 = new HashMap<String,String>();
            HashMap<String,String> data2 = new HashMap<String,String>();
            HashMap<String,String> data3 = new HashMap<String,String>();
            HashMap<String,String> data4 = new HashMap<String,String>();
            data1.put("1","AAA");
            data2.put("hello","wolrd");
            data3.put("soeda","33");
            data4.put("20","20");
            
            %>
    </body>
</html>
