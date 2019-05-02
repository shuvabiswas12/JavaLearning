package generics_test;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingTest extends JFrame {
	
	public SwingTest() {
		
		this.setVisible(true);
		this.setTitle("This is test");
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBackground(Color.CYAN);
		this.setSize(400, 500);
		
		JLabel text = new JLabel("This is first text");
		this.add(text);
		
		JButton button = new JButton("Up");
		this.add(button);
		
		JButton button2 = new JButton("Down");
		this.add(button2);
		
		
	}
	
	public static void main(String[] args) {
		SwingTest fSwingTest = new SwingTest();
	}

}
