package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyRadioButton extends JFrame implements ActionListener{
	JRadioButton rbPizza, rbHambuger, rbBanhMi;
	
	public MyRadioButton() {
		// TODO Auto-generated constructor stub
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(500, 500);
	
		rbPizza = new JRadioButton("Pizza");
		rbPizza.setFocusable(false);
		rbPizza.addActionListener(this);
		
		rbHambuger = new JRadioButton("Hambuger");
		rbHambuger.setFocusable(false);
		rbHambuger.addActionListener(this);
		
		rbBanhMi = new JRadioButton("Banh Mi");
		rbBanhMi.setFocusable(false);
		rbBanhMi.addActionListener(this);
		
		rbPizza.setIcon(new ImageIcon("icon-pizza.jpg"));
		rbHambuger.setIcon(new ImageIcon("icon-hambuger.png"));
		rbBanhMi.setIcon(new ImageIcon("icon-banhMi.png"));
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rbPizza);
		buttonGroup.add(rbHambuger);
		buttonGroup.add(rbBanhMi);
		
		
		this.add(rbPizza);
		this.add(rbHambuger);
		this.add(rbBanhMi);
		
		
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == rbPizza) {
			System.out.println("You order a pizza!");
		}else if(e.getSource() == rbHambuger) {
			System.out.println("You order a hambuger!");
			
		}else if(e.getSource() == rbBanhMi) {
			System.out.println("You order a banh mi!");
		}
	}

}
