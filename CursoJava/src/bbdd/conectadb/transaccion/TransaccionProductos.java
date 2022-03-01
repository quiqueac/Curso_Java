/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbdd.conectadb.transaccion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class TransaccionProductos {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    @SuppressWarnings("null")
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        @SuppressWarnings("UnusedAssignment")
        Connection miConexion = null;
        try {			
            miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
            miConexion.setAutoCommit(false);
            Statement miStatement =miConexion.createStatement();
            String instruccionSql_1="DELETE FROM PRODUCTOS WHERE PAÍSDEORIGEN = 'ITALIA'";
            String instruccionSql_2="DELETE FROM PRODUCTOS WHERE PRECIO > 300";
            String instruccionSql_3="UPDATE PRODUCTOS SET PRECIO = PRECIO * 1.15";
            boolean ejecutar = ejecutarTransaccion();
            if(ejecutar) {
                miStatement.executeUpdate(instruccionSql_1);
                miStatement.executeUpdate(instruccionSql_2);
                miStatement.executeUpdate(instruccionSql_3);
                miConexion.commit();
                System.out.println("Se ejecutó la transacción correctamente");
            }
            else {
                System.out.println("No se realizó cambio alguno");
            }
        }
        catch(Exception e) {
            miConexion.rollback();
            System.out.println("Algo salió mal");
        }
    }

    private static boolean ejecutarTransaccion() {
        String ejecucion = JOptionPane.showInputDialog("¿Ejecutamos transacción?");
        return ejecucion.contains("Sí");
    }
    
}
