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
public class Semaforo {
    private boolean semaforo;
    public Semaforo(){
        semaforo = true;
    }
    public void change(){
        if(this.semaforo == true){
            this.semaforo = false;
        }else{
            semaforo = true;
        }
    }

    /**
     * @return the semaforo
     */
    public boolean isSemaforo() {
        return semaforo;
    }

    /**
     * @param semaforo the semaforo to set
     */
    public void setSemaforo(boolean semaforo) {
        this.semaforo = semaforo;
    }
}
