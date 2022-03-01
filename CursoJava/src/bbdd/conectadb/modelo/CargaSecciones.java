/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bbdd.conectadb.modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class CargaSecciones {
    private final Conexion miConexion;
    public ResultSet rs;

    public CargaSecciones() {
        miConexion = new Conexion();
    }
    
    @SuppressWarnings("null")
    public String ejecutaConsultas() throws SQLException {
        Productos miProducto = null;
        Connection accesoBBDD = miConexion.dameConexion();
        Statement secciones = accesoBBDD.createStatement();
        rs = secciones.executeQuery("SELECT DISTINCT SECCIÓN FROM PRODUCTOS");
        while(rs.next()) {
            rs.previous();
            miProducto = new Productos();
            miProducto.setSeccion(rs.getString(1));
            return miProducto.getSeccion();
        }
        rs.close();
        return miProducto.getSeccion();
    }
}
