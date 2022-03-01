/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos.menuemergente;

import java.awt.BorderLayout;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextPane;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class LaminaEmergente extends JPanel {

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public LaminaEmergente() {
        setLayout(new BorderLayout());
        JPanel laminaMenu = new JPanel();
        JMenuBar miBarra = new JMenuBar();
        JMenu fuente = new JMenu("Fuente");
        JMenu estilo = new JMenu("Estilo");
        JMenu tamagno = new JMenu("Tamaño");
        miBarra.add(fuente);
        miBarra.add(estilo);
        miBarra.add(tamagno);
        laminaMenu.add(miBarra);
        add(laminaMenu, BorderLayout.NORTH);
        JTextPane miArea = new JTextPane();
        add(miArea, BorderLayout.CENTER);
        JPopupMenu emergente = new JPopupMenu();
        JMenuItem opcion1 = new JMenuItem("Opción 1");
        JMenuItem opcion2 = new JMenuItem("Opción 2");
        JMenuItem opcion3 = new JMenuItem("Opción 3");
        emergente.add(opcion1);
        emergente.add(opcion2);
        emergente.add(opcion3);
        miArea.setComponentPopupMenu(emergente);
    }

}
