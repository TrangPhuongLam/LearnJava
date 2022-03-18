package gui;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class MyLayeredPane extends JFrame{
	JLabel label1, label2, label3;
	
	
	public MyLayeredPane() {
		// TODO Auto-generated constructor stub
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 500);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 500, 500);
		
		label1 = new JLabel();
		label1.setOpaque(true);
		label1.setBackground(Color.red);
		label1.setBounds(50, 50, 100, 100);
		
		label2 = new JLabel();
		label2.setOpaque(true);
		label2.setBackground(Color.blue);
		label2.setBounds(100, 100, 100, 100);
		
		label3 = new JLabel();
		label3.setOpaque(true);
		label3.setBackground(Color.yellow);
		label3.setBounds(150, 150, 100, 100);
		
		layeredPane.add(label1, Integer.valueOf(1));
		layeredPane.add(label2, Integer.valueOf(0));
		layeredPane.add(label3, Integer.valueOf(2));
		
		this.add(layeredPane);
		
		
		this.setVisible(true);
	}
}
