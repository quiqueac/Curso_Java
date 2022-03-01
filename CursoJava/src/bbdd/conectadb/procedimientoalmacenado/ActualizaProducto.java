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
import javax.swing.JOptionPane;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ActualizaProducto {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        int nPrecio = Integer.parseInt(JOptionPane.showInputDialog("Introduce precio"));
        String nArticulo = JOptionPane.showInputDialog("Introduce nombre artículo");
        Connection miConexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
        CallableStatement miSentencia = (CallableStatement) miConexion.prepareCall("{call ACTUALIZA_PROD(?, ?)}");
        miSentencia.setInt(1, nPrecio);
        miSentencia.setString(2, nArticulo);
        miSentencia.execute();
        System.out.println("Actualización OK");
        ResultSet rs = miSentencia.executeQuery();
        while(rs.next()) {
            System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
        }
    }
    
}
