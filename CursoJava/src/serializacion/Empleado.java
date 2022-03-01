/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serializacion;

import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Empleado implements Serializable {
    
    private String nombre;
    private double sueldo;
    private Date fechaContrato;
    private static final long serialVersionUID = 1L;
    
    public Empleado(String n, double s, int agno, int mes, int dia) {
        nombre = n;
        sueldo = s;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
        fechaContrato = calendario.getTime();
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getSueldo() {
        return sueldo;
    }
    
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public Date getFechaContrato() {
        return fechaContrato;
    }
    
    public void setFechaContrato(Date fechaContrato) {
        this.fechaContrato = fechaContrato;
    }
    
    public void SubirSueldo(double porcentaje) {
        double aumento = sueldo*porcentaje/100;
        sueldo+=aumento;
    }
    
    @Override
    public String toString() {
        return "Nombre = " + nombre + " ,sueldo = " + sueldo + " , fecha de contrato: " + fechaContrato;
    }
}
