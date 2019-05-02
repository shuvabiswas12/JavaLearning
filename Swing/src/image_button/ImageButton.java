package image_button;

import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ImageButton extends JFrame {
	
	private Container container;
	private ImageIcon img1, img2;
	private JButton button1, button2;
	
	public ImageButton() {
		frame();
		
		ImageInButton();
		
	}
	
	private void ImageInButton() {
		
		container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.GREEN);
		
		img1 = new ImageIcon(getClass().getResource("login.png"));
		img2 = new ImageIcon(getClass().getResource("clear.png"));
		
		
		// image in button 1
		button1 = new JButton(img1);
		button1.setBounds(20, 20, 200, 50);
		container.add(button1);
		
		// image in button 2
		button2 = new JButton(img2);
		button2.setBounds(20, 80, 200, 50);
		container.add(button2);
		
	}

	public void frame() {
		setTitle("Image on Button");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 500);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		
		ImageButton frame = new ImageButton();
		

	}

}
