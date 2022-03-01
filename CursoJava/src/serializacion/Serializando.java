/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;

import programaciongenerica.arraylist.Empleado;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Serializando {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("null")
    public static void main(String[] args) {
        ObjectOutputStream escribiendoFichero = null;
        try {
            // TODO code application logic here
            Administrador jefe = new Administrador("Juan", 800, 2017, 03, 8);
            jefe.setIncentivo(5000);
            @SuppressWarnings("MismatchedReadAndWriteOfArray")
            Empleado[] personal = new Empleado[3];
            personal[0] = jefe;
            personal[1] = new Empleado("Ana", 25000,2008,10,1);
            personal[2] = new Empleado("Luis", 18000,2012,9,15);
            escribiendoFichero = new ObjectOutputStream(new FileOutputStream("src/serializacion/javaser/empleado.txt"));
            escribiendoFichero.writeObject(personal);
        } catch (IOException ex) {
            Logger.getLogger(Serializando.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                escribiendoFichero.close();
                ObjectInputStream recuperandoFichero = new ObjectInputStream(new FileInputStream("src/serializacion/javaser/empleado.txt"));
                try {
                    @SuppressWarnings("MismatchedReadAndWriteOfArray")
                    Empleado[] personalRecuperado = (Empleado[]) recuperandoFichero.readObject();
                    recuperandoFichero.close();
                    for(Empleado e : personalRecuperado) {
                        System.out.println(e);
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Serializando.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (IOException ex) {
                Logger.getLogger(Serializando.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
