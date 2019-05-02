package practice_swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test extends JFrame {
	
	private ImageIcon icon;
	private Container container;
	private JLabel image, userName, password;
	
	public Test() {
		
		setColor();
		setImage();
		text();	
	}
	
	public void setImage() {
		
		container.setLayout(null);
		icon = new ImageIcon(getClass().getResource("icon.png"));
		image = new JLabel(icon);
		//image.setBounds(20, 20, icon.getIconWidth(), icon.getIconHeight());
		image.setBounds(20, 20, 200, 150);
		container.add(image);
	}
	
	public void setColor() {
		
		container = getContentPane();
		container.setBackground(Color.pink);
	}
	
	public void text() {
		
		// font creating and styling
		Font font = new Font("Arial", Font.BOLD, 14);
		
		container = getContentPane();
		container.setLayout(null);
		
		// user name
		userName = new JLabel("Enter User Name : ");
		userName.setBounds(20, 180, 150, 20);
		userName.setToolTipText("Enter Your Email or Password");
		userName.setForeground(Color.white);
		userName.setFont(font);
		container.add(userName);
		
		
		// password
		password = new JLabel("Enter Your Password : ");
		password.setBounds(20, 210, 180, 20);
		password.setForeground(Color.white);
		password.setOpaque(true);
		password.setBackground(Color.green);
		password.setFont(font);
		container.add(password);
	}

	public void Frame() {
		setVisible(true);
		setTitle(" JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		icon = new ImageIcon(getClass().getResource("icon.png"));
		this.setIconImage(icon.getImage());
		
		setSize(600, 600);
		setLocationRelativeTo(null);
	}
	
	
	public static void main(String[] args) {
		
		Test frame = new Test();
		frame.Frame();

	}

}
