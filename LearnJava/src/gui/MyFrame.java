package gui;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	public MyFrame() {
		// TODO Auto-generated constructor stub
		
		this.setTitle("Alex Lam");
		this.setIconImage(new ImageIcon("taekwondo-logo-1.jpg").getImage());
		this.getContentPane().setBackground(Color.black);
		
		
		this.setResizable(false);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
}
