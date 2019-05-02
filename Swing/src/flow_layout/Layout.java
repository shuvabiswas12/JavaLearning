package flow_layout;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layout extends JFrame {
	
	private Container container;
	private JButton button[];
	
	public Layout() {
		this.inItComponent();
		this.flowLayout();
		
	}
	
	// flow layout is the default layout of JPanel.
	// and by default the height and width of flow layout is 5px, and the alignment is center. 
	// flow layout set component in horizontally
	private void flowLayout() {
		button = new JButton[10];
			
		FlowLayout fLayout = new FlowLayout(FlowLayout.LEFT);
		fLayout.setHgap(10);
		fLayout.setVgap(5);
		container.setLayout(fLayout);
		
		for(int i=0; i<10; i++) {
			button[i] = new JButton(""+(i+1));
			container.add(button[i]);
		}
		
	}

	public void inItComponent() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setTitle("Border Layout");
		this.setBounds(20, 20, 400, 500);
		
		container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.PINK);
	}

	public static void main(String[] args) {
		Layout frame = new Layout();

	}

}