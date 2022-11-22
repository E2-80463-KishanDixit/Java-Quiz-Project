package my.quiz.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UserWelcome extends JFrame implements ActionListener{
	
	int score=QuizPannel.myscore;        
	String name;
	JButton b3,b4;
	
	UserWelcome(String name){
		setBounds(200,50,1200,600);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel txt6 = new JLabel("Your Welcome "+name+" in MyQuiz");
	    txt6.setBounds(100,100,1200,100);
	    txt6.setFont(new Font("Jokerman",Font.BOLD,50));
	    txt6.setForeground(new Color(128,0,128));
	    add(txt6);
		
		
		
		 JLabel txt7 = new JLabel(" Your High Score:"+score);
		    txt7.setBounds(500,300,300,50);
		    txt7.setFont(new Font("Mongolian Baiti",Font.BOLD,30));
		    txt7.setForeground(new Color(128,0,128));
		    add(txt7);
		
		    
		    b3 = new JButton("Back");
		    b3.setBounds(200,400,150,30);
		    b3.setFont(new Font("Mongolian Baiti",Font.BOLD,25));
		    b3.setForeground( Color.WHITE);
		    b3.setBackground(new Color(140,82,255));
		    b3.addActionListener(this);
		    add(b3);
		    
		    
		    b4 = new JButton("Start Quiz");
		    b4.setBounds(900,400,150,30);
		    b4.setFont(new Font("Mongolian Baiti",Font.BOLD,25));
		    b4.setForeground( Color.WHITE);
		    b4.setBackground(new Color(140,82,255));
		    b4.addActionListener(this);
		    add(b4);
		
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() ==b3) {
			this.setVisible(false);
			new UserData();
		}else if(ae.getSource()== b4) {
			this.setVisible(false);
			new QuizPannel();
		}
		
	}
	
	
	
	
	public static void main(String args[])
	{
		new UserWelcome("");
	}
	
	
	
}
