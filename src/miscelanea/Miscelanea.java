/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miscelanea;

import Coleccion_Iterador.Coleccion;
import StringBuilder_VS_String.Cadena;

/**
 *
 * @author fidel.villero
 */
public class Miscelanea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // StringBuilder VS String
        Cadena c = new Cadena();
        // la cantidad es en milisegundos
        System.out.println("La diferencia con StringBuilder es: "+c.getDiferenciaStringBuilder());
        System.out.println("La diferencia con String es: "+c.getDiferenciaString());
        
        // iterador
        Coleccion co = new Coleccion();
        co.iterador();
        
        
    }
}
