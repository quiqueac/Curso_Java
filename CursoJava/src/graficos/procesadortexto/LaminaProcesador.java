/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos.procesadortexto;

import com.sun.glass.events.KeyEvent;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.InputEvent;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.text.StyledEditorKit;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class LaminaProcesador extends JPanel {
    
    private final JTextPane miArea;
    private final JMenu fuente, estilo, tamagno;
    private Font letras;
    private JButton negritaBarra, cursivaBarra, subraBarra, azulBarra, rojoBarra, amarilloBarra, izquierda, centrado, derecha, justificado;
    private JToolBar barra;

    @SuppressWarnings({"OverridableMethodCallInConstructor", "Convert2Lambda"})
    public LaminaProcesador() {
        setLayout(new BorderLayout());
        JPanel laminaMenu = new JPanel();
        JMenuBar miBarra = new JMenuBar();
        fuente = new JMenu("Fuente");
        estilo = new JMenu("Estilo");
        tamagno = new JMenu("Tamaño");
        configuraMenu("Arial", "fuente", "Arial", 9, 10);
        configuraMenu("Monospaced", "fuente", "Monospaced", 9, 10);
        configuraMenu("Verdana", "fuente", "Verdana", 9, 10);
        configuraMenu("Negrita", "estilo", "", Font.BOLD, 1);
        configuraMenu("Cursiva", "estilo", "", Font.ITALIC, 1);
        /*
        JCheckBoxMenuItem negrita = new JCheckBoxMenuItem("Negrita");
        JCheckBoxMenuItem cursiva = new JCheckBoxMenuItem("Cursiva");
        negrita.addActionListener(new StyledEditorKit.BoldAction());
        cursiva.addActionListener(new StyledEditorKit.ItalicAction());
        estilo.add(negrita);
        estilo.add(cursiva);
        */
        /*
        configuraMenu("12", "tamagno", "", 9, 12);
        configuraMenu("16", "tamagno", "", 9, 16);
        configuraMenu("20", "tamagno", "", 9, 20);
        configuraMenu("24", "tamagno", "", 9, 24);
        */
        ButtonGroup tamagnoLetra = new ButtonGroup();
        JRadioButtonMenuItem doce = new JRadioButtonMenuItem("12");
        JRadioButtonMenuItem dieciseis = new JRadioButtonMenuItem("16");
        JRadioButtonMenuItem veinte = new JRadioButtonMenuItem("20");
        JRadioButtonMenuItem veinticuatro = new JRadioButtonMenuItem("24");
        tamagnoLetra.add(doce);
        tamagnoLetra.add(dieciseis);
        tamagnoLetra.add(veinte);
        tamagnoLetra.add(veinticuatro);
        doce.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTamagno", 12));
        dieciseis.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTamagno", 16));
        veinte.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTamagno", 20));
        veinticuatro.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTamagno", 24));
        veinticuatro.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK));
        tamagno.add(doce);
        tamagno.add(dieciseis);
        tamagno.add(veinte);
        tamagno.add(veinticuatro);
        miBarra.add(fuente);
        miBarra.add(estilo);
        miBarra.add(tamagno);
        laminaMenu.add(miBarra);
        add(laminaMenu, BorderLayout.NORTH);
        miArea = new JTextPane();
        add(miArea, BorderLayout.CENTER);
        JPopupMenu emergente = new JPopupMenu();
        JMenuItem negritaE = new JMenuItem("Negrita");
        JMenuItem cursivaE = new JMenuItem("Cursiva");
        emergente.add(negritaE);
        emergente.add(cursivaE);
        negritaE.addActionListener(new StyledEditorKit.BoldAction());
        cursivaE.addActionListener(new StyledEditorKit.ItalicAction());
        miArea.setComponentPopupMenu(emergente);
        /*
        JToolBar barra = new JToolBar();
        JButton negritaBarra = new JButton(new ImageIcon("src/graficos/imagenes/bold.png"));
        JButton italicaBarra = new JButton(new ImageIcon("src/graficos/imagenes/italic.png"));
        JButton subraBarra = new JButton(new ImageIcon("src/graficos/imagenes/underline.png"));
        JButton azulBarra = new JButton(new ImageIcon("src/graficos/imagenes/azul.png"));
        JButton amarilloBarra = new JButton(new ImageIcon("src/graficos/imagenes/amarillo.png"));
        JButton rojoBarra = new JButton(new ImageIcon("src/graficos/imagenes/rojo.png"));
        JButton izquierda = new JButton(new ImageIcon("src/graficos/imagenes/izquierda.png"));
        JButton centrado = new JButton(new ImageIcon("src/graficos/imagenes/centrado.png"));
        JButton derecha = new JButton(new ImageIcon("src/graficos/imagenes/derecha.png"));
        JButton justificado = new JButton(new ImageIcon("src/graficos/imagenes/justificado.png"));
        negritaBarra.addActionListener(new StyledEditorKit.BoldAction());
        italicaBarra.addActionListener(new StyledEditorKit.ItalicAction());
        subraBarra.addActionListener(new StyledEditorKit.UnderlineAction());
        azulBarra.addActionListener(new StyledEditorKit.ForegroundAction("Pone azul", Color.BLUE));
        amarilloBarra.addActionListener(new StyledEditorKit.ForegroundAction("Pone amarillo", Color.YELLOW));
        rojoBarra.addActionListener(new StyledEditorKit.ForegroundAction("Pone rojo", Color.RED));
        izquierda.addActionListener(new StyledEditorKit.AlignmentAction("Izquierda", 0));
        centrado.addActionListener(new StyledEditorKit.AlignmentAction("Centrado", 1));
        derecha.addActionListener(new StyledEditorKit.AlignmentAction("Derecha", 2));
        justificado.addActionListener(new StyledEditorKit.AlignmentAction("Justificado", 3));
        barra.add(negritaBarra);
        barra.add(italicaBarra);
        barra.add(subraBarra);
        barra.add(azulBarra);
        barra.add(amarilloBarra);
        barra.add(rojoBarra);
        barra.add(izquierda);
        barra.add(centrado);
        barra.add(derecha);
        barra.add(justificado);
        */
        barra = new JToolBar();
        configuraBarra("src/graficos/imagenes/bold.png").addActionListener(new StyledEditorKit.BoldAction());
        configuraBarra("src/graficos/imagenes/italic.png").addActionListener(new StyledEditorKit.ItalicAction());
        configuraBarra("src/graficos/imagenes/underline.png").addActionListener(new StyledEditorKit.UnderlineAction());
        barra.addSeparator();
        configuraBarra("src/graficos/imagenes/azul.png").addActionListener(new StyledEditorKit.ForegroundAction("Pone azul", Color.BLUE));
        configuraBarra("src/graficos/imagenes/amarillo.png").addActionListener(new StyledEditorKit.ForegroundAction("Pone amarillo", Color.YELLOW));
        configuraBarra("src/graficos/imagenes/rojo.png").addActionListener(new StyledEditorKit.ForegroundAction("Pone rojo", Color.RED));
        barra.addSeparator();
        configuraBarra("src/graficos/imagenes/izquierda.png").addActionListener(new StyledEditorKit.AlignmentAction("Izquierda", 0));
        configuraBarra("src/graficos/imagenes/centrado.png").addActionListener(new StyledEditorKit.AlignmentAction("Centrado", 1));
        configuraBarra("src/graficos/imagenes/derecha.png").addActionListener(new StyledEditorKit.AlignmentAction("Derecha", 2));
        configuraBarra("src/graficos/imagenes/justificado.png").addActionListener(new StyledEditorKit.AlignmentAction("Justificado", 3));
        barra.setOrientation(1);
        add(barra, BorderLayout.WEST);
    }
    
    public JButton configuraBarra(String ruta) {
        JButton boton = new JButton(new ImageIcon(ruta));
        barra.add(boton);
        return boton;
    }
    
    public void configuraMenu(String rotulo, String menu, String tipoLetra, int estilos, int tam) {
        JMenuItem elemMenu = new JMenuItem(rotulo);
        
        if(null != menu) switch (menu) {
            case "fuente":
                fuente.add(elemMenu);
                if(null != tipoLetra) switch (tipoLetra) {
            case "Arial":
                elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("cambiaTamagno", "Arial"));
                break;
            case "Monospaced":
                elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("cambiaTamagno", "Monospaced"));
                break;
            default:
                elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("cambiaTamagno", "Verdana"));
                break;
        }
                break;
            case "estilo":
                estilo.add(elemMenu);
                if(estilos == Font.BOLD) {
                    elemMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
                    elemMenu.addActionListener(new StyledEditorKit.BoldAction());
                }
                else if(estilos == Font.ITALIC) {
                    elemMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, InputEvent.CTRL_DOWN_MASK));
                    elemMenu.addActionListener(new StyledEditorKit.ItalicAction());
                }
                break;
            case "tamagno":
                tamagno.add(elemMenu);
                elemMenu.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTamagno", tam));
                break;
            default:
                break;
        }
        
    }

}
