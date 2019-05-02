package grid_layout;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test extends JFrame {
	private Container container;
	private JButton[] buttons;
	
	public Test() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Grid Layout");
		this.setBounds(20, 20, 500, 500);
		
		
		container = this.getContentPane();		
		
		// grid layout
		layoutGrid();
		
	}
	
	
	// grid layout
	public void layoutGrid() {
		
		GridLayout layout = new GridLayout(4, 4, 3, 5);
		container.setLayout(layout);
		
		buttons = new JButton[10];
		
		for (int i=0; i<buttons.length; i++) {
			buttons[i] = new JButton(""+(i+1));
			container.add(buttons[i]);
		}
		
		return;
	}
	

	public static void main(String[] args) {
		Test frame = new Test();
		frame.setVisible(true);

	}

}
