/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *
 * @author House
 */
public class PingPong extends Thread{
    private String mensaje;
    private Semaforo semaforo;
    private Boolean estado;
    public PingPong(String msg, Semaforo sem, Boolean estado){
        mensaje = msg;
        semaforo = sem;
        this.estado = estado;
    }
    @Override
    public void run(){
        while(true){
            if(estado == semaforo.isSemaforo()){
              System.out.println(mensaje);
                semaforo.change();  
            }
            
        }
    }
    
}
