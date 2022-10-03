package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Lines extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		this.setBackground(Color.WHITE);
		
		//Eixos x e y
		g.setColor(Color.BLACK);
		g.drawLine(2, 220, 2000, 220); 	//Eixo X	
		g.drawLine(302, 0, 302, 1100);	//Eixo Y			
		
		//Linhas da coordenadas X
		g.drawLine(20, 210, 20, 230);
		g.drawLine(120, 210, 120, 230);
		g.drawLine(220, 210, 220, 230);
		g.drawLine(385, 210, 385, 230);
		g.drawLine(500, 210, 500, 230);
		g.drawLine(605, 210, 605, 230);
		
		//Linhas da coordenadas Y
		g.drawLine(290, 30, 315, 30);
		g.drawLine(290, 120, 315, 120);
		g.drawLine(290, 310, 315, 310);
		g.drawLine(290, 410, 315, 410);
		
		//reta
		g.setColor(Color.RED);
		g.drawLine(500, 30, 385, 120);
		
		//Legendas
		//Eixos y
		g.setColor(Color.BLUE);
		g.setFont(new Font("SansSerif", Font.PLAIN, 14));
		g.drawString("2", 270, 30);
		g.drawString("1", 270, 120);
		g.drawString("-1", 270, 310);
		g.drawString("-2", 270, 410);
		
		//Eixos x
		g.drawString("-3", 20, 240);
		g.drawString("-2", 120, 240);
		g.drawString("-1", 220, 240);
		g.drawString("0", 290, 240);
		g.drawString("1", 388, 240);
		g.drawString("2", 503, 240);
		g.drawString("3", 608, 240);
		
		
	}
}


