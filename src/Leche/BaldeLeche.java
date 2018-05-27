/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leche;

/**
 *
 * @author House
 */
public class BaldeLeche {
        private Double leche;
        public BaldeLeche(){
            leche = 0.0;
        }
        
        
        public void agregarLeche(){
            leche+=0.5;
            System.out.printf("Se produjeron 0.5 litros de leche, ahora hay: %.2f litros de leche\n", this.leche);
        }
        public synchronized Boolean beberLeche(String nombre){
        if(leche>=1){
            leche-=1.0;
            System.out.printf("%s BEBIO UN LITRO DE LECHE QUEDA %.2f LITROS DE LECHE\n", nombre, this.leche);
            return true;
        }else{
            //System.out.printf("Se esta produciendo leche, espera %s\n", nombre);
            return false;
        }
    }
}
