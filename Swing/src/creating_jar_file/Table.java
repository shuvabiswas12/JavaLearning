package creating_jar_file;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Table extends JFrame {
	
	private Container container;
	private ImageIcon imageIcon;
	private JLabel imageLabel, textLabel;
	private Font font;
	private TextField input;
	private JButton clear;
	private JTextArea textArea;
	private JScrollPane scrollPane;
	private Cursor cursor;
	
	
	public Table() {
		
		inItComponent();
		
	}

	private void inItComponent() {
		
		
		// creating the frame
		this.setVisible(true);
		this.setTitle("Multiplication Table");
		this.setSize(500, 700);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// container of jFrane
		container = getContentPane();
		//container.setBackground(Color.GREEN);
		container.setLayout(null);
		
		
		// image 
		imageIcon = new ImageIcon(getClass().getResource("multiplication.jpg"));
		imageLabel = new JLabel(imageIcon);
		imageLabel.setBounds(20, 20, imageIcon.getIconWidth(), imageIcon.getIconHeight());
		container.add(imageLabel);
		
		
		// font
		font = new Font("my riad pro", Font.BOLD, 20);
		
		
		// text
		textLabel = new JLabel("Enter any number ");
		textLabel.setBounds(20, 250, 200, 50);
		textLabel.setFont(font);
		container.add(textLabel);
		
		// textField
		input = new TextField();
		input.setBounds(220, 250, 100, 50);
		input.setFont(font);
		input.setBackground(Color.green);
		container.add(input);
		
		
		// cursor
		cursor = new Cursor(Cursor.HAND_CURSOR);
		
		
		// button
		clear = new JButton("Clear");
		clear.setBounds(220, 310, 100, 50);
		clear.setCursor(cursor);
		container.add(clear);
		
		
		
		// textArea
		textArea = new JTextArea();
		//textArea.setBounds(20, 380, 300, 300);
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setFont(font);
		textArea.setBackground(Color.green);
		
		// it is not needed because it is goes to under the JScrollPane
		//container.add(textArea); 
		
		scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(20, 380, 300, 250);
		container.add(scrollPane);
		
		
		// action listener for button
		clear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				input.setText("");
				
			}
		});
		
		
		// action listener for input text field
		input.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				String string = input.getText().toString();
				
				if (string.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please, Write Any Number...");
				}
				else {
					int num = Integer.parseInt(string);
					
					for (int i = 1; i < 10; i++) {
						int result = num * i;
						String res = String.valueOf(result);
						String number = String.valueOf(num);
						String incr = String.valueOf(i);
						
						textArea.append("\n"+number+" X "+incr+" = "+res);
					}
				}
				
			}
		});
	}

	public static void main(String[] args) {
		
		Table frame = new Table();

	}

}
