package add_actionLister_with_JTextField;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Part1 extends JFrame {
	
	private static ImageIcon icon;
	private static Container container;
	private JTextField field1, field2;
	
	public Part1() {
		
		createFrame();
		textField();
	}
	
	public void textField() {
		
		container = this.getContentPane();
		
		// setting the color in container of frame
		container.setBackground(Color.LIGHT_GRAY);
		
		container.setLayout(null);
		
		field1 = new JTextField();
		field1.setBounds(20, 20, 150, 50);
		
		// text alignment in jText Field1
		field1.setHorizontalAlignment(JTextField.CENTER);
		
		field2 = new JTextField();
		field2.setBounds(20, 80, 150, 50);
		
		// text alignment in jText Field2
		field2.setHorizontalAlignment(JTextField.CENTER);
		
		
		container.add(field1);
		container.add(field2);
		
		
		// action listener for field 1
		field1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String string = field1.getText();
				
				if (string.isEmpty()) {
					JOptionPane.showMessageDialog(null, "you haven't write anything");
				}
				else {
					JOptionPane.showMessageDialog(null, string);
				}
				
			}
		});
		
		
		// action listener for field 2
		field2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String string = field2.getText();
				
				if (string.isEmpty()) {
					JOptionPane.showMessageDialog(null, "you haven't write anything");
				}
				else {
					JOptionPane.showMessageDialog(null, string);
				}
				
			}
		});
		
	}
	
	public void createFrame() {
		
		setTitle("Action Listener");
		setSize(300, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		icon = new ImageIcon(getClass().getResource("listener_icon.png"));
		setIconImage(icon.getImage());
		
		setLocationRelativeTo(null);
		
		
	}

	public static void main(String[] args) {
		
		Part1 frame = new Part1();
		frame.setVisible(true);
		
	}

}
