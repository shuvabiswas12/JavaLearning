package j_comboBox;

import java.awt.Container;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Test extends JFrame {
	
	private Container container;
	public String language[] = {"C", "Java", "Python"};
	
	public Test() {
		inItComponent();
		Box();
	}

	private void inItComponent() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setBounds(20, 20, 400, 500);
		this.setTitle("JCombobox");
	}
	
	// JComboBox
	public void Box() {
		JComboBox comboBox = new JComboBox(language);
		comboBox.setBounds(20, 20, 100, 50);
		comboBox.setEditable(true); // for editing any items
		
		container = this.getContentPane();
		container.setLayout(null);
		container.add(comboBox);
	}

	public static void main(String[] args) {
		Test frame = new Test();
		

	}

}
