package focus_listener;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Focus extends JFrame {
	private Container container;
	private JButton button;
	private JTextArea textArea;
	
	public Focus() {
		inItComponent();
		listenerFocus();
	}
	
	private void listenerFocus() {
		
		container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.PINK);
		
		button = new JButton("Click");
		button.setBounds(20, 20, 100, 50);
		container.add(button);
		
		textArea = new JTextArea();
		textArea.setBounds(130,20, 200, 200 );
		container.add(textArea);
		
		button.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				textArea.append("Focus Lost\n");
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				textArea.append("Focus Gained\n");
				
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
		Focus frame = new Focus();
	}

}
