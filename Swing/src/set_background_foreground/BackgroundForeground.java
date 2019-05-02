package set_background_foreground;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class BackgroundForeground extends JFrame {
	private Container container;
	
	public BackgroundForeground() {
		
		BG_FG();
		
	}
	
	public void BG_FG() {
		container = getContentPane();
		container.setLayout(null);
		
		JLabel username = new JLabel("User Name : ");
		username.setBounds(20, 20, 150, 50);
		
		// background and foreground
		username.setForeground(Color.blue);
		username.setOpaque(true);
		username.setBackground(Color.cyan);
		
		
		container.add(username);
		
		JLabel password = new JLabel("Password : ");
		
		
		// finding what text are in a label. 
		System.out.println(password.getText());  //getText() used in here 
		
		// toolTip text for suggestion 
		password.setToolTipText("Enter your password");
		
		password.setBounds(20, 70, 150, 50);
		
		// background and foreground
		password.setForeground(Color.MAGENTA);
		password.setOpaque(true);
		password.setBackground(Color.blue);
		
		
		container.add(password);
		
	}
	
	public static void main(String[] args) {
		
		BackgroundForeground frame = new BackgroundForeground();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Background Foreground");
		frame.setSize(400, 300);
		frame.setLocationRelativeTo(null);	
		
	}

}
