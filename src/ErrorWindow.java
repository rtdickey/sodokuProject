
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ErrorWindow extends JFrame implements ActionListener{
	ErrorWindow(){
		//test
		super();
		setSize(300, 150);
		setTitle("Team Uhhhh");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		// creates a new Border Layout 
		setLayout(new BorderLayout());
		JLabel errorStatement = new JLabel("Enter Numbers Only!", JLabel.CENTER);
		add(errorStatement, BorderLayout.CENTER);
		
		// creates a button to be pressed to dismiss window
		JPanel submitButton = new JPanel(new FlowLayout());
		JButton closeWindow = new JButton("OK");
		closeWindow.addActionListener(this);
		submitButton.add(closeWindow);
		add(submitButton, BorderLayout.SOUTH);
	}

	public void actionPerformed(ActionEvent e) {
		dispose(); // gets rid of the current window
	}
	

}
