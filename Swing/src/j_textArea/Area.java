package j_textArea;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Area extends JFrame {
	
	private Container container;
	private Font font;
	
	public Area() {
		
		createFrame();
		text_area();
	}
	
	private void text_area() {
		
		container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.BLUE);
		
		font = new Font("my riad pro", Font.BOLD, 20);
		
		// textArea creation
		JTextArea textArea = new JTextArea();
		textArea.setBounds(20, 20, 300, 200);
		
		// for line wrapping
		textArea.setLineWrap(true);
		
		// for word wrapping
		textArea.setWrapStyleWord(true);
		
		textArea.setBackground(Color.YELLOW);
		textArea.setForeground(Color.WHITE);
		
		textArea.setFont(font);
		
				
		container.add(textArea);
	}

	public void createFrame() {
		
		this.setVisible(true);
		this.setTitle("This is JtextArea");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 500);
		this.setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		
		Area frame = new Area();
		

	}

}
