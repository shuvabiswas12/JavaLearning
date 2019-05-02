package j_panel;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main extends JFrame {
	
	private Container container;
	private JLabel text1, text2;
	private JButton button1, button2, button3, button4;

	public Main() {
		this.inItComponent();
		this.jpanel();
	}
	
	public void inItComponent() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setTitle("JPanel");
		this.setBounds(20, 20, 500, 600);
		button1 = new JButton("Button1");
		button1.setBounds(20, 20, 100, 40);
		
		container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.PINK);
		container.add(button1);
		
		text1 = new JLabel("1st JPanel");
		text1.setBounds(100, 70, 100, 40);
		container.add(text1);
		
		text2 = new JLabel("2nd JPanel");
		text2.setBounds(300, 70, 100, 40);
		container.add(text2);
		
	}
	
	public void jpanel() {
		// jpanel
		JPanel panel1 = new JPanel();
		panel1.setBounds(20,  120, 200,  300);
		panel1.setBackground(Color.GREEN);
		container.add(panel1);
		
		// jpanel
		JPanel panel2 = new JPanel();
		panel2.setBounds(230,  120,  200,  300);
		panel2.setBackground(Color.red);
		container.add(panel2);
		
		// adding button with jpanel
		button2 = new JButton("Button2");
		panel1.add(button2);
		
		// adding button with jpanel
		button3 = new JButton("Button3");
		panel2.add(button3);
		
		// adding button with jpanel
		button4 = new JButton("Button4");
		panel1.add(button4);
		
	}
	
	public static void main(String[] args) {
		Main frame = new Main();
		
	}

}
