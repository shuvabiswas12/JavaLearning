package add_actionLister_with_JTextField;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Part2 extends JFrame {
	
	private Container container;
	private JTextField textField1, textField2;
	
	public Part2() {
		
		createFrame();
		createTextField();
	}
	
	public void createFrame() {
		
		setTitle("ActionListener Way 2");
		setSize(400, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		// for set up a icon in title bar
		ImageIcon icon = new ImageIcon(getClass().getResource("listener_icon.png"));
		setIconImage(icon.getImage());
	}
	
	public void createTextField() {
		
		Font font = new Font("Arial", Font.BOLD + Font.ITALIC, 15);
		
		container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.lightGray);
		
		// for textField 1
		textField1 = new JTextField();
		textField1.setBounds(20, 20, 250, 50);
		textField1.setBackground(Color.pink);
		textField1.setForeground(Color.white);
		textField1.setFont(font);
		textField1.setHorizontalAlignment(JTextField.CENTER);
		
		container.add(textField1);
		
		// for textField 2
		textField2 = new JTextField();
		textField2.setBounds(20, 80, 250, 50);
		textField2.setBackground(Color.pink);
		textField2.setForeground(Color.white);
		textField2.setFont(font);
		textField2.setHorizontalAlignment(JTextField.CENTER);
		
		container.add(textField2);
		
		HandleListener listener = new HandleListener();
		textField1.addActionListener(listener);
		textField2.addActionListener(listener);
		
	}
	
	// create a handler class for multiple action listener 
	class HandleListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == textField1) {
				String string = textField1.getText();
				if (string.isEmpty()) {
					
					JOptionPane.showMessageDialog(null, "You haven't write anything");
				}
				
				else {
					JOptionPane.showMessageDialog(null, "textField1 = "+string);
				}
			}
			
			else {
				String string = textField2.getText();
				if (string.isEmpty()) {
					
					JOptionPane.showMessageDialog(null, "You haven't write anything");
				}
				
				else {
					JOptionPane.showMessageDialog(null, "textField2 = "+string);
				}
			}		
			
		}
		
	}

	public static void main(String[] args) {
		
		Part2 frame = new Part2();
		frame.setVisible(true);
		
	}

}
