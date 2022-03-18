package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyLaunchPage extends JFrame implements ActionListener{
	JButton btNewWindow;
	public MyLaunchPage() {
		// TODO Auto-generated constructor stub
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 500);
		
		btNewWindow = new JButton();
		btNewWindow.setBounds(160, 200, 200, 50);
		btNewWindow.setFocusable(false);
		btNewWindow.setText("New Window");
		btNewWindow.addActionListener(this);
		
		this.add(btNewWindow);
		
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btNewWindow) {
			this.dispose();
			NewWindow myWindow = new NewWindow();
		}
		
	}
	
	
}
