package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyTextField extends JFrame implements ActionListener{
	JTextField textField;
	JButton button;
	
	public MyTextField() {
		// TODO Auto-generated constructor stub
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(500, 500);
		
		textField = new JTextField("username");
		textField.setPreferredSize(new Dimension(250, 40));
		textField.setFont(new Font("Consolas", Font.PLAIN, 20));
		textField.setForeground(Color.green);//color text
		textField.setBackground(Color.black);
		textField.setCaretColor(Color.green);

		
		button = new JButton();
		button.setFocusable(false);//delete frame of button
		button.setText("Submit");
		button.addActionListener(this);//add action for button
		
		
		
		
		
		
		this.add(button);
		this.add(textField);
		
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			button.setEnabled(false);
			textField.setEditable(false);
			System.out.println("Hello " + textField.getText());
		}
	}

}
