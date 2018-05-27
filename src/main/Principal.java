/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Contadores.ContadoresFrame2;
import Leche.Baby;
import Leche.BaldeLeche;
import Leche.Vaca;
import contadoresClase.ContadoresFrame;
import cuentaBanco.CuentaBanco;
import cuentaBanco.SacaDinero;
import gui.PrincipalFrame;
import objects.Ping;
import objects.PingPong;
import objects.Pong;
import objects.Semaforo;
import objects.Timer;

/**
 *
 * @author House
 */
public class Principal {
    public static void main(String[] args) {
        //CuentaBanco cuenta = new CuentaBanco(20000);
         //PrincipalFrame ventana = new PrincipalFrame();
         //System.out.println("Ya pasó el ciclo");
        /* SacaDinero jl = new SacaDinero("Jose Luis", cuenta);
         SacaDinero jl2 = new SacaDinero("Rafa", cuenta);
         SacaDinero jl3 = new SacaDinero("Dany", cuenta);
         jl.start();
         jl2.start();
         jl3.start();*/
        /*BaldeLeche balde = new BaldeLeche();
         Vaca vaquita = new Vaca(balde);
         vaquita.start();
         new Baby (balde, "Bebé José Luis").start();
         new Baby (balde, "Bebé Darwin").start();
         new Baby (balde, "Bebé Dany").start();
         new Baby (balde, "Bebé Rafa").start();
         new Baby (balde, "Bebé Javier").start();*/
        ContadoresFrame2 ventana = new ContadoresFrame2(5);
         
         
    }
}
