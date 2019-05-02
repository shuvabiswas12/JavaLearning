package j_password_field;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class Password extends JFrame {
	private Container container;
	
	
	public Password() {
		
		passwordField();
		
	}

	private void passwordField() {
		
		container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.GRAY);
		
		// for password field
		JPasswordField field = new JPasswordField();
		field.setBounds(20, 30, 200, 50);
		//field.setEchoChar('*'); // for showing any type of char in password field
		
		// for changing font and font size and style
		Font font = new Font("my riad pro", Font.BOLD, 25);
		field.setFont(font);
		
		// for changing the foreground and background color
		field.setBackground(Color.GREEN);
		field.setForeground(Color.WHITE);
		
		
		container.add(field);
			
		
	}

	public static void main(String[] args) {
		
		Password frame = new Password();
		frame.setVisible(true);
		frame.setSize(400, 500);
		frame.setLocationRelativeTo(null);
		frame.setTitle(" JPasswordField");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
