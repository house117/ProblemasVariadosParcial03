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
public class Pong extends Thread{
    private  Semaforo semaforo;
    public Pong(Semaforo semaforo){
        this.semaforo = semaforo;
    }
    
    @Override
    public void run(){
        int i =0;
        while(true){
            i++;
            if(semaforo.isSemaforo() == false){
                System.out.println("PONG"+i);
                semaforo.setSemaforo(true);
            }
            this.yield();
            
        }
    }
}
