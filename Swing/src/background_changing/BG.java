package background_changing;

import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class BG extends JFrame {

	public BG() {
		
		// for background color changing
		background();
		
		// for icon changing
		icon();
		
	}
	
	public void background() {
		
		Container container = getContentPane();
		container.setBackground(Color.BLUE);
		
	}
	
	public void icon() {
		
		ImageIcon icon = new ImageIcon(getClass().getResource("icon.png"));
		this.setIconImage(icon.getImage());
	}

	public static void main(String[] args) {
		
		BG frame = new BG();
		frame.setVisible(true);
		frame.setBounds(200, 200, 400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Background Changing");
	}
}
