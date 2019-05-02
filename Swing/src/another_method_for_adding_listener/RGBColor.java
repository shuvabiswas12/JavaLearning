package another_method_for_adding_listener;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class RGBColor extends JFrame implements ActionListener {
	
	public Container container;
	private JButton redButton, greenButton, blueButton;

	public RGBColor() {
		inItComponent();
	}

	private void inItComponent() {
		
		container = this.getContentPane();
		container.setLayout(null);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(20, 20, 400, 600);
		this.setTitle("Different method for Adding ActionListener");
		
		redButton = new JButton("Red");
		redButton.setBounds(20,  50,  100,  30);
		container.add(redButton);
		
		greenButton = new JButton("Green");
		greenButton.setBounds(20,  90,  100,  30);
		container.add(greenButton);
		
		blueButton = new JButton("Blue");
		blueButton.setBounds(20,  130,  100,  30);
		container.add(blueButton);
		
		redButton.addActionListener(this);
		blueButton.addActionListener(this);
		greenButton.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == redButton) {
			container.setBackground(Color.red);
		}
		if (e.getSource() == blueButton) {
			container.setBackground(Color.BLUE);
		}
		if (e.getSource() == greenButton) {
			container.setBackground(Color.GREEN);
		}
		
	}
	
	public static void main(String[] args) {
		RGBColor frame = new RGBColor();
		
	}

}
