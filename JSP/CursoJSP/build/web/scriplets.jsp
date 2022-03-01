<%-- 
    Document   : scriplets
    Created on : 25-ene-2018, 10:27:00
    Author     : Sammy Guergachi <sguergachi at gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Scriplets</h1>
        <%for(int i=0;i<10;i++){out.println("Este es el mensaje "+i+"<br>");}%>
    </body>
</html>
