package image_on_jlabel;

import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Images extends JFrame{
	
	private Container container;
	
	public Images() {
		settingImages();
	}
	
	public void settingImages() {	
		
		container = getContentPane();
				
		ImageIcon imageIcon = new ImageIcon(getClass().getResource("icon.png"));
		
		JLabel imgLabel = new JLabel(imageIcon);
		
		//imgLabel.setIcon(imageIcon);
		
		imgLabel.setBounds(50, 20, 200, 300);
		
		container.add(imgLabel);
	}

	public static void main(String[] args) {
		
		Images frame = new Images();
		
		frame.setTitle("Images");
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(400, 500);
		frame.setLocationRelativeTo(null);	
		

	}

}
