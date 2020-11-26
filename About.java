import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class About extends JFrame implements ActionListener{
	
	private JButton back;
	public String userinfo;
	
	public About(String userinfo) {
		
		super("Pay Your Bill");
		
		setLayout(new GridLayout(4, 1));
		
		JLabel space = new JLabel ("");
		add(space);
			
		JLabel about = new JLabel ("This program is about recharging youyr bills. It's an easy way to access your own account. Have a great time!");
		add(about);
		
		JLabel space2 = new JLabel ("");
		add(space2);
		
		back = new JButton("BACK");
		add(back);
		back.addActionListener(this);
		
	}
		
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==back) {
			this.setVisible(false);
			MainPage J = new MainPage(userinfo);
			
			J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			J.setSize(500, 250);
			J.setVisible(true);
		}
		
	}

}
