<%-- 
    Document   : objetos_predefinidos
    Created on : 26-ene-2018, 11:04:56
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
        <hgroup>
            <h1>Hello World!</h1>
            <h2>Objetos predefinidos JSP</h2>
        </hgroup>
        <p>Petición de datos del navegador: <%= request.getHeader("User-agent") %></p>
        <p>Petición de idioma utilizado: <%= request.getLocale() %></p>
    </body>
</html>
