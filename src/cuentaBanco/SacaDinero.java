/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentaBanco;

import java.util.Random;

/**
 *
 * @author House
 */
public class SacaDinero extends Thread{
    private String nombre;
    private CuentaBanco cuenta;
    public SacaDinero (String nombre, CuentaBanco cuenta){
        this.nombre = nombre;
        this.cuenta = cuenta;
    }
    @Override
    public  void run() {
        Random random = new Random();
        int i=0;
        while(i < 5){
            cuenta.sacarDinero((random.nextInt(10)+1 )*100, nombre);
            i++;
            this.yield();
        }
        
        
    }
    
    
            
    
}
