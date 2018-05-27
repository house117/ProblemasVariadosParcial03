/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentaBanco;

/**
 *
 * @author House
 */
public class CuentaBanco {
    private Integer dinero;
    public CuentaBanco (Integer dinero){
        this.dinero = dinero;
    }

    public Integer getDinero() {
        return dinero;
    }

    public void setDinero(Integer dinero) {
        this.dinero = dinero;
    }
    public synchronized void sacarDinero(Integer dinero, String nombre){
        if(dinero <= this.dinero){
            System.out.printf("Yo tenia %d, %s me sacó %d, y me queda %d\n", this.dinero, nombre, dinero, this.dinero-dinero);
            this.dinero -= dinero;
        }else{
            System.out.printf("Rechazado saldo en cuenta = %d, intento retirar %d\n", this.dinero, dinero);
        }
        
    }
}
