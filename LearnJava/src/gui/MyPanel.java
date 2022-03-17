package gui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyPanel extends JFrame{
	JPanel redPanel, bluePanel, greenPanel;
	JLabel label;
	
	public MyPanel() {
		// TODO Auto-generated constructor stub
		
		
		label = new JLabel();
		label.setText("Freedom for Vietnam!");
		label.setIcon(new ImageIcon("VietNamflag - Americaflag_icon.jpg"));
		
		redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 200, 150);
		redPanel.setLayout(new BorderLayout());
		
		bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(200, 0, 50, 50);	
		
		greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0, 150, 250, 50);
		
		this.add(redPanel);
		this.add(bluePanel);
		this.add(greenPanel);
		
		redPanel.add(label);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(300, 300);;
		this.setVisible(true);
	}
}
