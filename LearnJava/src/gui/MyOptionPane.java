package gui;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MyOptionPane extends JOptionPane{

	public MyOptionPane() {
//	JOptionPane.showMessageDialog(null, "This is plain message",
//			"Plain message", JOptionPane.PLAIN_MESSAGE);
//	JOptionPane.showMessageDialog(null, "This is information message",
//			"Information message", JOptionPane.INFORMATION_MESSAGE);
//	JOptionPane.showMessageDialog(null, "This is question message", 
//			"Question message", JOptionPane.QUESTION_MESSAGE);
//	JOptionPane.showMessageDialog(null, "This is warning message",
//			"Warning message", JOptionPane.WARNING_MESSAGE);
//	JOptionPane.showMessageDialog(null, "This is error message",
//			"Error message", JOptionPane.ERROR_MESSAGE);
	
	
//	JOptionPane.showConfirmDialog(
//			null, 
//			"Hello", "Fuck you", 
//			JOptionPane.YES_NO_CANCEL_OPTION); 
//	//return yes = 0, no = 1, cancel = 2, exit = -1
//	
//	String name = JOptionPane.showInputDialog("What is your name?"); 
//	//return String
//	System.out.println("Hello " + name);
	
	
	
	ImageIcon icon = new ImageIcon();
	String[] response = {"No, you're awesome!", 
			"Thanks a lot", "blush"};
	System.out.println(JOptionPane.showOptionDialog(
			null, 
			"You're awesome", 
			"Secret message!", 
			JOptionPane.YES_NO_CANCEL_OPTION,
			JOptionPane.INFORMATION_MESSAGE,
			icon,
			response,
			0));
	//yes = 0, no = 1, cancel =2, exit = -1,
//	initial value: value you want to chose

	
	
	}
}
