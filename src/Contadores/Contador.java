/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contadores;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

/**
 *
 * @author House
 */
public class Contador extends JTextField implements Runnable{
    private Integer contando;
    private Integer dormir;


    private Semaforo semaforo;
    private JProgressBar barritaProgreso;
    public Contador(Integer dormir, Semaforo semaforo){
        this.contando = 0;
        this.dormir = dormir;
        this.semaforo = semaforo;
        barritaProgreso = null;
    }
    @Override
    public void run() {
        while(true){
            setContando((Integer) (getContando() + 1));
            if(barritaProgreso != null){
                barritaProgreso.setValue(contando);
            }
            super.setText(String.format("%d", getContando()));
            try {
                Thread.sleep(dormir);
            } catch (InterruptedException ex) {
                Logger.getLogger(Contador.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(getContando() != 0 && getContando()%10 == 0){
                synchronized(semaforo){
                    if(semaforo.puedoContinuar()){
                        semaforo.notifyAll();
                    }else{
                        try {
                            semaforo.wait();
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Contador.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    
                }
                    
                
            }
        }
    }

    /**
     * @return the contando
     */
    public Integer getContando() {
        return contando;
    }

    /**
     * @param contando the contando to set
     */
    public void setContando(Integer contando) {
        this.contando = contando;
    }
    public JProgressBar getBarritaProgreso() {
        return barritaProgreso;
    }

    public void setBarritaProgreso(JProgressBar barritaProgreso) {
        this.barritaProgreso = barritaProgreso;
    }
}
