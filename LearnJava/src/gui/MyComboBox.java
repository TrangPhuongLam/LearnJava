package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyComboBox extends JFrame implements ActionListener{
	JComboBox comboBox;
	
	public MyComboBox() {
		// TODO Auto-generated constructor stub
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(500, 500);
		
		
		String[] animals = {"dog", "cat", "bird"};
		//If you save data int, double,... must use wrapper like 
		//Integer, Double,...
		
		comboBox = new JComboBox(animals);
		comboBox.addActionListener(this);
		
//		comboBox.setEditable(true);
//		System.out.println("Count of item is " + comboBox.getItemCount());
		comboBox.addItem("hourse");
		comboBox.insertItemAt("peppa pig", 0);
		comboBox.setSelectedIndex(0);//display index 0 first
		comboBox.removeItem("cat");
		comboBox.removeItemAt(3);
		comboBox.removeAllItems();
		
		
		this.add(comboBox);
		
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == comboBox) {
			System.out.println(comboBox.getSelectedItem());
			System.out.println(comboBox.getSelectedIndex());
		}
	}

}
