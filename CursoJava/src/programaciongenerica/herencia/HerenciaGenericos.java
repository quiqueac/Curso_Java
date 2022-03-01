/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaciongenerica.herencia;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class HerenciaGenericos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Empleado Administrativa = new Empleado("Elena", 45, 1500, 2, 8);
        Jefe DirectoraComercial = new Jefe("Elena", 45, 1500, 2, 8);
        Empleado nuevoEmpleado = DirectoraComercial;
        */
        Pareja<Empleado> Administrativa = new Pareja<>();
        Pareja<Jefe> DirectoraComercial = new Pareja<>();
        Pareja.imprimirTrabajador(Administrativa);
        Pareja.imprimirTrabajador(DirectoraComercial);
    }
    
}
