package flash_card_application;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class FlashCardPlayer extends JFrame {
	
	private Container container;
	private JPanel panel;
	private JTextArea answers;
	private JButton button;
	
	public FlashCardPlayer() {
		inItComponent();
	}
	
	

	private void inItComponent() {
		this.setTitle("PLayer for Flash Card");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 600);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
		answers = new JTextArea(10, 25);
		answers.setLineWrap(true);
		answers.setWrapStyleWord(true);
		
		JScrollPane scrollPane = new JScrollPane(answers);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		button = new JButton("Show Next");
		
		
		
		panel = new JPanel();
		panel.add(scrollPane);
		panel.add(button);
		
		container = this.getContentPane();
		container.add(BorderLayout.CENTER, panel);
		
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("File");
		JMenuItem loadSaveFile = new JMenuItem("Load Save File");
		menu.add(loadSaveFile);
		menuBar.add(menu);
		this.setJMenuBar(menuBar);
		
		
		
		
		// listener
		button.addActionListener(new ShowNextListener());
		loadSaveFile.addActionListener(new LoadSaveFileListener());
	}
	
	
	
	class LoadSaveFileListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			
		}
		
	}



	class ShowNextListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		FlashCardPlayer player = new FlashCardPlayer();
		

	}

}
