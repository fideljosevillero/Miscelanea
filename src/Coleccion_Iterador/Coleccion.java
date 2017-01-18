/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Coleccion_Iterador;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
/**
 *
 * @author fidel.villero
 */
public class Coleccion {
    
    
    public void iterador(){
        /* 
         * colocando el tamano de las lista se mejora el rendimiento dado que 
         * el procesador tiene generar el espacio solo en 1 ocacion.
        */
        List<String> lista = new ArrayList<String>(7);
        lista.add("1");
        lista.add("2");
        lista.add("3");
        lista.add("4");
        lista.add("5");
        lista.add("6");
        lista.add("7");
        
        Iterator<String> it = lista.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
    // LinkedLis Lista enlazada
    public void inLinkedList(){
        LinkedList<String> lista = new LinkedList<String>();
    }
    
}
