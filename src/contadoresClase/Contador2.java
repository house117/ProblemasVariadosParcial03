/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contadoresClase;

import java.awt.FlowLayout;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author House
 */
public class Contador2 extends Thread{
    
    private Integer tiempo;
    private Integer contador;
    public Contador2(String titulo){
        Random random = new Random();
        this.contador = 0;
        this.tiempo = random.nextInt(4000)+1000;
    }
    
        @Override
    public void run() {
        while(true){
            contador++;
            edtNumero.setText(contador.toString());
            if(contador % 10 == 0){
                
            }
            try {
                Thread.sleep(tiempo);
            } catch (InterruptedException ex) {
                Logger.getLogger(TContador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
