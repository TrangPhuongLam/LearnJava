package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyButton extends JFrame implements ActionListener{
	JButton button;
	JLabel label;
	
	public MyButton() {
		label = new JLabel();
		label.setBounds(100, 150, 150, 80);
		label.setIcon(new ImageIcon("VietNamflag - Americaflag_icon.jpg"));
		label.setVisible(false);
		
		
		button = new JButton();
		button.setBounds(100, 120, 80, 40);
		button.setText("Button");
		button.setForeground(Color.white);
		button.setBackground(Color.blue);
		button.setFocusable(false);
		button.setBorder(BorderFactory.createEtchedBorder());
		button.addActionListener(this);
//		button.setEnabled(false);
		
		this.add(button);
		
		this.add(label);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(300, 300);;
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			label.setVisible(true);
		}
	}
}
