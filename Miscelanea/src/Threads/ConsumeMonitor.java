/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

/**
 *
 * @author fidel.villero
 */

public class ConsumeMonitor {
    
    public static void main(String[] args) {
        Monitor1 m1 = new Monitor1(1);
        Monitor1 m2 = new Monitor1(2);
        Monitor1 m3 = new Monitor1(3);
        Monitor1 m4 = new Monitor1(4);
        Monitor1 m5 = new Monitor1(5);
        Monitor1 m6 = new Monitor1(6);
        
        m1.start();
        m2.start();
        m3.start();
        m4.start();
        m5.start();
        m6.start(); 
    }
}
