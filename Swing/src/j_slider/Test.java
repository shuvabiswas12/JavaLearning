package j_slider;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JSlider;

public class Test extends JFrame {
	private Container container;
	
	public Test() {
		inItComponent();
	}

	private void inItComponent() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("JSlider");
		this.setBounds(20,  20,  300,  200);
		
		container = this.getContentPane();
		container.setLayout(null);
		
		JSlider slider = new JSlider(0,20, 0);
		slider.setBounds(20,  20,  200,  50);
		slider.setMinorTickSpacing(1);
		slider.setMajorTickSpacing(20);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		
		container.add(slider);
		
	}

	public static void main(String[] args) {
		
		Test frame = new Test();
		frame.setVisible(true);

	}

}
