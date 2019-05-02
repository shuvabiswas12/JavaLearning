package border_layout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layout extends JFrame {
	private Container container;
	private JButton button1, button2, button3, button4, button5;
	
	public Layout() {
		this.inItComponent();
		this.borderLayout();
		
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
	
	// border layout is a default layout in JFrame
	public void borderLayout() {
		
		// border layout
		BorderLayout layout = new BorderLayout(10, 5);
		
		// we can give height and width gap within the constructor or two methods thats given bellow 
		//layout.setHgap(10);
		//layout.setVgap(5);
		
		container.setLayout(layout);
		
		button1 = new JButton("Button1");
		button2 = new JButton("Button2");
		button3 = new JButton("Button3");
		button4 = new JButton("Button4");
		button5 = new JButton("Button5");
		
		container.add(button1, BorderLayout.NORTH);
		container.add(button2, BorderLayout.SOUTH);
		container.add(button3, BorderLayout.EAST);
		container.add(button4, BorderLayout.WEST);
		container.add(button5, BorderLayout.CENTER);
		
	}

	public static void main(String[] args) {
		Layout frame = new Layout();
		

	}

}
