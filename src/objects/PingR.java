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
public class PingR implements Runnable{
    private JTextField oedt;

    public PingR(JTextField oedt) {
        this.oedt = oedt;
    }
    
    @Override
    public void run() {
            try {
                while(true){
                    
                    synchronized(System.out){
                        oedt.setText("Ping");
                        Thread.sleep(1000);
                    }
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Pong.class.getName()).log(Level.SEVERE, null, ex);
            }   
    }
    
    
}
