
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class SettingsLayoutPage extends JFrame implements ActionListener{
	public static final int WIDTHSETTINGS = 500;
	public static final int HEIGHTSETTINGS = 500;

	public SettingsLayoutPage() {
		super();
		setSize(WIDTHSETTINGS, HEIGHTSETTINGS);
		setTitle("Team Uhhhh");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton CHANGELATTER = new JButton("Coming Soon! (Press to exit)");
		CHANGELATTER.addActionListener(this);
		add(CHANGELATTER);
	}
	public void actionPerformed(ActionEvent e) {
		
		this.dispose();
		
		String getAction = e.getActionCommand();
		
		if(getAction.equals("Easy")){
			
			GridLayoutPage nineGrid = new GridLayoutPage(9, 9, "Easy");
			nineGrid.setVisible(true);
		}
		else if(getAction.equals("Hard")){
			SettingsLayoutPage settings = new SettingsLayoutPage();
			settings.setVisible(true);
		}
		else if(getAction.equals("Settings")){
			SettingsLayoutPage settings = new SettingsLayoutPage();
			settings.setVisible(true);
			
		}
		else if(getAction.equals("Exit")){
			System.exit(0);
		}
		else if(getAction.equals("Coming Soon! (Press to exit)")){
			System.exit(0);
		}
		else
			System.out.println("Error");
	}
}
