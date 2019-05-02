package multiple_jlabel_creating;

import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Multiple extends JFrame {
	
	private Container container;
	
	public Multiple() {
		
		setMultipleJLabel();
		
		setIcon();
		
	}
	
	public void setIcon() {
		ImageIcon icon = new ImageIcon(getClass().getResource("icon.png"));
		this.setIconImage(icon.getImage());
	}
	
	public void setMultipleJLabel() {
		
		container = getContentPane();
		container.setBackground(Color.green);
		
		container.setLayout(null);
		
		JLabel firstName = new JLabel();
		firstName.setText("Enter Your First Name : ");
		firstName.setBounds(50, 20, 150, 50);
		container.add(firstName);
		
		
		JLabel lastName = new JLabel("Enter Your Last Name : ");
		lastName.setBounds(50, 70, 150, 50);
		container.add(lastName);
		
		JLabel password = new JLabel("Enter Your Password : ");
		password.setBounds(50, 120, 150, 50);
		container.add(password);
		
		
	}

	public static void main(String[] args) {
		
		Multiple frame = new Multiple();
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setTitle("Multiple JLabel");
		
		frame.setSize(400, 300);
		
		frame.setLocationRelativeTo(null);
		
		

	} 

}
