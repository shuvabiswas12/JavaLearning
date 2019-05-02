package j_color_chooser;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class ColorChooser extends JFrame implements ActionListener {
	
	private JButton button;
	private Container container;
	
	public ColorChooser() {
		inItComponent();
	}
	
	private void inItComponent() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(20,  20, 400, 400);
		this.setTitle("ColorChooser");
		
		container = this.getContentPane();
		container.setBackground(Color.WHITE);
		container.setLayout(null);
		
		button = new JButton("Choose a Color");
		button.setBounds(40,  40,  150, 70);
		container.add(button);
		
		button.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// color chooser process
		Color color = JColorChooser.showDialog(null	, "Choose a Color", Color.YELLOW);
		container.setBackground(color);
	}

	public static void main(String[] args) {
		
		ColorChooser frame = new ColorChooser();
		frame.setVisible(true);
	}

}
