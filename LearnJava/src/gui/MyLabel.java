package gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class MyLabel extends JFrame{
	Border border = BorderFactory.createLineBorder(Color.green, 3);
	JLabel label ;
	
	public MyLabel() {
		// TODO Auto-generated constructor stub
		label = new JLabel();
		label.setText("Freedome for Vietnam!");
		label.setIcon(new ImageIcon("VietNamflag - Americaflag_icon.jpg"));
		label.setVerticalTextPosition(JLabel.TOP);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setIconTextGap(10);
		
		label.setForeground(Color.green);
		label.setFont(new Font("MV Boli", Font.PLAIN, 20));
		
		label.setBackground(Color.black);
		label.setOpaque(true);
		
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.TOP);
		
		label.setBorder(border);
//		label.setBounds(0, 0, 150, 150);
		
		this.add(label);
		
//		this.setLayout(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setSize(300, 300);
		this.pack();
	}
	
}
