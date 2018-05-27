/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author House
 */
public class Fecha {

    /**
     * @param args the command line arguments
     */
            private Integer dia;
        private Integer mes;
        private Integer anio;

    public Fecha(Integer dia, Integer mes, Integer anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    
    public void avanzar(){
        dia++;
        if(dia > diasMes()){
            mes++;
            dia = 1;
            if(mes>12){
                anio++;
                mes = 1;
            }
        }
        
    }
    
    public Integer diasMes(){
        switch(this.mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if(this.anio%4 ==0){
                    return 29;
                }else{
                    return 28;
                }
            default:
                System.out.println("error fecha");
        }
                return null;
    }
    public String toString(){
        return String.format("%d/%d/%d", this.dia, this.mes, this.anio);
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }
        
    
}
