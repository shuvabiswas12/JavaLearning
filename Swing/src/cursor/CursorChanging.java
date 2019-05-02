package cursor;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CursorChanging extends JFrame {
	
	private JButton button1, button2;
	private Container container;
	
	public CursorChanging() {
		frame();
		
		
		
		
		// creating Button
		button1 = new JButton("Submit");
		button2 = new JButton("Reset");
		
		button1.setBounds(20, 20, 100, 50);
		button2.setBounds(20, 80, 100, 50);
		
		button1.setBackground(Color.blue);
		button2.setBackground(Color.GREEN);
		
		button1.setForeground(Color.WHITE);
		button2.setForeground(Color.white);
		
		// cursor adding
		// cursor changing
		Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
		button1.setCursor(cursor);
		button2.setCursor(cursor);
		
		
		container = this.getContentPane();
		container.setLayout(null);
		container.add(button1);
		container.add(button2);
		
		// set image on button
		
	}
	
	public void frame() {
		setVisible(true);
		setTitle("Cursor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 500);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		
		CursorChanging frame = new CursorChanging();
	
	}

}
