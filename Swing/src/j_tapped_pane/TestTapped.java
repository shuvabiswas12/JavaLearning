package j_tapped_pane;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TestTapped extends JFrame {
	
	private Container container;
	private JLabel label1, label2, label3;
	private JPanel panel1, panel2, panel3;

	public TestTapped () {
		inItComponent();
	}
	
	private void inItComponent() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("JTappedPane");
		this.setBounds(20,  20,  400,  500);
		
		container = this.getContentPane();
		container.setLayout(null);
		
		label1 = new JLabel("This is Home");
		label2 = new JLabel("This is About");
		label3 = new JLabel("This is Exit");
		
		panel1 = new JPanel();
		panel1.add(label1);
		panel1.setBackground(Color.PINK);
		
		panel2 = new JPanel();
		panel2.add(label2);
		panel2.setBackground(Color.blue);
		
		panel3 = new JPanel();
		panel3.add(label3);
		panel3.setBackground(Color.green);
		
		
		// jtabbed pane
		JTabbedPane tabbedPane = new JTabbedPane();
		tabbedPane.setBounds(20,  40,  300,  200);
		container.add(tabbedPane);
		
		tabbedPane.add("Home", panel1);
		
		tabbedPane.addTab("About", panel2);
		
		tabbedPane.add("Exit", panel3);
		
	}
	
	public static void main(String[] args) {
		TestTapped frame = new TestTapped();
		frame.setVisible(true);
		

	}

}
