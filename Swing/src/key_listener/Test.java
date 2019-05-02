package key_listener;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Test extends JFrame {
	private Container Container;
	private JTextField inputText;
	private JTextArea textArea;
	
	public Test() {
		inItComponent();
	}
	
	public void inItComponent() {
		this.setVisible(true);
		this.setBounds(20, 20, 400, 500);
		this.setTitle("key Listener");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container = this.getContentPane();
		Container.setLayout(null);
		Container.setBackground(Color.BLUE);
		
		
		inputText = new JTextField();
		inputText.setBounds(20,  20,  200,  50);
		Container.add(inputText);
		
		textArea = new JTextArea();
		textArea.setBounds(20, 80, 300, 200);
		Container.add(textArea);
		
		inputText.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
	
				textArea.append("\nKey Typed : "+e.getKeyChar());
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				textArea.append("\nKey Released : "+e.getKeyChar());
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				textArea.append("Key Pressed : "+e.getKeyChar());
				
			}
		});
	}

	public static void main(String[] args) {
		
		Test frame = new Test();
		

	}

}
