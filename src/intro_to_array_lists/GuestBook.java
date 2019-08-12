package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	ArrayList<JButton> button = new ArrayList<JButton>();
	ArrayList<String> name = new ArrayList<String>();
	JButton temp1 = new JButton();
	JButton temp2 = new JButton();
	public static void main(String[] args) {
		GuestBook book = new GuestBook();
		book.run();
	}
	void run() {
		
		temp1.setText("Add Name");
		temp1.addActionListener(this);
		button.add(temp1);
		temp2.setText("View Names");
		temp2.addActionListener(this);
		button.add(temp2);
		panel.add(button.get(0));
		panel.add(button.get(1));
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton test = (JButton) e.getSource();
		if(test==button.get(0)) {
		String input =	JOptionPane.showInputDialog("Please enter a name");
		name.add(input);	
		}
		else if(test==button.get(1)) {
			for(int i = 0;i<name.size();i++) {
				names = names + name.get(i)+" ";
			}
			JOptionPane.showMessageDialog(null, names);
		}
		
	}
}
