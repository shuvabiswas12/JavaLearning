package j_spinner;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TestProject extends JFrame implements ChangeListener {
	
	private Container container;
	private JLabel label;
	private JSpinner spinner;  // spinner
	
	
	public TestProject() {
		inItComponent();
	}

	private void inItComponent() {
		container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.PINK);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("JSpinner");
		this.setBounds(20,  30, 300,  300);
		
		label = new JLabel("Current Value is : 30");
		label.setBounds(20, 150, 200, 50);
		container.add(label);
		
		
		// spinner
		SpinnerNumberModel model = new SpinnerNumberModel(30,  0,  30,  2);
		spinner = new JSpinner(model);
		spinner.setBounds(20,  40,  100,  100);
		container.add(spinner);
		
		// change listener with spinner
		spinner.addChangeListener(this);
		
		
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		
		String number = spinner.getValue().toString();
		
		label.setText("Current value is : "+number);
		
	}
	
	public static void main(String[] args) {
		TestProject frame = new TestProject();
		frame.setVisible(true);
		

	}


}
