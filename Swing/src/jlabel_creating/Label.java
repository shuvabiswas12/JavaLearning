package jlabel_creating;

import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Label extends JFrame {
	
	private Container container;
	
	public Label() {
		
		setJLabel();
		
		iconSetting();
		
	}
	
	public void setJLabel() {
		
		// setting the color
		container = getContentPane();
		container.setBackground(Color.CYAN);
		
		// setting the layout position of components like text, images etc.
		container.setLayout(null);
		
		// JLabel creating
		JLabel userLable = new JLabel();
		userLable.setText("Enter Your Name : ");
		userLable.setBounds(50, 20, 150, 50);
		container.add(userLable); //adding the JLabel to container
		
		
	}
	
	public void iconSetting() {
		ImageIcon icon = new ImageIcon(getClass().getResource("icon.png"));
		this.setIconImage(icon.getImage());
	}

	public static void main(String[] args) {
		
		Label frame = new Label();
		
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setBounds(200, 50, 400, 300);
		
		frame.setTitle("JLabel");
		

	}

}
