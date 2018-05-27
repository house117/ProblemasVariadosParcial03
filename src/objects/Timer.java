/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import jdk.nashorn.internal.runtime.regexp.joni.EncodingHelper;
import main.Fecha;

/**
 *
 * @author House
 */
public class Timer extends Thread{
    private  JTextField oedt;
    public Timer(JTextField text){
        this.oedt = text;
    }
    
    @Override
    public void run(){
        Fecha fecha = new Fecha(4, 5, 2018);
        while(true){
            try {
                System.out.println(fecha);
                oedt.setText(fecha.toString());
                fecha.avanzar();
                super.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Timer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
