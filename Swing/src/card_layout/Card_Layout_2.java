package card_layout;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Card_Layout_2 extends JFrame implements ActionListener {
	
	private CardLayout layout;
	private JButton[] buttons;
	private Container container;
	
	public Card_Layout_2() {
		inItComponent();
		layoutCard();
	}

	public void inItComponent() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Card Layout 2");
		this.setBounds(20,  20,  500,  500);
		
	}
	
	public void layoutCard() {
		String[] name = {"First", "Second", "Third", "Fourth", "Fifth"};
		
		layout = new CardLayout();
		container = this.getContentPane();
		container.setLayout(layout);
		
		buttons = new JButton[]{new JButton("1"), new JButton("2"), new JButton("3"), new JButton("4"), new JButton("5")};
		
		for (int i=0; i<buttons.length; i++) {
			container.add(buttons[i], name[i]);
		}
		
		buttons[0].addActionListener(this);
		buttons[1].addActionListener(this);
		buttons[2].addActionListener(this);
		buttons[3].addActionListener(this);
		buttons[4].addActionListener(this);
		
		// this would show the defined content like here is showing button 3
		layout.show(container, "Third");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		layout.show(container, "Fifth"); // same here, this would show defined button when i click
		
		//layout.next(container);
		
	}
	
	public static void main(String[] args) {
		Card_Layout_2 frame = new Card_Layout_2();
		frame.setVisible(true);

	}

	

}
