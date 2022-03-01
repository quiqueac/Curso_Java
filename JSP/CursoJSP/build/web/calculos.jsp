<%-- 
    Document   : calculos
    Created on : 25-ene-2018, 10:56:30
    Author     : Sammy Guergachi <sguergachi at gmail.com>
--%>

<%@page import="calculos.Calculos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Clases</h1>
        <p>La suma de 5 y 7 es: <%=Calculos.suma(5, 7)%></p>
        <p>La resta de 5 y 7 es: <%=Calculos.resta(5, 7)%></p>
        <p>La multiplicación de 5 y 7 es: <%=Calculos.multiplicacion(5, 7)%></p>
        <p>La división de 5 y 7 es: <%=Calculos.division(5, 7)%></p>
    </body>
</html>
