package login_frame;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewFrame extends JFrame {
	private JLabel text;
	private Container container;
	
	public NewFrame() {
		
		this.setTitle("This is the new frame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 500);
		this.setLocationRelativeTo(null);
		
		text = new JLabel("Now you are in new Frame");
		
		container = this.getContentPane();
		container.setLayout(null);
		
		text.setBounds(30, 20, 200, 50);
				
		container.add(text);
		
	}

	public static void main(String[] args) {
		
		NewFrame frame = new NewFrame();
		frame.setVisible(true);
		

	}

}
