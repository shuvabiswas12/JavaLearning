package actionLlistener_with_JComboBox;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test extends JFrame {
	
	private Container container;
	private JComboBox comboBox;
	private JLabel label;
	private JButton button;
	
	public Test() {
		inItComponent();
	}

	private void inItComponent() {
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Action Listener With JComboBox");
		this.setBounds(20, 20, 500, 600);
		
		
		container = this.getContentPane();
		container.setBackground(Color.CYAN);
		container.setLayout(null);
		
		
		// for JComboBox
		String items[] = {"C", "Java", "Python", ".net"};
		comboBox = new JComboBox(items);
		comboBox.setBounds(20, 20, 100, 50);
		container.add(comboBox);
		
		
		// for label
		label = new JLabel("You havn't selected any items");
		label.setBounds(20, 80, 250, 50);
		container.add(label);
		
		// for button
		button = new JButton("OK!");
		button.setBounds(20, 130, 100, 50);
		container.add(button);
		
		/*
		// action listener
		comboBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String src = comboBox.getSelectedItem().toString();
				label.setText("You have selected "+src);
				
			}
		});*/
		
		
		// action listener with button
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String src = comboBox.getSelectedItem().toString();
				label.setText("You have selected "+src);
				
			}
		});
	}

	public static void main(String[] args) {
		
		Test frame = new Test();
		

	}

}
