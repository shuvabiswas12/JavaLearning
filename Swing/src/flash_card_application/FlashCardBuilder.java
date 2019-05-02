package flash_card_application;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.MenuBar;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class FlashCardBuilder extends JFrame {
	
	private JPanel mainPanel;
	private JTextArea questionsArea;
	private JTextArea answersArea;
	private JLabel qLabel;
	private JLabel aLabel;
	private JButton CardButton;
	private JScrollPane qJScrollPane;
	private JScrollPane aJScrollPane;
	private Container container;
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem saveItem1, newItem2;
	
	private ArrayList<FlashCard> cardList;
	
	
	public FlashCardBuilder() {
		inItcomponent();
	}

	private void inItcomponent() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 600);
		this.setLocationRelativeTo(null);
		this.setTitle("Flash Card Application");
		
		questionsArea = new JTextArea(6, 28);
		questionsArea.setLineWrap(true);
		questionsArea.setWrapStyleWord(true);
		questionsArea.setFont(new Font("arial",Font.PLAIN, 17));
		
		qJScrollPane = new JScrollPane(questionsArea);
		qJScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		qJScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		answersArea = new JTextArea(6, 28);
		answersArea.setLineWrap(true);
		answersArea.setWrapStyleWord(true);
		answersArea.setFont(new Font("arial",Font.PLAIN, 17));
		
		aJScrollPane = new JScrollPane(answersArea);
		aJScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		aJScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		mainPanel = new JPanel();
		mainPanel.add(qJScrollPane);
		mainPanel.add(aJScrollPane);
		
		qLabel = new JLabel("Questions");
		qLabel.setFont(new Font("arial",Font.BOLD, 17));
		aLabel = new JLabel("Answers");
		aLabel.setFont(new Font("arial",Font.BOLD, 17));
		
		mainPanel.add(qLabel);
		mainPanel.add(qJScrollPane);
		mainPanel.add(aLabel);
		mainPanel.add(aJScrollPane);
		
		CardButton = new JButton("Next Card");
		CardButton.setFont(new Font("arial", Font.BOLD, 15));
		mainPanel.add(CardButton);
		
		menuBar = new JMenuBar();
		menu = new JMenu("File");
		saveItem1 = new JMenuItem("Save");
		saveItem1.setFont(new Font("arial",Font.PLAIN, 17));
		newItem2 = new JMenuItem("New");
		newItem2.setFont(new Font("arial",Font.PLAIN, 17));
		menu.add(saveItem1);
		menu.add(newItem2);
		menuBar.add(menu);
		menu.setFont(new Font("arial",Font.PLAIN, 17));
		
		this.setJMenuBar(menuBar);
		
		
		container = this.getContentPane();
		container.add(mainPanel);
		
		
		// listener
		CardButton.addActionListener(new NewCardListener());
		saveItem1.addActionListener(new SaveItemListener());
		newItem2.addActionListener(new NewItemListener());
		
		
		
		cardList = new ArrayList<>();
		
		
		
		
	}

	public static void main(String[] args) {
		FlashCardBuilder frame = new FlashCardBuilder();
		frame.setVisible(true);
		
		

	}
	
	
	
	
	class NewCardListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			FlashCard card = new FlashCard(questionsArea.getText(), answersArea.getText());
			cardList.add(card);
			
			//System.out.println("The size of Array list : "+cardList.size());
			
			clearCard();
			
			JFileChooser fileSave = new JFileChooser();
			fileSave.showSaveDialog(container);
			saveFile(fileSave.getSelectedFile());
		}

		private void saveFile(File selectedFile) {
			try {
				BufferedWriter writer = new BufferedWriter(new FileWriter(selectedFile));
				Iterator<FlashCard> iterator = cardList.iterator();
				while(iterator.hasNext()) {
					FlashCard card = (FlashCard)iterator.next();
					writer.write(card.getQuestions() + "/");
					writer.write(card.getAnswers() + "\n");
				}
				writer.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		private void clearCard() {
			questionsArea.setText("");
			answersArea.setText("");
			questionsArea.requestFocus();
			
		}
		
	}

	class NewItemListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
		}
		
	}

	class SaveItemListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
		}
		
	}

}



