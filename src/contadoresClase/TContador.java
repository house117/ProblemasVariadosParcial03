/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contadoresClase;

import java.awt.FlowLayout;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author House
 */
public class TContador extends JPanel{
    private JLabel lblTitulo;
    private JTextField edtNumero;
    private Integer tiempo;
    private Integer contador;
    
    private Contador contador
    public TContador(String titulo, JTextField edit){
        Random random = new Random();
        this.contador = 0;
        Thread.State.
        this.tiempo = random.nextInt(4000)+1000;
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        lblTitulo = new JLabel(titulo);
        edtNumero = new JTextField(10);
    }

 
}
