/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bbdd.conectadb;

import com.mysql.jdbc.Connection;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MarcoAplicacion extends JFrame {
    public final JComboBox secciones;
    private final JComboBox paises;
    private final JTextArea resultado;
    private PreparedStatement enviaConsultaSeccion;
    private final String consultaSeccion = "SELECT NOMBREARTÍCULO, SECCIÓN, PRECIO, PAÍSDEORIGEN FROM PRODUCTOS WHERE SECCIÓN = ?";
    private final Connection miConexion;
    private final String consultaPais = "SELECT NOMBREARTÍCULO, SECCIÓN, PRECIO, PAÍSDEORIGEN FROM PRODUCTOS WHERE PAÍSDEORIGEN = ?";
    private PreparedStatement enviaConsultaPais;
    private PreparedStatement enviaConsultaTodo;
    private final String consultaTodos = "SELECT NOMBREARTÍCULO, SECCIÓN, PRECIO, PAÍSDEORIGEN FROM PRODUCTOS WHERE SECCIÓN = ? AND PAÍSDEORIGEN = ?";

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public MarcoAplicacion() throws HeadlessException, SQLException {
        setTitle ("Consulta BBDD");
        setBounds(500,300,400,400);
        setLayout(new BorderLayout());
        JPanel menus = new JPanel();
        menus.setLayout(new FlowLayout());
        secciones = new JComboBox();
        secciones.setEditable(false);
        secciones.addItem("Todos");
        paises = new JComboBox();
        paises.setEditable(false);
        paises.addItem("Todos");
        resultado = new JTextArea(4,50);
        resultado.setEditable(false);
        add(resultado);
        menus.add(secciones);
        menus.add(paises);
        add(menus, BorderLayout.NORTH);
        add(resultado, BorderLayout.CENTER);
        JButton botonConsulta = new JButton("Consulta");
        botonConsulta.addActionListener((ActionEvent e) -> {
            try {
                ejecutaConsulta();
            } catch (SQLException ex) {
                Logger.getLogger(MarcoAplicacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        add(botonConsulta, BorderLayout.SOUTH);
        miConexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/curso_sql", "root", "");
        Statement sentencia = miConexion.createStatement();
        String consulta = "SELECT DISTINCTROW SECCIÓN FROM PRODUCTOS";
        try (ResultSet rs = sentencia.executeQuery(consulta)) {
            while(rs.next()) {
                secciones.addItem(rs.getString(1));
            }
        }
        consulta = "SELECT DISTINCTROW PAÍSDEORIGEN FROM PRODUCTOS";
        try (ResultSet rs = sentencia.executeQuery(consulta)) {
            while(rs.next()) {
                paises.addItem(rs.getString(1));
            }
        }
    }
    
    @SuppressWarnings("null")
    private void ejecutaConsulta() throws SQLException {
        @SuppressWarnings("UnusedAssignment")
        ResultSet rs = null;
        resultado.setText("");
        String seccion = (String) secciones.getSelectedItem();
        String pais = (String) paises.getSelectedItem();
        if(!seccion.equals("Todos") && pais.equals("Todos")) {
            enviaConsultaSeccion = miConexion.prepareStatement(consultaSeccion);
            enviaConsultaSeccion.setString(1, seccion);
            rs = enviaConsultaSeccion.executeQuery();
        }
        else if(seccion.equals("Todos") && !pais.equals("Todos")) {
            enviaConsultaPais = miConexion.prepareStatement(consultaPais);
            enviaConsultaPais.setString(1, pais);
            rs = enviaConsultaPais.executeQuery();
        }
        else if(!seccion.equals("Todos") && !pais.equals("Todos")) {
            enviaConsultaTodo = miConexion.prepareStatement(consultaTodos);
            enviaConsultaTodo.setString(1, seccion);
            enviaConsultaTodo.setString(2, pais);
            rs = enviaConsultaTodo.executeQuery();
        }
        while(rs.next()) {
            resultado.append(rs.getString(1));
            resultado.append(", ");
            resultado.append(rs.getString(2));
            resultado.append(", ");
            resultado.append(rs.getString(3));
            resultado.append(", ");
            resultado.append(rs.getString(4));
            resultado.append("\n");
        }
    }
    
}
