package j_tabble;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MyTable extends JFrame {
	
	private Container container;
	private JLabel label;
	private JScrollPane pane;
	private String[] col = {"Id", "Name", "Cgpa"};
	private String[][] row = {
			
			{"101", "Shuva", "3.00"},
			{"102", "Sangeeta", "3.40"},
			{"103", "Ananya", "3.90"},
			{"104", "Piu", "3.60"}
			
	};
	
	public MyTable() {
		inItComponent();
		
	}

	private void inItComponent() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Jtable");
		this.setBounds(20, 20, 800, 500);
		
		container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.PINK);
		
		//Jtable
		JTable table = new JTable(row, col);
		table.setSelectionBackground(Color.GREEN);
		table.setEnabled(false); // this is option for enable or not for editing
		container.add(table);
		
		pane = new JScrollPane(table);
		pane.setBounds(50, 50, 500, 300);
		//pane.setBackground(Color.green);
		container.add(pane);
		
		
		
	}

	public static void main(String[] args) {
		
		MyTable frame = new MyTable();
		frame.setVisible(true);

	}

}
