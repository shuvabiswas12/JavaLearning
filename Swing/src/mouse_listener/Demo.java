package mouse_listener;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Demo extends JFrame {
	private Container container;
	private JTextArea textArea;
	private  JTextField textField;
	private Font font;
	
	public Demo() {
		inItComponents();
		mouse();
	}
	
	public void inItComponents() {
		container = this.getContentPane();
		container.setLayout(null);
		
		this.setVisible(true);
		this.setTitle("Mouse Listener");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(20, 20, 500, 600);
		//this.setResizable(false);
	}
	
	public void mouse() {
		
		// comment box or textArea
		textArea = new JTextArea();
		textArea.setBounds(20,  80,  100,  300);
		textArea.setLineWrap(true);
		container.add(textArea);
		
		
		// input area or textField
		textField = new JTextField();
		textField.setBounds(20,  20,  100,  50);
		container.add(textField);
		
		textField.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				textArea.append("Mouse Realeased\n");
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				textArea.append("Mouse Pressed\n");
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				textArea.append("Mouse Exited\n");
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				textArea.append("Mouse Entered\n");
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				textArea.append("Mouse Clicked\n");
				
			}
		});
	}

	public static void main(String[] args) {
		
		Demo frame = new Demo();

	}

}
