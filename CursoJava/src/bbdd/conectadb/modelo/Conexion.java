/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bbdd.conectadb.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Conexion {
    
     Connection miConexion = null;

    public Conexion() {
    }
    
    public Connection dameConexion() throws SQLException {
       miConexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/curso_sql", "root", "");
       return miConexion;
    }
}
