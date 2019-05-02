package j_slider_project_with_change_listener;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Project extends JFrame implements ChangeListener {
	
	private Container container;
	private JSlider redSlider, greenSlider, blueSlider;
	private JLabel text;
	private JTextField redField, greenField, blueField;
	private JLabel red, green, blue, preview;
	private JPanel panel;

	public Project() {
		inItComponent();
	}
	
	private void inItComponent() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(20,  20,  600,  350);
		this.setTitle("JSlider Project");
		
		container = this.getContentPane();
		container.setLayout(null);
		
		red = new JLabel("Red");
		red.setBounds(32,  40,  50,  50);
		container.add(red);
		
		redField = new JTextField();
		redField.setBounds(270,  42,  60,  40);
		container.add(redField);
		
		greenField = new JTextField();
		greenField.setBounds(270,  102,  60,  40);
		container.add(greenField);
		
		blueField = new JTextField();
		blueField.setBounds(270,  162,  60,  40);
		container.add(blueField);
		
		green = new JLabel("Green");
		green.setBounds(20,  100,  60,  50);
		container.add(green);
		
		blue = new JLabel("Blue");
		blue.setBounds(28,  160,  50,  50);
		container.add(blue);
		
		preview = new JLabel("Preview");
		preview.setBounds(410,  160,  70,  70);
		container.add(preview);
		
		redSlider = new JSlider(0, 255, 0);
		redSlider.setBounds(60,  42,  200,  50);
		container.add(redSlider);
		
		greenSlider = new JSlider(0, 255, 0);
		greenSlider.setBounds(60,  102,  200,  50);
		container.add(greenSlider);
		
		blueSlider = new JSlider(0, 255, 0);
		blueSlider.setBounds(60,  162,  200,  50);
		container.add(blueSlider);
		
		panel = new JPanel();
		panel.setBounds(360,  42,  150,  140);
		panel.setBackground(Color.pink);
		container.add(panel);
		
		redSlider.addChangeListener(this);
		greenSlider.addChangeListener(this);
		blueSlider.addChangeListener(this);
		
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		
		int red = redSlider.getValue();
		int green = greenSlider.getValue();
		int blue = blueSlider.getValue();
		
		redField.setText(""+red);
		greenField.setText(""+green);
		blueField.setText(""+blue);
		
		Color color = new Color(red, green, blue);
		panel.setBackground(color);
		
	}
	
	public static void main(String[] args) {
		Project frame = new Project();
		frame.setVisible(true);

	}

	

}
