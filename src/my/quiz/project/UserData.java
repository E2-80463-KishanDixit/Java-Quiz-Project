package my.quiz.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UserData extends JFrame implements ActionListener{
	

	JButton b1,b2;
	static String name;             
	JTextField tf2;
	
	UserData(){
		setBounds(200,50,1000,600);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		
		ImageIcon ic1 = new ImageIcon(ClassLoader.getSystemResource("my/quiz/project/Sources/WELCOME TO MYQUIZ PROJECT.jpg"));
		Image ic2 = ic1.getImage().getScaledInstance(500,600,Image.SCALE_DEFAULT);
		ImageIcon ic3 = new ImageIcon(ic2);
		JLabel icn = new JLabel(ic3);
		icn.setBounds(0,0,500,600);
		add(icn);
		
		
	    JLabel txt1 = new JLabel("Enter Your Detail");
	    txt1.setBounds(600,0,250,50);
	    txt1.setFont(new Font("Mongolian Baiti",Font.BOLD,30));
	    txt1.setForeground(new Color(128,0,128));
	    add(txt1);
	    
	    
	    JLabel txt2 = new JLabel(" Name:");
	    txt2.setBounds(500,70,100,50);
	    txt2.setFont(new Font("Mongolian Baiti",Font.BOLD,30));
	    txt2.setForeground(new Color(128,0,128));
	    add(txt2);
		
	     tf2 = new JTextField();
	    tf2.setFont(new Font("Times New Roman",Font.BOLD,20));
	    tf2.setBounds(600,80,250,30);
	    add(tf2);
	    
	    JLabel txt3 = new JLabel(" Age:");
	    txt3.setBounds(500,130,100,50);
	    txt3.setFont(new Font("Mongolian Baiti",Font.BOLD,30));
	    txt3.setForeground(new Color(128,0,128));
	    add(txt3);
		
	    JTextField tf3 = new JTextField();
	    tf3.setFont(new Font("Times New Roman",Font.BOLD,20));
	    tf3.setBounds(600,140,250,30);
	    add(tf3);
	    
	    
	    JLabel txt4 = new JLabel(" Phone:");
	    txt4.setBounds(500,190,150,50);
	    txt4.setFont(new Font("Mongolian Baiti",Font.BOLD,30));
	    txt4.setForeground(new Color(128,0,128));
	    add(txt4);
		
	    JTextField tf4 = new JTextField();
	    tf4.setFont(new Font("Times New Roman",Font.BOLD,20));
	    tf4.setBounds(600,200,250,30);
	    add(tf4);
	    
	   
	    
	    b1 = new JButton("Exit");
	    b1.setBounds(530,400,120,30);
	    b1.setFont(new Font("Mongolian Baiti",Font.BOLD,30));
	    b1.setForeground( Color.WHITE);
	    b1.setBackground(new Color(140,82,255));
	    b1.addActionListener(this);
	    add(b1);
	    
	    
	    b2 = new JButton("Next");
	    b2.setBounds(800,400,120,30);
	    b2.setFont(new Font("Mongolian Baiti",Font.BOLD,30));
	    b2.setForeground( Color.WHITE);
	    b2.setBackground(new Color(140,82,255));
	    b2.addActionListener(this);
	    add(b2);
	    
		
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == b1) {
			System.exit(0);
			
			
		}else if(ae.getSource() == b2){
			
			name = tf2.getText();
			this.setVisible(false);
			new UserWelcome(name);
			
		}
		
		
		
		
		
	}

	public static void main(String[] args) {
		new UserData();
		

	}

}
