package firstProgram;

import javax.swing.JFrame;

public class Test extends JFrame {
	
	public Test() {
		
		setTitle("This is Jframe");
		setBounds(400, 200, 400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
	}
	
	public static void main(String[] args) {
		
		Test frame = new Test();
		frame.setVisible(true);
	}
	
	
}
