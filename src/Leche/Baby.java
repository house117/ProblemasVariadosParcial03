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
public class Baby extends Thread{
    private Double litrosBebidos;
    private BaldeLeche balde;
    private String nombre;

    public Baby(BaldeLeche baldesito, String nombre) {
        this.balde = baldesito;
        this.nombre = nombre;
        litrosBebidos = 0.0;
    }
    
    @Override
    public void run() {
        int i=0;
        while(i<5){
                synchronized(balde){
                    if(balde.beberLeche(nombre)){
                        i++;
                        litrosBebidos+=1;
                        System.out.printf("%s VA BEBIENDO %.2f LITROS DE LECHE\n", this.nombre, this.litrosBebidos);
                    }
                    try {
                        //System.out.printf("%s ESTA ESPERANDO!\n", nombre);
                        balde.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Baby.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
        }
    }
    
}
