package mouse_motion_listener;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Motion extends JFrame {
	private Container container;
	private JTextField textField;
	private JTextArea textArea;
	
	public Motion() {
		inItComponent();
		listenerMotion();
		
	}
	
	private void listenerMotion() {
		container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.pink);
		
		textArea = new JTextArea();
		textArea.setBounds(20, 20,  200,  200);
		container.add(textArea);
		
		textField = new JTextField();
		textField.setBounds(230, 20, 100, 50);
		container.add(textField);
		
		textArea.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				textField.setText("Mouse Moved");
				
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				textField.setText("Mouse Dragged");
				
			}
		});
		
	}

	public void inItComponent() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setTitle("Mouse Motion Listener");
		this.setBounds(20, 20, 400, 500);
	}

	public static void main(String[] args) {
		
		Motion frame = new Motion();
		
	}

}
