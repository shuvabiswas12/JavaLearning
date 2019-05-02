package slide_show;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlideShow extends JFrame implements ActionListener {
	
	private Container container;
	private JButton previous, next;
	private JPanel panel;
	private CardLayout layout;
	private ImageIcon icon;
	private JLabel label;
	
	public SlideShow() {
		inItComponent();
		showImage();
	}
	
	public void inItComponent() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Slide Show");
		this.setBounds(20, 20, 600, 600);
		
		
		container = this.getContentPane();
		container.setBackground(Color.PINK);
		container.setLayout(null);
		
		layout = new CardLayout();
		
		panel = new JPanel(layout);
		panel.setBounds(40,  10,  500,  400);
		panel.setBackground(Color.WHITE);
		container.add(panel);
		
		previous = new JButton("Previous");
		previous.setBounds(40,  415,  100,  50);
		container.add(previous);
		
		
		next = new JButton("Next");
		next.setBounds(440,  415,  100,  50);
		container.add(next);
		
		
		next.addActionListener(this);
		previous.addActionListener(this);

		
	}
	
	public void showImage() {
		
		String[] iconName = {"1.png", "2.png", "3.png"};
		for (int i=0; i<iconName.length; i++) {
			icon = new ImageIcon("src/image/"+iconName[i]);
			
			Image image = icon.getImage();
			Image newImage = image.getScaledInstance(panel.getWidth(), panel.getHeight(), image.SCALE_SMOOTH);
			
			icon = new ImageIcon(newImage);
			
			label = new JLabel(icon);
			panel.add(label);
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == next) {
			layout.next(panel);
		}
		else {
			layout.previous(panel);
		}
		
		
	}

	public static void main(String[] args) {
		SlideShow frame = new SlideShow();
		frame.setVisible(true);
	}


}
