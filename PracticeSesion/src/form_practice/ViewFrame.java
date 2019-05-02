package form_practice;

import java.awt.Color;
import java.awt.Container;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ViewFrame extends JFrame implements Form {
	
	public Container container;
	public JLabel name_L, password_L;
	public ImageIcon icon;
	public static ArrayList<String> dataList;
	
	public ViewFrame() {
		this.myFrame();
		
	}
	
	public static void main(String[] args) {
		ViewFrame frame = new ViewFrame();
		frame.setVisible(true);
		
	}

	@Override
	public void myFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 400);
		this.setLocationRelativeTo(null);
		this.setTitle("Form");
		
		icon = new ImageIcon(getClass().getResource("icon.png"));
		this.setIconImage(icon.getImage());
		
		this.setBackground(Color.LIGHT_GRAY);
		
		
		
	}

	@Override
	public void myForm() {
		
		name_L = new JLabel("Your Name : ");
		
		
		
	}

}
