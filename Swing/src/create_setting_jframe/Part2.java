package create_setting_jframe;

import javax.swing.JFrame;

public class Part2 extends JFrame{
	
	// this is another way to create JFrame
	
	public Part2() {
		
		setBounds(200, 50, 300, 400);
		setTitle("JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setResizable(false);
		
	}

	public static void main(String[] args) {
		
		Part2 frame = new Part2();
		frame.setVisible(true);
		

	}

}
