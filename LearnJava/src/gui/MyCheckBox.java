package gui;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyCheckBox extends JFrame implements ActionListener{
	JCheckBox checkBox;
	JButton button;
	
	public MyCheckBox() {
		// TODO Auto-generated constructor stub
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(500, 500);
	
		checkBox = new JCheckBox("I'm not a robot!");
		checkBox.setFocusable(false);
		checkBox.setFont(new Font("Consolas", Font.PLAIN, 20));
		checkBox.setIcon(new ImageIcon("checkbox-no.jpg"));
		checkBox.setSelectedIcon(new ImageIcon("checkbox-yes.png"));
		
		button = new JButton("Submit");
		button.setFocusable(false);
		button.addActionListener(this);
		
		
		
		this.add(button);
		this.add(checkBox);
		
		
		this.pack();
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			System.out.println(checkBox.isSelected());
		}
	}
}
