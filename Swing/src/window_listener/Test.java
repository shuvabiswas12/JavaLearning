package window_listener;

import java.awt.Container;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;


public class Test extends JFrame {
	
	private Container container;
	
	public Test() {
		inItComponent();
		
	}


	public void inItComponent() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setTitle("Mouse Motion Listener");
		this.setBounds(20, 20, 400, 500);
		
		this.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				System.out.println("Window Opened");
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				System.out.println("Window Iconified");
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				System.out.println("Window DeIconified");
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				System.out.println("Window Deactivated");
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("Window Closing");
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				System.out.println("Window Closed");
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				System.out.println("Window Activated");
				
			}
		});
	}
	
	public static void main(String[] args) {
		
		Test frame = new Test();
		

	}

}
