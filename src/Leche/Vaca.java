/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leche;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author House
 */
public class Vaca extends Thread{
    BaldeLeche balde;

    public Vaca(BaldeLeche balde) {
        this.balde = balde;
    }

    @Override
    public void run() {
        while(true){           
            try {
                synchronized(balde){
                    balde.agregarLeche();
                    balde.notifyAll();
                    
                } 
                this.sleep(30);
                
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Vaca.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
