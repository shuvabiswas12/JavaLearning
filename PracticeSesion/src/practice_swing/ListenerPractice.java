package practice_swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ListenerPractice extends JFrame {
	
	private Container container;
	private JTextField textField1, textField2;
	public ListenerPractice() {
		frame();
		icon();
		inItcomponents();
	}
	
	public void inItcomponents() {
		container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.BLUE);
		
		textField1 = new JTextField();
		textField1.setBounds(20, 20, 200, 50);
		textField1.setHorizontalAlignment(JTextField.CENTER);
		textField1.setFont(new Font("my riad pro", Font.BOLD + Font.ITALIC, 15));
		
		container.add(textField1);
		
		textField2 = new JTextField();
		textField2.setBounds(20, 80, 200, 50);
		textField2.setHorizontalAlignment(JTextField.CENTER);
		textField2.setFont(new Font("my riad pro", Font.BOLD + Font.ITALIC, 15));
		
		container.add(textField2);
	/*	
		textField1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String string = textField1.getText();
				
				JOptionPane.showMessageDialog(null, "You have write : "+string);
				
			}
		});
		
		textField2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String string = textField2.getText();
				
				JOptionPane.showMessageDialog(null, "You have write : "+string);
				
			}
		});*/
		
		HandlingListener listener = new HandlingListener();
		textField1.addActionListener(listener);
		textField2.addActionListener(listener);
	}
	
	public class HandlingListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == textField1) {
				
				String string = textField1.getText().toString();
				
				if (string.isEmpty()) {
					JOptionPane.showMessageDialog(null, "PLease, write something");
				}
				else {
					JOptionPane.showMessageDialog(null, "textField_1  : "+string);
				}
			}
			
			else {
				String string = textField2.getText().toString();
				
				if (string.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please, write something");
				}
				else {
					JOptionPane.showMessageDialog(null, "textField_2 : "+string);
				}
			}
			
		}
		
	}
	
	public void frame() {
		setTitle("This is practice Listener");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 600);
		setLocationRelativeTo(null);
	}
	
	public void icon() {
		ImageIcon icon = new ImageIcon(getClass().getResource("icon.png"));
		setIconImage(icon.getImage());
	}

	public static void main(String[] args) {
		
		ListenerPractice frame = new ListenerPractice();
		frame.setVisible(true);
		
	}

}
