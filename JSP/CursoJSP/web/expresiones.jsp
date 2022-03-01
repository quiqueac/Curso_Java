<%-- 
    Document   : expresiones
    Created on : 25-ene-2018, 10:19:18
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
        <h1>Ejemplo de expresiones</h1>
        <p>Convirtiendo a mayúsculas: <%=new String("juan").toUpperCase()%></p>
        <p>La suma de 5 y 7 es: <%=5+7%></p>
        <p>10 es mayor que 100: <%=10>100%></p>
    </body>
</html>
