/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bbdd.conectadb.controlador;

import bbdd.conectadb.vista.MarcoAplicacion;
import bbdd.conectadb.modelo.CargaSecciones;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ControladorCargaSecciones extends WindowAdapter {
    CargaSecciones obj = new CargaSecciones();
    private MarcoAplicacion elMarco;

    public ControladorCargaSecciones(MarcoAplicacion elMarco) {
        this.elMarco = elMarco;
    }
    
    @Override
    public void windowOpened(WindowEvent e) {
        try {
            obj.ejecutaConsultas();
            while(obj.rs.next()) {
                elMarco.secciones.addItem(obj.rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCargaSecciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
