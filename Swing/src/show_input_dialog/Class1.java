package show_input_dialog;
import javax.swing.JOptionPane;

public class Class1 {

	public static void main(String[] args) {
		
		/*String name = JOptionPane.showInputDialog("What's Your Name : ");
		JOptionPane.showMessageDialog(null, "Hello, "+name+" Welcome to Swing");*/
		
		String f_name = JOptionPane.showInputDialog(null, "Enter Your First Name : ");
		String l_name = JOptionPane.showInputDialog(null, "Enter Your Last Name : ");
		
		String full_Name = f_name+" "+l_name;
		
		JOptionPane.showMessageDialog(null, "Your Full Name is : "+full_Name);
		
		
	}

}
