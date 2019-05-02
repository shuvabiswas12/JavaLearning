package j_button;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Button extends JFrame {
	private Container container;
	
	public Button() {
		
		buttonBtn();		
	}
	
	public void buttonBtn() {
		
		container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.darkGray);
		
		// Font and Style
		Font font = new Font("my riad pro", Font.BOLD, 20);
		
		
		// for button 1
		JButton button1 = new JButton("Submit");
		button1.setBounds(20, 20, 100, 50);
		
		button1.setFont(font);
		button1.setBackground(Color.ORANGE);
		button1.setForeground(Color.white);
		
		container.add(button1);
		
		
		// for button 2
		JButton button2 = new JButton("Cancel");
		button2.setBounds(140, 20, 100, 50);
		
		button2.setFont(font);
		button2.setBackground(Color.BLUE);
		button2.setForeground(Color.WHITE);
		
		container.add(button2);
	}

	public static void main(String[] args) {
		
		Button frame = new Button();
		frame.setVisible(true);
		frame.setTitle(" JButton Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 500);
		frame.setLocationRelativeTo(null);
		
		ImageIcon icon = new ImageIcon(frame.getClass().getResource("icon.png"));
		frame.setIconImage(icon.getImage());
		

	}

}
