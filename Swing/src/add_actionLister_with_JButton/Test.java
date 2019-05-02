package add_actionLister_with_JButton;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.xml.bind.Marshaller.Listener;

public class Test extends JFrame {
	
	private Container container;
	private JTextField text1;
	private JButton button, button2;
	
	public Test() {
		
		Frame();
		
		Listener();
		
	}
	
	private void Listener() {
		
		container = this.getContentPane();
		container.setLayout(null);
				
		text1 = new JTextField();
		text1.setBounds(20, 20, 300, 50);
		container.add(text1);
		
		button = new JButton("Clear");
		button.setBounds(20, 80, 100, 50);
		container.add(button);
		
		button2 = new JButton("Ok!");
		button2.setBounds(130, 80, 100, 50);
		container.add(button2);
		
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				String text = text1.getText().toString();
				
				JOptionPane.showMessageDialog(null, text);
								
			}
		});
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				text1.setText("");
				JOptionPane.showMessageDialog(null, "Successfully cleared");
				
			}
		});
		
	}

	public void Frame() {
		
		setTitle("Button with action listener");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 500);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		
		Test frame = new Test();
		
		
	}

}
