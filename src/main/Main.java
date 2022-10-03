package main;

import java.awt.Color;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		
		JFrame frame = new JFrame("Exercício 1");//Cria o frame 
		Lines lines = new Lines();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lines.setBackground(Color.WHITE);
		frame.add(lines);
		frame.setSize(640, 480); //Definne tamannnho do frame
		frame.setVisible(true); //Exibe o frame
		frame.setResizable(false);
	}
}
