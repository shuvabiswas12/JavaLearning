package font_style_and_size_of_j_text_field;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.Style;

public class StyleSize extends JFrame {
	private JTextField field;
	private Container container;
	
	public StyleSize() {
		
		Text_Font_And_Style();
	}
	
	public void Text_Font_And_Style() {
		
		container = this.getContentPane();
		container.setLayout(null);
		
		field = new JTextField("Hello .. ");
		field.setBounds(20, 20, 200, 50);
		
		
		//for changing font Style and font size
		Font font = new Font("my riad pro", Font.BOLD + Font.ITALIC, 15);
		field.setFont(font);
		
		
		
		// for changing the foreground and background color in JTextField
		field.setForeground(Color.white);
		field.setBackground(Color.pink);
		
		
		
		// alignment in JTextField
		field.setHorizontalAlignment(JTextField.CENTER);   // i can use right left and center for alignment
		
		
		container.add(field);
		
	}

	public static void main(String[] args) {
		
		
		StyleSize frame = new StyleSize();
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("font style and size");
		
		frame.setSize(400, 500);
		frame.setLocationRelativeTo(null);
		
		// icon set in frame title bar
		ImageIcon icon = new ImageIcon(frame.getClass().getResource("font_icon.png"));
		frame.setIconImage(icon.getImage());
		

	}

}
