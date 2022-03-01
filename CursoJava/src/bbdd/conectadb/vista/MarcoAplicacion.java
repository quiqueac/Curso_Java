/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bbdd.conectadb.vista;

import bbdd.conectadb.controlador.ControladorCargaSecciones;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.sql.SQLException;
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
        add(botonConsulta, BorderLayout.SOUTH);
        addWindowListener(new ControladorCargaSecciones(this));
    }
}
