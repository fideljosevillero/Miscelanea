/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StringBuilder_VS_String;

/**
 *
 * @author fidel.villero
 */
public class Cadena {
        
    public double getDiferenciaStringBuilder(){
        long tiempo_inicio = System.nanoTime();
        StringBuilder cadena = new StringBuilder();
        for(int i=0;i>1000;i++){
            cadena.append(i);
        }
        long tiempo_fin = System.nanoTime();
        double diferencia = tiempo_fin - tiempo_inicio;
        return diferencia;
    }
    
    public double getDiferenciaString(){
        long tiempo_inicio = System.nanoTime();
        String cadena = new String();
        for(int i=0;i>1000;i++){
            cadena += i;
        }
        long tiempo_fin = System.nanoTime();
        double diferencia = tiempo_fin - tiempo_inicio;
        return diferencia;
    }
    
    
}
