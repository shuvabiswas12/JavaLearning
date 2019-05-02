package create_setting_jframe;

import javax.swing.JFrame;

public class Part1 {

	public static void main(String[] args) {
		
		// we can create JFrame in two different way. This part1 class has one way..
		// and part2 class has another way. 
		
		JFrame frame = new JFrame();
		
		// by default JFrame are invisible. so we have to visible it by setVisible method
		frame.setVisible(true);
		
		// this method is need to close the JFrame when click on exit button
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// to set frame size
		//frame.setSize(400, 500);
		
		// for set location to center
		//frame.setLocationRelativeTo(null);
		
		
		// this method is for choosing location on my choice
		//frame.setLocation(200, 50);
		
		
		// we can adding setSize() and setLocation() method in one method, that is setBounds().
		frame.setBounds(200, 50, 300, 200);
		
		
		
		// this method is for setting title
		frame.setTitle("JFrame");
		
		
		// this method is for resize the frame or not
		frame.setResizable(false);
	}

}
