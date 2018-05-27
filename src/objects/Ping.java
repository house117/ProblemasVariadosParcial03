/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author House
 */
public class Ping extends Thread{
    private  Semaforo semaforo;
    public Ping(Semaforo semaforo){
        this.semaforo = semaforo;
    }
    
    @Override
    public void run(){
        while(true){
            if(semaforo.isSemaforo() == true){
              System.out.println("Ping");  
              semaforo.setSemaforo(false);
            }
            this.yield();
           
        }
    }
}
