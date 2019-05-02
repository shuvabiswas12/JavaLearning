package vowel_counter_using_key_listener;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Vowel extends JFrame {
	
	// field
	private Container container;
	private JLabel textLabel, aLabel, eLabel, iLabel, oLabel, uLabel, totalLabel;
	private JTextArea textArea;
	private Font font;
	private int totalVowel = 0;
	private int letterA = 0;
	private int letterE = 0;
	private int letterI = 0;
	private int letterO = 0;
	private int letterU = 0;

	public Vowel() {
		inItComponent();
		vowelCounter();
	}
	
	public void inItComponent() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Vowel Counter Using KeyListener");
		this.setVisible(true);
		this.setBounds(20, 20, 900, 600);
		
		container = this.getContentPane();
		container.setLayout(null);
	}
	
	public void vowelCounter() {
		font = new Font("my riad pro", Font.BOLD, 20);
		
		textLabel = new JLabel();
		textLabel.setText("Enter What You Want ");
		textLabel.setBounds(20,  20,  240,  40);
		textLabel.setFont(font);
		container.add(textLabel);
		
		textArea = new JTextArea();
		//textArea.setBounds(270,  20,  300,  100);
		textArea.setFont(font);
		textArea.setLineWrap(true);
		container.add(textArea);
		
		JScrollPane pane = new JScrollPane(textArea);
		pane.setBounds(280,  20, 300, 100);
		container.add(pane);
		
		aLabel = new JLabel("a : ");
		aLabel.setBounds(280, 130, 100, 40);
		aLabel.setFont(font);
		container.add(aLabel);
		
		eLabel = new JLabel("e : ");
		eLabel.setBounds(280, 180, 100, 40);
		eLabel.setFont(font);
		container.add(eLabel);
		
		iLabel = new JLabel("i : ");
		iLabel.setBounds(280, 230, 100, 40);
		iLabel.setFont(font);
		container.add(iLabel);
		
		oLabel = new JLabel("o : ");
		oLabel.setBounds(280, 280, 100, 40);
		oLabel.setFont(font);
		container.add(oLabel);
		
		uLabel = new JLabel("u : ");
		uLabel.setBounds(280, 320, 100, 40);
		uLabel.setFont(font);
		container.add(uLabel);
		
		totalLabel = new JLabel("TOTAL VOWEL: ");
		totalLabel.setBounds(280, 370, 200, 40);
		container.add(totalLabel);
		
		textArea.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				
				if (e.getSource() == textArea) {
					if (e.VK_A == e.getKeyCode()) {
						totalVowel++;
						letterA++;
						aLabel.setText("A : "+letterA);
						totalLabel.setText("TOTAL VOWEL : "+ totalVowel);
					}
					if (e.VK_E == e.getKeyCode()) {
						totalVowel++;
						letterE++;
						eLabel.setText("E : "+letterE);
						totalLabel.setText("TOTAL VOWEL : "+ totalVowel);
					}
					if (e.VK_I == e.getKeyCode()) {
						totalVowel++;
						letterI++;
						iLabel.setText("I : "+letterI);
						totalLabel.setText("TOTAL VOWEL : "+ totalVowel);
					}
					if (e.VK_O == e.getKeyCode()) {
						totalVowel++;
						letterO++;
						oLabel.setText("O : "+letterO);
						totalLabel.setText("TOTAL VOWEL : "+ totalVowel);
					}
					if (e.VK_U == e.getKeyCode()) {
						totalVowel++;
						letterU++;
						uLabel.setText("U : "+letterU);
						totalLabel.setText("TOTAL VOWEL : "+ totalVowel);
					}
				}
				
			}
		});
		
	}
	
	public static void main(String[] args) {
		
		Vowel frame = new Vowel();

	}

}
