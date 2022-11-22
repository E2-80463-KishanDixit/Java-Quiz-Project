package my.quiz.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ScoreDisplay extends JFrame implements ActionListener {
     public static int myscore;
     JButton b7;
	ScoreDisplay(int myscore)
	{
		setBounds(200,50,1200,600);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		
		JLabel txt7 = new JLabel("Thank You For Playing MYQUIZ!");
	    txt7.setBounds(100,100,1200,100);
	    txt7.setFont(new Font("Jokerman",Font.BOLD,50));
	    txt7.setForeground(new Color(128,0,128));
	    add(txt7);
	    
	    JLabel txt8 = new JLabel("Your Score is:"+myscore+"/10");
	    txt8.setBounds(100,300,1200,100);
	    txt8.setFont(new Font("Jokerman",Font.BOLD,50));
	    txt8.setForeground(new Color(128,0,128));
	    add(txt8);
	    
	    b7 = new JButton("Play Again");
	    b7.setBounds(900,500,160,30);
	    b7.setFont(new Font("Mongolian Baiti",Font.BOLD,25));
	    b7.setForeground( Color.WHITE);
	    b7.setBackground(new Color(140,82,255));
	    b7.addActionListener(this);            
	    add(b7);
	   
	    
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == b7)
		{
			this.setVisible(false);
			new UserWelcome("");
		}
	}
	
	public static void main(String args[])
	{
		new ScoreDisplay(myscore).setVisible(true);
	}
	
}
