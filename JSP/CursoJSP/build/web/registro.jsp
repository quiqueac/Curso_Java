<%-- 
    Document   : registro
    Created on : 26-ene-2018, 11:23:38
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
            <h2>Usuarios registrados</h2>
        </hgroup>
        <p>Usuario registrado</p>
        <p>Nombre: <%=request.getParameter("nombre")%>&nbsp;. Apellido: <%=request.getParameter("apellido")%></p>
        <p><jsp:include page='fecha.jsp'></jsp:include></p>
    </body>
</html>
