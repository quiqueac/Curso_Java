package graficos.ventanaemergente;

import javax.swing.*;

import java.awt.event.*;

public class TiposCuadrosDialogos {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CuadrosDialogos mimarco = new CuadrosDialogos();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);
    }

}

class CuadrosDialogos extends JFrame {
	
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public CuadrosDialogos() {
        setBounds (500,300,400,250);	
        add(new LaminaCuadrosDialogos());
    }
	
}

class LaminaCuadrosDialogos extends JPanel {
    
    private final JButton boton1, boton2, boton3, boton4;
	
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public LaminaCuadrosDialogos() {
        boton1 = new JButton("boton 1");		
        boton2 = new JButton("boton2");	
        boton3 = new JButton("boton3");	 
        boton4 = new JButton("boton4");
        boton1.addActionListener(new AccionBotones());
        boton2.addActionListener(new AccionBotones());
        boton3.addActionListener(new AccionBotones());
        boton4.addActionListener(new AccionBotones());
        add(boton1);
        add(boton2);
        add(boton3);
        add(boton4);
    }
	
private class AccionBotones implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == boton1) {
            //System.out.println("Has pulsado el botón 1");
            //JOptionPane.showMessageDialog(LaminaCuadrosDialogos.this, "Mensaje de prueba");
            JOptionPane.showMessageDialog(LaminaCuadrosDialogos.this, "Mensaje de prueba", "Advertencia", 2);
        }
        else if(e.getSource() == boton2) {
            //System.out.println("Has pulsado el botón 2");
            JOptionPane.showInputDialog(LaminaCuadrosDialogos.this, "Introduce nombre", "Introducción datos", 2);
        }
        else if(e.getSource() == boton3) {
            JOptionPane.showConfirmDialog(LaminaCuadrosDialogos.this, "Elige opción", "V Confirmar", 1);
        }
        else {
            //System.out.println("Has pulsado el botón 4");
            JOptionPane.showOptionDialog(LaminaCuadrosDialogos.this, "Elige", "V de opciones", 1, 1, null, null, null);
            
        }
    }
    
}

}
