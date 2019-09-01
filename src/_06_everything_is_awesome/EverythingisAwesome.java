package _06_everything_is_awesome;

import javax.swing.JOptionPane;

public class EverythingisAwesome {
public static void main(String[] args) {
	String like = JOptionPane.showInputDialog("What do you like?");
	JOptionPane.showMessageDialog(null, "You like" + " "+ like);
	
	
}
}
