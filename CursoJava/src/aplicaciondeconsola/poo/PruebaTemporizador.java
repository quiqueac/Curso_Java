/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciondeconsola.poo;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class PruebaTemporizador
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        DarHora oyente = new DarHora();
        Timer miTemporizador = new Timer(5000, oyente);
        miTemporizador.start();
        JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");
        System.exit(0);
    }
}
