package box_layout;

import java.awt.Color;
import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

import j_checkBox.Box;

public class Layout extends JFrame {
	

	private Container container;
	private JButton button1, button2, button3, button4, button5;
	
	public Layout() {
		this.inItComponent();
		this.boxLayout();
		
	}
	
	private void boxLayout() {
		
		BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
		container.setLayout(layout);
		
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		
		
		container.add(button1);
		container.add(button2);
		container.add(button3);
		container.add(button4);
		container.add(button5);
		
		
	}

	public void inItComponent() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setTitle("Border Layout");
		this.setBounds(20, 20, 400, 500);
		
		container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.PINK);
	}

	public static void main(String[] args) {
		
		Layout frame = new Layout();

	}

}
