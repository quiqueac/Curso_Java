/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciondeconsola;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
enum Talla
{
    MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");

    private final String abreviatura;

    private Talla(String abreviatura)
    {
        this.abreviatura = abreviatura;
    }

    public String getAbreviatura()
    {
        return abreviatura;
    }
}
