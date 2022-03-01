/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.mapa;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class PruebaMapa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap <String, Empleado> personal = new HashMap <>();
        personal.put("145", new Empleado("Juan"));
        personal.put("146", new Empleado("Ana"));
        personal.put("147", new Empleado("Antonio"));
        personal.put("148", new Empleado("Sandra"));
        System.out.println(personal);
        personal.remove("146");
        System.out.println(personal);
        personal.put("148", new Empleado("Natalia"));
        System.out.println(personal);
        //System.out.println(personal.entrySet());
        personal.entrySet().stream().forEach((entrada) -> {
            String clave = entrada.getKey();
            Empleado valor = entrada.getValue();
            System.out.println("Clave: " + clave + ". Valor: " + valor);
        });
    }
    
}
