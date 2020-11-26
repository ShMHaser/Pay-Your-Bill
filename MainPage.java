import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainPage extends JFrame implements ActionListener{
	
	private String userInfo;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	
	public MainPage(String passtofile) {
		
		super("Bill information");
		
		userInfo=passtofile;
		
		setLayout(new GridLayout(8, 1));
		
		JLabel space1 = new JLabel("");
		add(space1);

		 button1 = new JButton("Account");
		add(button1);
		button1.addActionListener(this);
		
		 button2 = new JButton("Balance");
		add(button2);
		button2.addActionListener(this);
		
		 button3 = new JButton("About");
		add(button3);
		button3.addActionListener(this);
		
		 button4 = new JButton("Support");
		add(button4);
		button4.addActionListener(this);
		
		JLabel space2 = new JLabel("");
		add(space2);
		
		 button5 = new JButton("Log Out");
			add(button5);
			button5.addActionListener(this);
			
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==button1) {
			this.setVisible(false);
			Account J = new Account(userInfo);
			
			J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			J.setSize(700, 225);
			J.setVisible(true);
		}
		
		if(e.getSource()==button2) {
			this.setVisible(false);
			Balance J = new Balance(userInfo);
			
			J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			J.setSize(700, 225);
			J.setVisible(true);
		}
		
		if(e.getSource()==button3) {
			this.setVisible(false);
			About J = new About(userInfo);
			
			J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			J.setSize(700, 225);
			J.setVisible(true);
		}
		
		if(e.getSource()==button4) {
			this.setVisible(false);
			Support J = new Support(userInfo);
			
			J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			J.setSize(700, 225);
			J.setVisible(true);
		}
		
		if(e.getSource()==button5) {
			this.setVisible(false);
			homepage J = new homepage(false);

			J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			J.setSize(700, 225);
			J.setVisible(true);
		}
		
	}
	
}