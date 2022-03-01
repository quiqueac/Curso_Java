/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbdd.conectadb.procedimientoalmacenado;

import com.mysql.jdbc.Connection;
import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ConsultaClientes {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Connection miConexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
        CallableStatement miSentencia = (CallableStatement) miConexion.prepareCall("{call MUESTRA_USUARIOS}");
        ResultSet rs = miSentencia.executeQuery();
        while(rs.next()) {
            System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
        }
    }
    
}
