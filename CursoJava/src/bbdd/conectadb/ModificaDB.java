/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbdd.conectadb;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ModificaDB {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Connection miConexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/curso_sql", "root", "");
        Statement miStatement = (Statement) miConexion.createStatement();
        String instruccionSql = "DELETE FROM PRODUCTOS WHERE CÓDIGOARTÍCULO = 'AR77'";
        miStatement.executeUpdate(instruccionSql);
        System.out.println("Datos eliminados correctamente");
    }
    
}
