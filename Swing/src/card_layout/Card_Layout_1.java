package card_layout;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Card_Layout_1 extends JFrame implements ActionListener {
	
	private Container container;
	private JButton[] buttons;
	
	
	private CardLayout layout;
	
	public Card_Layout_1() {
		inItComponent();
		layoutCard();
	}
	
	public void inItComponent() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Card Layout");
		this.setBounds(20, 20,  500,  500);
				
	}
	
	
	// card layout
	public void layoutCard() {
		
		layout = new CardLayout();
		
		container = this.getContentPane();
		container.setLayout(layout);
		
		buttons = new JButton[]{new JButton("1"), new JButton("2"), new JButton("3"), new JButton("4"), new JButton("5")};
		
		container.add(buttons[0]);
		container.add(buttons[1]);
		container.add(buttons[2]);
		container.add(buttons[3]);
		container.add(buttons[4]);
		
		for (int i=0; i<buttons.length; i++) {
			buttons[i].addActionListener(this);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// this can perform fast to last
		this.layout.next(container);
		
		// this can perform last to fast
		//this.layout.previous(container);
		
	}

	public static void main(String[] args) {
		Card_Layout_1 frame = new Card_Layout_1();
		frame.setVisible(true);
		

	}

	

}
