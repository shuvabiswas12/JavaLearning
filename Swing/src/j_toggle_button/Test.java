package j_toggle_button;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

public class Test extends JFrame implements ActionListener {
	private Container container;
	private JLabel label;
	private JToggleButton button;  // JToggleButton
	private ImageIcon onIcon, offIcon;
	
	public Test() {
		inItcomponent();
	}

	private void inItcomponent() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(20,  50,  400,  300);
		this.setTitle("JToggle Button");
		
		container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.PINK);
		
		
		// JToggle Button
		button = new JToggleButton("OFF");
		button.setBounds(20, 50,  300,  200);
		container.add(button);
		
		onIcon = new ImageIcon("src/image/onIcon.jpg");
		offIcon = new ImageIcon("src/image/offIcon.jpg");
		
		button.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (button.isSelected()) {
			
			//button.setText("ON");
			button.setIcon(onIcon);
		}
		else {
			
			//button.setText("OFF");
			button.setIcon(offIcon);
		}
	}
	

	public static void main(String[] args) {
		
		Test frame = new Test();
		frame.setVisible(true);
	}

}
