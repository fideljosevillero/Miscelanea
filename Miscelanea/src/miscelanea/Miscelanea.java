/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miscelanea;

import Coleccion_Iterador.Coleccion;
import StringBuilder_VS_String.Cadena;
import Threads.Monitor1;
import java.text.DecimalFormat;

/**
 *
 * @author fidel.villero
 */
class Miscelanea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // StringBuilder VS String
//        Cadena c = new Cadena();
//        // la cantidad es en milisegundos
//        System.out.println("La diferencia con StringBuilder es: "+c.getDiferenciaStringBuilder());
//        System.out.println("La diferencia con String es: "+c.getDiferenciaString());
//        
//        // iterador
//        Coleccion co = new Coleccion();
//        co.iterador();
        
        // Threads
//        Monitor1 d = new Monitor1();
//        Monitor1 d2 = new Monitor1();
//        Thread m = new Thread(d);
//        Thread m2 = new Thread(d2);
//        m.start();
//        m2.start();
        
        //DecimalFormat formateador = new DecimalFormat("###,###.##");
//        DecimalFormat formateador = new DecimalFormat("########");
//        //Este daria a la salida 1,000
//        System.out.println (formateador.format (1000));
//        //Este otro 10,000
//        System.out.println (formateador.format (Integer.parseInt("10,000")));
        
//        int d = Integer.parseInt("26,138");
//        System.out.println("resultado " + d);
        
        String s = "10,000";
        String t = s.replace(",", "");
        System.out.println(t);
    }
}
