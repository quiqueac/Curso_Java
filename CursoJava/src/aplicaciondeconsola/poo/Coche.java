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
public class Coche 
{
    private final int ruedas;
    private final int largo;
    private final int ancho;
    private final int motor;
    private final int peso;
    private String color;
    
    public Coche()
    {
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso = 500;
        color = "";
    }
    
    public int getLargo() 
    {
        return largo;
    }

    public String getColor() 
    {
        return color;
    }
    
    public void setColor(String color)
    {
        this.color = color;
    }
}
