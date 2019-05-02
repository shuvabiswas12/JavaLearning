package font_Style_and_size;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class StyleFont extends JFrame {
	
	private JLabel f_name, password;
	private Container container;
	
	public StyleFont() {
		font();
		
	}
	
	public void font() {
		
		container = getContentPane();
		
		// setting color in container of frame
		container.setBackground(Color.orange);
		
		// layout of container position is null for showing items with custom location
		container.setLayout(null);
		
		// font creating and customization
		Font font =new Font("Arial", Font.BOLD, 14); // font name, font style, font size
		
		f_name = new JLabel("Enter Your First Name : ");
		f_name.setBounds(50, 20, 200, 50);
		
		// for applying the font in text
		f_name.setFont(font);
		
		
		container.add(f_name);
		
		password = new JLabel("Enter Your Password : ");
		password.setBounds(50, 70, 200, 50);
		
		// for applying the font in text
		password.setFont(font);
		
		
		container.add(password);
						
		
	}
	
	public static void main(String[] args) {
		
		StyleFont frame = new StyleFont();
		frame.setVisible(true);
		
		frame.setTitle("Font");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(400, 300);
		
		frame.setLocationRelativeTo(null);
	}
	

}
