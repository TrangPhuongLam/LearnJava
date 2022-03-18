package gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class MySlider extends JFrame implements ActionListener{
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	public MySlider() {
		// TODO Auto-generated constructor stub
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(500, 500);
		this.setTitle("Slider Temputure");
		
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(0,100, 10);
		slider.setPaintTicks(true);
		slider.setPreferredSize(new Dimension(500, 50));
		
		
		
		panel.add(label);
		panel.add(slider);
		
		
		this.add(panel);
		
		this.pack();
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
