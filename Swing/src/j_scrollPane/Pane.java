package j_scrollPane;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Pane extends JFrame {
	private Container container;
	private JLabel textLabel;
	private Font font;
	
	public Pane() {
		AreaOfText();
	}
	
	

	private void AreaOfText() {
		
		container = this.getContentPane();
		container.setLayout(null);
		
		font = new Font("my riad pro", Font.BOLD, 20);
		
		this.setVisible(true);
		this.setSize(400, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("JScrollPane");
		this.setLocationRelativeTo(null);
		
		JTextArea jArea = new JTextArea();
		//jArea.setSize(200, 200);
		//jArea.setLocation(20, 10);
		//jArea.setBackground(Color.ORANGE);
		jArea.setFont(font);
		//jArea.setLineWrap(true);
		//jArea.setWrapStyleWord(true);
		//container.add(jArea);
		
		
		// JScrollPane
		
		//JScrollPane scrollPane = new JScrollPane(jArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		//JScrollPane scrollPane = new JScrollPane(jArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		JScrollPane scrollPane = new JScrollPane(jArea);
		scrollPane.setSize(200, 200);
		scrollPane.setLocation(20, 10);
		scrollPane.setBackground(Color.orange);
		
		
		container.add(scrollPane);
		
	}



	public static void main(String[] args) {
		
		Pane frame = new Pane();		

	}

}
