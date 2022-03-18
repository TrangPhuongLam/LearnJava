package gui;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow extends JFrame{
	JLabel label;
	public NewWindow() {
		// TODO Auto-generated constructor stub
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 500);
		
		label = new JLabel("Hello :)");
		label.setFont(new Font("MV Bodi", Font.BOLD, 20));
		label.setBounds(0, 0, 100, 50);
		
		this.add(label);
		
		this.setVisible(true);
	}
}
