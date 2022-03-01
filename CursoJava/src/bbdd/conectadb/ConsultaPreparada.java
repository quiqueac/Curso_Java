/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbdd.conectadb;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ConsultaPreparada {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Connection miConexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/curso_sql", "root", "");
        PreparedStatement miSentencia = miConexion.prepareStatement("SELECT NOMBREARTÍCULO, SECCIÓN, PAÍSDEORIGEN FROM PRODUCTOS WHERE SECCIÓN = ? AND PAÍSDEORIGEN = ?");
        miSentencia.setString(1, "deportes");
        miSentencia.setString(2, "USA");
        try (ResultSet rs = miSentencia.executeQuery()) {
            while(rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }
        }
        System.out.println("\nEjecución de segunda consulta");
        System.out.println("");
        miSentencia.setString(1, "cerámica");
        miSentencia.setString(2, "China");
        try (ResultSet rs = miSentencia.executeQuery()) {
            while(rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }
        }
    }
    
}
