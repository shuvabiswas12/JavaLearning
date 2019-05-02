package show_message_dialog;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MessageDialog1 {

	public static void main (String[] args) {

		//this is show default massage icon named information_message (number value is 1)
		//JOptionPane.showMessageDialog(null, "Wrong Password"); // 2 parameter

		// this is show error message icon named error_message (number value is 0)
		//JOptionPane.showMessageDialog(null, "Wrong Password", "Warning", JOptionPane.ERROR_MESSAGE); // 4 parameter

		// this is show question message icon named question_message (number value is 3)
		//JOptionPane.showMessageDialog(null, "Wrong Password", "Warning", JOptionPane.QUESTION_MESSAGE); // 4 parameter

		// this is show plane message text that means it doesn't show any icon (number value is -1)
		//JOptionPane.showMessageDialog(null, "Wrong Password", "Warning", JOptionPane.PLAIN_MESSAGE); // 4 parameter


		// this ImageIcon class is used for set icon in message
		ImageIcon icon = new ImageIcon("bangla.png"); 

		JOptionPane.showMessageDialog(null, "Wrong Password", "This is Title", JOptionPane.PLAIN_MESSAGE, icon); // 5 parameter
	}

}
