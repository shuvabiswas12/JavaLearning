package show_confirm_dialog;

import javax.swing.JOptionPane;

public class Class2 {

	public static void main(String[] args) {
		
		int choice = JOptionPane.showConfirmDialog(null, "Do You Want To Quit This Program ?", "Quit", JOptionPane.YES_NO_OPTION);
		
		if (choice == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
		else {
			System.out.println("You select No Option");
		}
		
		

	}

}
