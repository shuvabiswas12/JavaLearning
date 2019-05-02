package login_frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LogIn extends JFrame {
	
	private JLabel textLabel, passwordLabel;
	private JPasswordField passwordField;
	private Container container;
	private JButton submit, clear;
	private Font font;
	private JTextField textField;
	private Cursor cursor;
	
	public LogIn() {
		
		// frame creation
		frameContainer();
		
		// login frame
		logInFrame();
	}
	
	public void  frameContainer() {
		
		setVisible(true);
		setTitle("Login Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setSize(800, 500);
		//setLocationRelativeTo(null);
		setBounds(70, 50, 800, 500);
	}
	
	public void logInFrame() {
		
		container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.LIGHT_GRAY);
		
		font = new Font("my riad pro", Font.BOLD, 20);
		cursor = new Cursor(Cursor.HAND_CURSOR);
		
		textLabel = new JLabel("User name : ");
		textLabel.setBounds(70, 50, 150, 50);
		textLabel.setFont(font);
		container.add(textLabel);
		
		textField = new JTextField();
		textField.setBounds(200, 50, 230, 50);
		textField.setToolTipText("ex. shuvabiswas1");
		textField.setFont(font);
		
		container.add(textField);
		
		passwordLabel = new JLabel("Password : ");
		passwordLabel.setBounds(70, 110, 200, 50);
		passwordLabel.setFont(font);
		container.add(passwordLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(200, 110, 230, 50);
		passwordField.setFont(font);
		container.add(passwordField);
		
		submit = new JButton("Submit");
		submit.setBounds(200, 170, 110, 40);
		submit.setFont(font);
		submit.setCursor(cursor);
		container.add(submit);
		
		clear = new JButton("Clear");
		clear.setBounds(320, 170, 110, 40);
		clear.setFont(font);
		clear.setCursor(cursor);
		container.add(clear);
		
		submit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				String U_NAME = "Shuva";
				String PASSWORD = "12345";
				
				String userName = textField.getText().toString();
				String password = passwordField.getText().toString();
				
				if (userName.equals(U_NAME) && password.equals(PASSWORD)) {
					JOptionPane.showMessageDialog(null, "You have LogIn Successfuly");
					NewFrame frame = new NewFrame();
					frame.setVisible(true);
					dispose();
					
				}
				else {
					JOptionPane.showMessageDialog(null, "invalid user name or password");
				}
				
			}
		});
		
		clear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				passwordField.setText("");
				textField.setText("");
				
				JOptionPane.showMessageDialog(null, "Successfully Cleared");
				
			}
		});
			
	}

	public static void main(String[] args) {
		
		LogIn frame = new LogIn();

	}

}
