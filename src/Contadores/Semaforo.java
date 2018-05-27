/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contadores;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author House
 */
public class Semaforo extends JLabel{
    private Boolean luz;
    private ArrayList<Thread> listaContadores;
    public Semaforo(ArrayList<Thread> listaHilos){
        this.listaContadores = listaHilos;
        luz = false;
    }
    public synchronized Boolean puedoContinuar(){
        for(int i=0; i<listaContadores.size()-1; i++){
            System.out.println("Estado ="+listaContadores.get(i).getState());
            if(listaContadores.get(i).getState() != Thread.State.WAITING){
                return false;
            }
        }
        return true;
    }
    
}
