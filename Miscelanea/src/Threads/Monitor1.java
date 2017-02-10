/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

/**
 *
 * @author fidel.villero
 */
public class Monitor1 implements Runnable {

    @Override
    public void run() {
        this.metodo();
    }
    
    public synchronized void metodo(){
        for(int i=0; i<10; i++){
            System.out.println("imprimiendo monitor1 " + i);
        }
    }
}
