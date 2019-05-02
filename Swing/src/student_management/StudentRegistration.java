package student_management;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class StudentRegistration extends JFrame implements ActionListener {
	
	private Container container;
	private Font font;
	private JLabel fName, lName, phone, gpa, title;
	private JTextField fNameInput, lNameInput, phoneInput, gpaInput;
	private JButton addBtn, updateBtn, deleteBtn, clearBtn;
	private JTable table;
	private JScrollPane pane;
	private DefaultTableModel model;
	
	private String[] row = new String[4];
	private String[] col =  {"First Name", "Last Name", "GPA", "Phone"};
	
	public StudentRegistration() {
		inItComponent();
	}
	
	public void inItComponent() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(20,  20,  780,  690);
		this.setTitle("Student registation");
		
		container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.PINK);
		
		
		font = new Font("my riad pro", Font.BOLD, 16);
		
		title = new JLabel("Student Registration");
		title.setBounds(315,  7,  160,  50);
		title.setFont(font);
		container.add(title);
		
		fName = new JLabel("First Name");
		fName.setBounds(30,  60,  100,  50);
		fName.setFont(font);
		container.add(fName);
		
		lName = new JLabel("Last Name");
		lName.setBounds(30,  120,  100,  50);
		lName.setFont(font);
		container.add(lName);
		
		phone = new JLabel("Phone");
		phone.setBounds(30,  180,  100,  50);
		phone.setFont(font);
		container.add(phone);
		
		gpa = new JLabel("GPA");
		gpa.setBounds(30,  240,  100,  50);
		gpa.setFont(font);
		container.add(gpa);
		
		fNameInput = new JTextField();
		fNameInput.setBounds(190,  65,  230,  40);
		fNameInput.setFont(font);
		container.add(fNameInput);
		
		lNameInput = new JTextField();
		lNameInput.setBounds(190,  125,  230,  40);
		lNameInput.setFont(font);
		container.add(lNameInput);
		
		phoneInput = new JTextField();
		phoneInput.setBounds(190,  185,  230,  40);
		phoneInput.setFont(font);
		container.add(phoneInput);
		
		gpaInput = new JTextField();
		gpaInput.setBounds(190,  245,  230,  40);
		gpaInput.setFont(font);
		container.add(gpaInput);
		
		addBtn = new JButton("Add");
		addBtn.setBounds(480,  65,  100,  40);
		addBtn.setFont(font);
		container.add(addBtn);
		
		updateBtn = new JButton("Update");
		updateBtn.setBounds(480,  125,  100,  40);
		updateBtn.setFont(font);
		container.add(updateBtn);
		
		deleteBtn = new JButton("Delete");
		deleteBtn.setBounds(480,  185,  100,  40);
		deleteBtn.setFont(font);
		container.add(deleteBtn);
		
		clearBtn = new JButton("Clear");
		clearBtn.setBounds(480,  245,  100,  40);
		clearBtn.setFont(font);
		container.add(clearBtn);
		
		model = new DefaultTableModel();
		model.setColumnIdentifiers(col);
		
		
		table = new JTable();
		table.setEnabled(true);
		table.setSelectionBackground(Color.GREEN);
		table.setModel(model);
		container.add(table);
		table.setFont(font);
		table.setBackground(Color.white);
		table.setRowHeight(30);
		
		pane = new JScrollPane(table);
		pane.setBounds(30,  340,  700,  270);
		container.add(pane);
		
		addBtn.addActionListener(this);
		clearBtn.addActionListener(this);
		updateBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		
		
		// this process for showing data form every row into text field
		table.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int numberOfRow = table.getSelectedRow();
				
				String f_name = model.getValueAt(numberOfRow, 0).toString();
				String l_name = model.getValueAt(numberOfRow, 1).toString();
				String selected_gpa = model.getValueAt(numberOfRow, 2).toString();
				String selected_phone = model.getValueAt(numberOfRow, 3).toString();
				
				fNameInput.setText(f_name);
				lNameInput.setText(l_name);
				gpaInput.setText(selected_gpa);
				phoneInput.setText(selected_phone);
			}
		});
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// add button
		if (e.getSource() == addBtn) {
			
			row[0] = fNameInput.getText().toString();
			row[1] = lNameInput.getText().toString();
			row[2] = gpaInput.getText().toString();
			row[3] = phoneInput.getText().toString();
			
			if (row[0].isEmpty() || row[1].isEmpty() || row[2].isEmpty() || row[3].isEmpty()) {
				JOptionPane.showMessageDialog(this, "Please, insert all data");
			}
			
			else {
				model.addRow(row);
			
			}
		}
		
		
		// delete button
		else if (e.getSource() == deleteBtn) {
			
			int numberOfRow = table.getSelectedRow();
			
			if (numberOfRow>=0) {
				model.removeRow(numberOfRow);
			}
			else {
				JOptionPane.showMessageDialog(null, "Please, select a row");
			}
		}
		
		
		// update button
		else if (e.getSource() == updateBtn) {
			
			int numberOfRow = table.getSelectedRow();
			
			if (numberOfRow>=0) {
				
				String f_name = fNameInput.getText();
				String l_name = lNameInput.getText();
				String selected_gpa = gpaInput.getText();
				String selected_phone = phoneInput.getText();
				
				
				model.setValueAt(f_name, numberOfRow, 0);
				model.setValueAt(l_name, numberOfRow, 1);
				model.setValueAt(selected_gpa, numberOfRow, 2);
				model.setValueAt(selected_phone, numberOfRow, 3);
				
			}
			
		}
		
		
		// clear button
		else if (e.getSource() == clearBtn) {
			
			fNameInput.setText("");
			lNameInput.setText("");
			gpaInput.setText("");
			phoneInput.setText("");
		}
		
		
	}

	public static void main(String[] args) {
		StudentRegistration frame = new StudentRegistration();
		frame.setVisible(true);

	}


}
