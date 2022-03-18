package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyBorderLayout extends JFrame{
	JPanel yellowPanel, redPanel, bluePanel, blackPanel, pinkPanel,
			SubPanel1, SubPanel2, SubPanel3, SubPanel4, SubPanel5;
	
	public MyBorderLayout() {
		// TODO Auto-generated constructor stub
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout(10, 10));
		this.setSize(500, 500);;
		
		
		
		
		//-------------------- Panel ---------------------
		yellowPanel = new JPanel();
		yellowPanel.setBackground(Color.yellow);
		yellowPanel.setPreferredSize(new Dimension(100, 100));
		
		redPanel = new JPanel();
		redPanel.setBackground(Color.gray);
		redPanel.setPreferredSize(new Dimension(100, 100));
		
		bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setPreferredSize(new Dimension(100, 100));
		
		blackPanel = new JPanel();
		blackPanel.setBackground(Color.black);
		blackPanel.setPreferredSize(new Dimension(100, 100));
		
		pinkPanel = new JPanel();
		pinkPanel.setBackground(Color.pink);
		pinkPanel.setPreferredSize(new Dimension(100, 100));
		
		//-------------------- End Panel ---------------------
		
		//-------------------- Sub Panel ---------------------
		yellowPanel.setLayout(new BorderLayout(10, 10));
		redPanel.setLayout(new BorderLayout());
		bluePanel.setLayout(new BorderLayout());
		blackPanel.setLayout(new BorderLayout());
		pinkPanel.setLayout(new BorderLayout());
		
		SubPanel1 = new JPanel();
		SubPanel1.setBackground(Color.red);
		SubPanel1.setPreferredSize(new Dimension(10, 10));
		
		SubPanel2 = new JPanel();
		SubPanel2.setBackground(Color.red);
		SubPanel2.setPreferredSize(new Dimension(10, 10));
		
		SubPanel3 = new JPanel();
		SubPanel3.setBackground(Color.red);
		SubPanel3.setPreferredSize(new Dimension(10, 10));
				
		//-------------------- End Sub Panel ---------------------
		
		
		
		yellowPanel.add(SubPanel1, BorderLayout.NORTH);
		yellowPanel.add(SubPanel2, BorderLayout.CENTER);
		yellowPanel.add(SubPanel3, BorderLayout.SOUTH);
		
		this.add(yellowPanel, BorderLayout.CENTER);
		this.add(redPanel, BorderLayout.SOUTH);
		this.add(bluePanel, BorderLayout.EAST);
		this.add(blackPanel, BorderLayout.WEST);
		this.add(pinkPanel, BorderLayout.NORTH);
		
		this.setVisible(true);	
			
	}
}
