package icon_change;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Image extends JFrame{
	
	public ImageIcon icon;
	
	public Image() {
		icon = new ImageIcon(getClass().getResource("myicon.png"));
		this.setIconImage(icon.getImage());
		
	}
	
	public static void main(String[] args) {
		
		Image frame = new Image();
		frame.setVisible(true);
		
		frame.setBounds(200, 200, 400, 500);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setTitle("Icon");
				
		

	}

}
