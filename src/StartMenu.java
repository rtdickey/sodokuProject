
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class StartMenu extends JFrame implements ActionListener{
	//hello
	public static final int WIDTHSTART = 500;
	public static final int HEIGHTSTART = 500;
	Font buttonFont = new Font("Arial", Font.BOLD, 20);
	Font headerFont = new Font("Arial", Font.BOLD, 60);
	
	public StartMenu(){
		
		super();
		setSize(WIDTHSTART, HEIGHTSTART);
		setTitle("Team Uhhhh");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout()); // creates a "bottom" Border Layout
		
		// uses a Panel in order to make a new layout(Grid) in a "layer" of the Border Layout
		JPanel buttonPanel = new JPanel(); 
		buttonPanel.setLayout(new GridLayout(5, 1));
		
		// Creates the header
		JLabel header = new JLabel("Sudoko", JLabel.CENTER);
		header.setFont(headerFont);
		buttonPanel.add(header);
		
		// creates a new Panel to set the button on top of. Used to span the whole width w/o the button spanning the whole width
		JPanel easyPanel = new JPanel();
		JButton easyButton = new JButton("Easy");
		//nineButton.setIcon(new ImageIcon("button.png"));
		easyButton.setFont(buttonFont);
		easyButton.addActionListener(this); // listens to the button being pressed, "listener" defined below
		easyPanel.add(easyButton);
		easyPanel.setBackground(Color.darkGray);
		buttonPanel.add(easyPanel); // adds the easyPanel to the bigger Button panel to be shown
		
		// same for the next 3 buttons as above
		JPanel hardPanel = new JPanel();
		JButton hardButton = new JButton("Hard");
		hardButton.setFont(buttonFont);
		hardButton.addActionListener(this);
		hardPanel.add(hardButton);
		hardPanel.setBackground(Color.darkGray);
		buttonPanel.add(hardPanel);
		
		JPanel settingsPanel = new JPanel();
		JButton settingsButton = new JButton("Settings");
		settingsButton.setFont(buttonFont);
		settingsButton.addActionListener(this);
		settingsPanel.add(settingsButton);
		settingsPanel.setBackground(Color.darkGray);
		buttonPanel.add(settingsPanel);
		
		JPanel exitPanel = new JPanel();
		JButton exitButton = new JButton("Exit");
		exitButton.setFont(buttonFont);
		exitButton.addActionListener(this);
		exitPanel.add(exitButton);
		exitPanel.setBackground(Color.darkGray);
		buttonPanel.add(exitPanel);
		
		add(buttonPanel, BorderLayout.CENTER); // adds the "bigger" panel to the base Border Layout in the center1

	}
	public void actionPerformed(ActionEvent e) {
		
		this.dispose(); // this will get rid of the current window when a button is pressed but not shut down the program
		
		String getAction = e.getActionCommand();
		
		if(getAction.equals("Easy")){
			
			// creates a new "Easy" GridLayout
			GridLayoutPage nineGrid = new GridLayoutPage(9, 9, "Easy");
			nineGrid.setVisible(true);
		}
		else if(getAction.equals("Hard")){
			// creates a new "Hard" GridLayout
			GridLayoutPage settings = new GridLayoutPage(9, 9, "Hard");
			settings.setVisible(true);
		}
		else if(getAction.equals("Settings")){
			// creates a new Settings Page
			SettingsLayoutPage settings = new SettingsLayoutPage();
			settings.setVisible(true);
			
		}
		else if(getAction.equals("Exit")){
			// will exit program
			System.exit(0);
		}
		else
			System.out.println("Error");
	}

}
