package j_radioButton;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;


public class Test extends JFrame {
	public Container container;
	private Font font;
	private JTextArea textArea = new JTextArea();
	
	public Test() {
		inItComponent();
		button();
	}

	private void inItComponent() {
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(20, 20, 400, 500);
		this.setTitle("JRadioButton");
		
	}
	
	public void button() {
				
		font = new Font("my riad pro", Font.BOLD, 20);
		
		// JRadioButton for Male
		JRadioButton male = new JRadioButton("Male");
		male.setFont(font);
		//male.setEnabled(false); // for disabling radio button. By default it has enable 
		male.setBounds(20, 20, 100, 30);
		
		// JRadioButton for feMale
		JRadioButton feMale = new JRadioButton("FeMale");
		feMale.setFont(font);
		//feMale.setSelected(true); // for internally selected any button
		feMale.setBounds(20, 60, 100, 30);
		
		container = this.getContentPane();
		container.setLayout(null);
		
		container.add(male);
		container.add(feMale);
		
		
		textArea.setBounds(20, 100, 200, 100);
		container.add(textArea);
		
		// ButtonGroup
		ButtonGroup group = new ButtonGroup();
		group.add(male);
		group.add(feMale);
		
		
		// listener for male
		male.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.append("You Have SElected Male\n");
				
			}
		});
		
		// listener for feMale
		feMale.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.append("You Have Selected FeMale\n");
				
			}
		});
	}
	

	public static void main(String[] args) {
		
		new Test();

	}

}
