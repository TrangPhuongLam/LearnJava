package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFlowLayout extends JFrame{
	JPanel panel, flagPanel;
	JLabel label1, label2, label3;
	
	
	public MyFlowLayout() {
		// TODO Auto-generated constructor stub
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout(FlowLayout.LEADING));
		this.setSize(500, 500);
		
		//-------------------- panel----------------
		panel = new JPanel();
		panel.setBackground(Color.lightGray);
		panel.setPreferredSize(new Dimension(250, 250));
		panel.setLayout(new FlowLayout(FlowLayout.LEADING));
		
		panel.add(new JButton("1"));
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));
		panel.add(new JButton("4"));
		panel.add(new JButton("5"));
		panel.add(new JButton("6"));
		panel.add(new JButton("7"));
		panel.add(new JButton("8"));
		panel.add(new JButton("9"));
		panel.add(new JButton("10"));
		panel.add(new JButton("11"));
		panel.add(new JButton("12"));
		//-------------------- End panel ----------------		
		//-------------------- flagPanel ----------------
		flagPanel = new JPanel();
		flagPanel.setBackground(Color.yellow);
		flagPanel.setPreferredSize(new Dimension(500, 300));
		flagPanel.setLayout(new FlowLayout(FlowLayout.LEADING, 0, 60));
		
		label1 = new JLabel();
		label1.setBackground(Color.red);
		label1.setOpaque(true);
		label1.setPreferredSize(new Dimension(500, 20));
		
		label2 = new JLabel();
		label2.setBackground(Color.red);
		label2.setOpaque(true);
		label2.setPreferredSize(new Dimension(500, 20));
		
		label3 = new JLabel();
		label3.setBackground(Color.red);
		label3.setOpaque(true);
		label3.setPreferredSize(new Dimension(500, 20));
		
		flagPanel.add(label1);
		flagPanel.add(label2);
		flagPanel.add(label3);
		
		//-------------------- flagPanel ----------------
		this.add(flagPanel);
		this.add(panel);
		
		this.setVisible(true);	
	}
	
	
}
