/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplicaciondeconsola.poo;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Furgoneta extends Coche
{
    private int capacidad;
    private int plaza;
    
    public Furgoneta(int capacidad, int plaza)
    {
        super(); //Llama al constructor de la clase padre
        this.capacidad = capacidad;
        this.plaza = plaza;
    }

    public int getCapacidad() 
    {
        return capacidad;
    }

    public int getPlaza() 
    {
        return plaza;
    }

    public void setCapacidad(int capacidad) 
    {
        this.capacidad = capacidad;
    }

    public void setPlaza(int plaza) 
    {
        this.plaza = plaza;
    }
}
