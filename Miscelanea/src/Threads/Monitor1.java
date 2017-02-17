/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

/**
 *
 * @author fidel.villero
 */
public class Monitor1 extends Thread /*implements Runnable*/ {

    private int numThread=0;
    
    public Monitor1(int numThread){
        this.numThread = numThread;
    }
    
    @Override
    public void run() {
        try{
            //Thread.sleep((long)(Math.random()*5)*100);
            //Thread.sleep(200);
            this.metodo();
        }catch(Exception er){
            System.out.println("error monitor1 "+er);
        }
    }
    
    public synchronized void metodo(){
        //for(int i=0; i<10; i++){
            System.out.println("imprimiendo monitor " + numThread);
        //}
    }
}
