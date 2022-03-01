/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaciongenerica.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class UsoEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Empleado listaEmpleados[];
        listaEmpleados = new Empleado[3];
        listaEmpleados[0] = new Empleado("Ana", 45, 2500, 4, 2);
        listaEmpleados[1] = new Empleado("Antonio", 55, 2000, 4, 2);
        listaEmpleados[2] = new Empleado("María", 25, 2600, 4, 2);
        */
        
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.ensureCapacity(11);
        listaEmpleados.add(new Empleado("Ana", 45, 2500, 4, 2));
        listaEmpleados.add(new Empleado("Antonio", 55, 2000, 4, 2));
        listaEmpleados.add(new Empleado("María", 25, 2600, 4, 2));
        listaEmpleados.add(new Empleado("José", 25, 2600, 4, 2));
        listaEmpleados.add(new Empleado("José", 25, 2600, 4, 2));
        listaEmpleados.add(new Empleado("José", 25, 2600, 4, 2));
        listaEmpleados.add(new Empleado("José", 25, 2600, 4, 2));
        listaEmpleados.add(new Empleado("José", 25, 2600, 4, 2));
        listaEmpleados.add(new Empleado("José", 25, 2600, 4, 2));
        listaEmpleados.add(new Empleado("José", 25, 2600, 4, 2));
        listaEmpleados.add(new Empleado("José", 25, 2600, 4, 2));
        listaEmpleados.add(new Empleado("José", 25, 2600, 4, 2));
        listaEmpleados.add(new Empleado("José", 25, 2600, 4, 2));
        listaEmpleados.add(new Empleado("José", 25, 2600, 4, 2));
        listaEmpleados.add(new Empleado("José", 25, 2600, 4, 2));
        listaEmpleados.add(new Empleado("José", 25, 2600, 4, 2));
        listaEmpleados.add(new Empleado("José", 25, 2600, 4, 2));
        listaEmpleados.add(new Empleado("José", 25, 2600, 4, 2));
        listaEmpleados.add(new Empleado("José", 25, 2600, 4, 2));
        //listaEmpleados.trimToSize();
        listaEmpleados.set(1, new Empleado("Olga", 25, 2600, 4, 2));
        System.out.println(listaEmpleados.get(2));
        System.out.println(listaEmpleados.size());
        /*
        listaEmpleados.stream().forEach((e) -> {
            System.out.println(e);
        });
        */
        Iterator <Empleado> miIterador = listaEmpleados.iterator();
        while(miIterador.hasNext()) {
            System.out.println(miIterador.next().toString());
        }
    }
    
}
