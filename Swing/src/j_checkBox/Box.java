package j_checkBox;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Box extends JFrame {
	
	private Container container;
	
	public Box() {
		inItComponent();
		check_box();
	}

	private void check_box() {
		
		Font font = new Font("my riad pro", Font.BOLD, 20);
		
		container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.CYAN);
		
		
		// CheckBox 1
		JCheckBox checkBox1 = new JCheckBox("Java");
		checkBox1.setBounds(20,  20,  100,  30);
		checkBox1.setFont(font);
		container.add(checkBox1);
		
		// CheckBox 2
		JCheckBox checkBox2 = new JCheckBox("C");
		checkBox2.setBounds(20,  60,  100,  30);
		checkBox2.setFont(font);
		container.add(checkBox2);
		
		// CheckBox 3
		JCheckBox checkBox3 = new JCheckBox("Python");
		checkBox3.setBounds(20,  100,  100,  30);
		checkBox3.setFont(font);
		container.add(checkBox3);
		
		// ButtonGroup
		ButtonGroup group = new ButtonGroup();
		group.add(checkBox1);
		group.add(checkBox2);
		group.add(checkBox3);
		
		JLabel label = new JLabel("You havn't selected anything");
		label.setBounds(20, 140,  200, 50);
		container.add(label);
		
		/*// Action Listener
		checkBox1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				label.setText("You Have Selected Java");
			}
		});
		
		checkBox2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("You Have Selected C");
				
			}
		});
		
		checkBox3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("You Have Selected Python");
				
			}
		});
		
		*/
		
		// item listener
		
		checkBox1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				
				label.setText("You Have Selected Java");
			}
		});
		
		checkBox2.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				label.setText("You Have Selected C");
				
			}
		});
		
		checkBox3.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				label.setText("You Have Selected Python");
				
			}
		});
	}

	private void inItComponent() {
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(20, 20, 400, 500);
		this.setTitle("JRadioButton");
		
	}

	public static void main(String[] args) {
		
		Box frame = new Box();
		

	}

}
