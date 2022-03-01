/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbdd.conectadb.meta;

import com.mysql.jdbc.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class InfoMetaDatos {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        //mostrarInfoBBDD();
        mostrarInfoTabla();
    }
    
    static void mostrarInfoBBDD() throws SQLException {
        @SuppressWarnings("UnusedAssignment")
        Connection miConexion = null;
        miConexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
        DatabaseMetaData datosBBDD = miConexion.getMetaData();
        System.out.println("Gestor de base de datos: " + datosBBDD.getDatabaseProductName());
        System.out.println("Versión del gestor: " + datosBBDD.getDatabaseProductVersion());
        System.out.println("Nombre del driver: " + datosBBDD.getDriverName());
        System.out.println("Versión del driver: " + datosBBDD.getDriverVersion());
        miConexion.close();
    }
    
    static void mostrarInfoTabla() throws SQLException {
        @SuppressWarnings("UnusedAssignment")
        Connection miConexion = null;
        @SuppressWarnings("UnusedAssignment")
        ResultSet miResultSet = null;
        miConexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
        DatabaseMetaData datosBBDD = miConexion.getMetaData();
        System.out.println("Lista de tablas");
        //miResultSet = datosBBDD.getTables(null, null, null, null);
        miResultSet = datosBBDD.getTables(null, null, "p%", null);
        while(miResultSet.next()) {
            System.out.println(miResultSet.getString("TABLE_NAME"));
        }
        System.out.println("");
        System.out.println("Campos de productos");
        miResultSet = datosBBDD.getColumns(null, null, "productos", null);
        while(miResultSet.next()) {
            System.out.println(miResultSet.getString("COLUMN_NAME"));
        }
        miConexion.close();
    }
    
}
