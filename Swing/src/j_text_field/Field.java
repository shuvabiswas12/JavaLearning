package j_text_field;

import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Field extends JFrame {
	
	private Container container;
	private static JLabel icon,images;
	private static ImageIcon putIcon, putImage;
	
	public Field() {

		editText();
		setImages();		
	}
	
	
	// this method has not used in this class,
	// because i have created another process in main method to add icon in title bar
	public void setIconInTitle() {
		putIcon = new ImageIcon(getClass().getResource("text_field.png"));
		this.setIconImage(putIcon.getImage());
		
	}
	
	public void setImages() {
		container = this.getContentPane();
		putImage = new ImageIcon(getClass().getResource("text_field.png"));
		images = new JLabel(putImage);
		images.setBounds(20, 80, 150, 200);
		container.add(images);
	}
	
	public void editText() {
		container = this.getContentPane();
		container.setLayout(null);
		
		
		// for creating textField 
		JTextField textField = new JTextField(/*"Here You can write"*/); // here we can set text which works as a  placeholder
		// or we can add text throw setText method.
		
		textField.setText("Here you can write");
		textField.setBounds(20, 20, 200, 50);
		
		container.add(textField);
	}
	
	public static void main(String[] args) {
		Field frame = new Field();
		frame.setVisible(true);
	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 400);
		
		frame.setTitle("Text Field");
		
		// frame.setIconInTitle();
		
		// for setting icon in title bar
		putIcon = new ImageIcon(frame.getClass().getResource("text_field.png"));
		frame.setIconImage(putIcon.getImage());
		
		frame.setLocationRelativeTo(null);
	}

}
