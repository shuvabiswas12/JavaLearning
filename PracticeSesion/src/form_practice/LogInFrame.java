package form_practice;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class LogInFrame extends JFrame implements Form{
	
	public Container container;
	public JLabel firstName_L, middleName_L, lastName_L, password_L, confirmPassword_L;
	public ImageIcon icon;
	public JTextField firstName_TF, middleNAme_TF, lastName_TF, password_TF, confirmPassword_TF;
	public JButton saveBtn, clearBtn;
	public static ArrayList<String> dataList;
	
	public LogInFrame() {
		this.myFrame();
		this.myForm();
		
	}
	
	public void myFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 400);
		this.setLocationRelativeTo(null);
		this.setTitle("Form");
		
		icon = new ImageIcon(getClass().getResource("icon.png"));
		this.setIconImage(icon.getImage());
		
		this.setBackground(Color.LIGHT_GRAY);
		
		
	}
	
	public void myForm() {
		
		Font fontBold = new Font("my riad pro", Font.BOLD, 20);
		Font fontItallic = new Font("my riad pro", Font.ITALIC, 15);
		
		container = getContentPane();
		container.setLayout(null);
		
		firstName_L = new JLabel("First Name ");
		firstName_L.setBounds(20, 20, 120, 50);
		firstName_L.setFont(fontBold);	
		container.add(firstName_L);
		
		firstName_TF = new JTextField();
		firstName_TF.setBounds(160, 20, 150, 50);
		firstName_TF.setFont(fontItallic);
		container.add(firstName_TF);
		
		middleName_L = new JLabel("Middle Name");
		middleName_L.setBounds(20, 80, 130, 50);
		middleName_L.setFont(fontBold);
		container.add(middleName_L);
		
		middleNAme_TF = new JTextField();
		middleNAme_TF.setFont(fontItallic);
		middleNAme_TF.setBounds(160, 90, 150, 50);
		container.add(middleNAme_TF);
		
		lastName_L = new JLabel("Last Name ");
		lastName_L.setFont(fontBold);
		lastName_L.setBounds(20, 140, 130, 50);
		container.add(lastName_L);
		
		
		lastName_TF = new JTextField();
		lastName_TF.setFont(fontItallic);
		lastName_TF.setBounds(160, 150, 150, 50);
		container.add(lastName_TF);
		
		password_L = new JLabel("Password ");
		password_L.setBounds(20, 250, 130, 50);
		password_L.setFont(fontBold);
		container.add(password_L);
		
		password_TF = new JTextField();
		password_TF.setBounds(160, 250, 150, 50);
		password_TF.setFont(fontItallic);
		container.add(password_TF);
		
		confirmPassword_L = new JLabel("Re Password ");
		confirmPassword_L.setBounds(350, 250, 130, 50);
		confirmPassword_L.setFont(fontBold);
		container.add(confirmPassword_L);
		
		confirmPassword_TF = new JTextField();
		confirmPassword_TF.setBounds(500, 250, 150, 50);
		confirmPassword_TF.setFont(fontItallic);
		container.add(confirmPassword_TF);
		
		saveBtn = new JButton("Save");
		saveBtn.setBounds(500, 50, 150, 50);
		saveBtn.setBackground(Color.PINK);
		saveBtn.setFont(fontBold);
		container.add(saveBtn);
		
		clearBtn = new JButton("Clear All");
		clearBtn.setBounds(500, 120, 150, 50);
		clearBtn.setBackground(Color.MAGENTA);
		clearBtn.setFont(fontBold);
		container.add(clearBtn);
		
		dataList = new ArrayList<>();
	
		saveBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String firstName = firstName_TF.getText().toString();
				String middleName = middleNAme_TF.getText().toString();
				String lastName = lastName_TF.getText().toString();
				String password = password_TF.getText().toString();
				String confirmPassword = confirmPassword_TF.getText().toString();
				
				dataList.add(firstName+" "+middleName+" "+lastName);
				dataList.add(" "+password);
				
				if (password.equals(confirmPassword)) {
					
					JOptionPane.showMessageDialog(null, "Successfully saved");
				}
				else {
					JOptionPane.showMessageDialog(null, "Password Mismatched");
				}
				
			}
		});
		
		clearBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				firstName_TF.setText("");
				middleNAme_TF.setText("");
				lastName_TF.setText("");
				password_TF.setText("");
				confirmPassword_TF.setText("");
				JOptionPane.showMessageDialog(null, "Cleared");
				dataList.clear();
				
			}
		});
		
	}
	


	public static void main(String[] args) {
		
		LogInFrame frame = new LogInFrame();
		frame.setVisible(true);
		

	}

}
