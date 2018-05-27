package gui;


import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import listener.botonListener;
import main.Fecha;
import objects.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author House
 */
public class PrincipalFrame extends JFrame{
    JTextField txtPingPong;
    
    JButton botoncito;
    botonListener listener;
    JTextField txtPingPongR;
    
    public PrincipalFrame(){
        
        super("The Ping Pong program xD");
        super.setSize(new Dimension(500, 300));
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setLocationRelativeTo(null);
        super.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        
        botoncito = new JButton("Iniciar");
        txtPingPong = new JTextField();
        txtPingPongR = new JTextField();
        botoncito.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                //Ping ping = new Ping(txtPingPong);
                //Pong pong = new Pong(txtPingPong);
                //Thread pingRT = new Thread(new PingR(txtPingPongR));
                //Thread pongRT = new Thread(new PongR(txtPingPongR));
                //ping.start();
                //pong.start();
                //new Thread(new PingR(txtPingPongR)).start();
                //new Thread(new PongR(txtPingPongR)).start();
                //pingRT.start();
                //pongRT.start();
                
            }
        });
        txtPingPong.setPreferredSize(new Dimension(60, 30));
        txtPingPongR.setPreferredSize(new Dimension(60, 30));
        super.add(new JLabel("Con Thread"));
        super.add(txtPingPong);
        super.add(botoncito);
        super.add(txtPingPongR);
        super.add(new JLabel("Con Runnable"));
        super.setVisible(true);
    }
        public void setListener(botonListener listener){
        this.listener = listener;
    }
}
