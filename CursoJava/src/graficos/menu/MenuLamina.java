/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos.menu;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MenuLamina extends JPanel {

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public MenuLamina() {
        JMenuBar miBarra = new JMenuBar();
        JMenu archivo = new JMenu("Archivo");
        JMenu edicion = new JMenu("Edición");
        JMenu herramientas = new JMenu("Herramientas");
        JMenu opciones = new JMenu("Opciones");
        JMenuItem guardar = new JMenuItem("Guardar");
        JMenuItem guardarComo = new JMenuItem("Guardar como");
        JMenuItem cortar = new JMenuItem("Cortar", new ImageIcon("src/graficos/imagenes/cortar.gif"));
        JMenuItem copiar = new JMenuItem("Copiar", new ImageIcon("src/graficos/imagenes/copiar.gif"));
        JMenuItem pegar = new JMenuItem("Pegar", new ImageIcon("src/graficos/imagenes/pegar.gif"));
        //copiar.setHorizontalTextPosition(SwingConstants.LEFT);
        JMenuItem generales = new JMenuItem("Generales");
        JMenuItem opcion1 = new JMenuItem("Opción 1");
        JMenuItem opcion2 = new JMenuItem("Opción 2");
        opciones.add(opcion1);
        opciones.add(opcion2);
        archivo.add(guardar);
        archivo.add(guardarComo);
        edicion.add(cortar);
        edicion.add(copiar);
        edicion.add(pegar);
        edicion.addSeparator();
        edicion.add(opciones);
        herramientas.add(generales);
        miBarra.add(archivo);
        miBarra.add(edicion);
        miBarra.add(herramientas);
        add(miBarra);
    }

}
