/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

/**
 *
 * @author fidel.villero
 */
class Monitor2 extends Thread {
    
    @Override
    public void run() {
        metodo();
    }
    
    public synchronized void metodo(){
        for(int i=0; i<10; i++){
            System.out.println("imprimiendo monitor2 " + i);
        }
    }
}

//class test {
//    public static void main(String[] args) {
//        Monitor2 m2 = new Monitor2();
//        m2.start();
//    }
//}
