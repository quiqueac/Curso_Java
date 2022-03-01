<%-- 
    Document   : recoge_datos
    Created on : 01-feb-2018, 18:50:47
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
        <h1>Hello World!</h1>
        <%
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String usuario = request.getParameter("usuario");
            String contra = request.getParameter("contra");
            String pais = request.getParameter("pais");
            String tecno = request.getParameter("tecnologias");
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection miConexion = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto_jsp","root","");
            java.sql.Statement miStatement = miConexion.createStatement();
            String instruccionSql = "INSERT INTO USUARIOS (nombre,apellido,usuario,contrasena,pais,tecnologia) values ('" + nombre + "','" + apellido + "','" + usuario + "','" + contra + "','" + pais + "','" + tecno +"')";
            miStatement.executeUpdate(instruccionSql);
            out.println("Registrado con exito");
        %>
    </body>
</html>
