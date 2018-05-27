/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contadoresClase;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author House
 */
public class ContadoresFrame extends JFrame{
    private JButton btnIniciar;
    private TContador componente;
    private ArrayList<TContador> componenteContadores;
    private JButton btnPausar;
    private JButton btnContinuar;
    private JButton btnTerminar;
    public ContadoresFrame(){
        super("Contadores");
        super.setLocationRelativeTo(null);
        super.setLayout(new FlowLayout(FlowLayout.CENTER));
        super.setSize(300, 300);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        componente = new TContador("contador 1:");
        btnIniciar = new JButton("Iniciar");
        componenteContadores = new ArrayList<>();
        
        
        btnIniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                for(TContador cont : componenteContadores){
                    new Thread(cont).start();
                }
                
            }
        });
        
        
        super.setVisible(true);
    }
}
