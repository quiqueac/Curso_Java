/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbdd.conectadb;

import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JFrame;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class AplicacionConsulta {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws HeadlessException, SQLException {
        // TODO code application logic here
        JFrame mimarco = new MarcoAplicacion();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);
    }
    
}
