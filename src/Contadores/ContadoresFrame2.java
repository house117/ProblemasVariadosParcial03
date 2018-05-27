/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contadores;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javafx.scene.control.ProgressBar;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

/**
 *
 * @author House
 */
public class ContadoresFrame2 extends JFrame{
    private JButton btnStart;
    private JPanel pnlContadores;
    private ArrayList<Contador> listaContadores;
    private ArrayList<Thread> listaHilos;
    private Integer sumador;
    private Semaforo semaforo;
    private JProgressBar pbProceso;
    public ContadoresFrame2(Integer cantContadores){
        super("Contadores");
        super.setLocationRelativeTo(null);
        super.setLayout(new FlowLayout(FlowLayout.CENTER));
        super.setSize(300, 300);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        btnStart = new JButton("Iniciar");
        
        pnlContadores = new JPanel();
        sumador = 1000;
        listaContadores = new ArrayList<>();
        listaHilos = new ArrayList<>();
        semaforo = new Semaforo(listaHilos);
        pbProceso = new JProgressBar(0, 200);
        pbProceso.setStringPainted(true);
        for(int i=0; i<cantContadores; i++){
            Contador contador = new Contador(sumador, semaforo);
            System.out.println("mejejecosdasd");
            pnlContadores.add(contador);
            listaContadores.add(contador);
            sumador+=100;
         }
        listaContadores.get(0).setBarritaProgreso(pbProceso);
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                for(int i=0; i<cantContadores; i++){
                    Thread hilo = new Thread(listaContadores.get(i));
                    listaHilos.add(hilo);
                    hilo.start();
                }
                
            }
        });
        
        
        
        pnlContadores.setLayout(new BoxLayout(pnlContadores, WIDTH));
        pnlContadores.add(pbProceso);
        pnlContadores.add(btnStart);
        
        
        
        super.add(pnlContadores);
        
        
        
        
        
        super.setVisible(true);
        
    }
}
