/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class TimerTela {

	JFrame window;
	JLabel counterLabel;
	Font font1 = new Font("Arial", Font.PLAIN, 70);
	
	Timer timer;
	
	int second, minute;
	String ddSecond, ddMinute;
	
	
	DecimalFormat dFormat = new DecimalFormat("00");
	
	public static void main(String[] args) {
		
		new TimerTela();
		
	}
	
	public TimerTela() {
		
		window = new JFrame("Valendoooo!");
		//window.setSize(300,200);
                window.pack();
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window.setLayout(null);
                
		
		
		counterLabel = new JLabel("Valendoooooo!");
		counterLabel.setBounds(10, 10, 200, 100);
		counterLabel.setHorizontalAlignment(JLabel.CENTER);
		counterLabel.setFont(font1);
		
		
		
		
		window.add(counterLabel);
		window.setVisible(true);
		
                
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
               
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        // Define o tamanho e a posição do JFrame
        int frameWidth = 200; // Largura desejada da tela
        int frameHeight = 150; // Altura desejada da tela
        int x = screenWidth - frameWidth;
        int y = 0;

        window.setBounds(x, y, frameWidth, frameHeight);
        
		counterLabel.setText("02:00");
		minute = 2;
		second = 0;
		countdownTimer();
		timer.start();
	}
	
	
	public void countdownTimer() {
		

		timer = new Timer(1000, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
			second--;
			
			ddSecond = dFormat.format(second);
			ddMinute = dFormat.format(minute);
			counterLabel.setText(ddMinute + ":" + ddSecond);
			
			if(second== -1) {
				
				second = 59;
				minute--;
				ddSecond = dFormat.format(second);
				ddMinute = dFormat.format(minute);
				counterLabel.setText(ddMinute + ":" + ddSecond);
				
			}
			
			if(minute==0 && second==0) {
				timer.stop();
			}
				
		   }
		});	
	}

    
}