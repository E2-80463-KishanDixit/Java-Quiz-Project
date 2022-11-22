package my.quiz.project;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;                                 

public class QuizPannel extends JFrame implements ActionListener{
                                                       
	JLabel qno,qtn;
	ButtonGroup optn;                            
	JButton b5,b6;
	JRadioButton opt1,opt2,opt3,opt4;
	
	String q[][] = new String[10][5];
	String pa[][]= new String[10][1];
	String ca[][]= new String[10][2];
	
	public static int count =0;
	public static int myscore =0;
	
	QuizPannel(){
		setBounds(200,100,1200,700);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		ImageIcon ic1 = new ImageIcon(ClassLoader.getSystemResource("my/quiz/project/Sources/startQuiz2.jpg"));
		Image ic2 = ic1.getImage().getScaledInstance(1200,200,Image.SCALE_DEFAULT);
		ImageIcon ic3 = new ImageIcon(ic2);
		JLabel icn = new JLabel(ic3);
		icn.setBounds(0,0,1200,200);
		add(icn);
		
		qno = new JLabel("");
		qno.setFont(new Font("Tahona",Font.PLAIN,20));
		qno.setBounds(58,240,65,20);
		add(qno);
		
		qtn = new JLabel("");
		qtn.setFont(new Font("Tahona",Font.PLAIN,20));
		qtn.setBounds(75,240,1000,20);
		add(qtn);
		
	    opt1 = new JRadioButton("");
	    opt1.setBounds(58,280,700,30);
	    opt1.setFont(new Font("Tahona",Font.PLAIN,15));
	    opt1.setBackground(Color.WHITE);
	    add(opt1);
	    
	    opt2 = new JRadioButton("");
	    opt2.setBounds(58,320,700,30);
	    opt2.setFont(new Font("Tahona",Font.PLAIN,15));
	    opt2.setBackground(Color.WHITE);
	    add(opt2);
	    
	    opt3 = new JRadioButton("");
	    opt3.setBounds(58,360,700,30);
	    opt3.setFont(new Font("Tahona",Font.PLAIN,15));
	    opt3.setBackground(Color.WHITE);
	    add(opt3);
	    
	    opt4 = new JRadioButton("");
	    opt4.setBounds(58,400,700,30);
	    opt4.setFont(new Font("Tahona",Font.PLAIN,15));
	    opt4.setBackground(Color.WHITE);
	    add(opt4);
		
	   optn= new ButtonGroup();
	   optn.add(opt1);
	   optn.add(opt2);
	   optn.add(opt3);
	   optn.add(opt4);
	   
	    
	    b5 = new JButton("Next");
	    b5.setBounds(600,500,120,30);
	    b5.setFont(new Font("Mongolian Baiti",Font.BOLD,25));
	    b5.setForeground( Color.WHITE);
	    b5.setBackground(new Color(140,82,255));
	    b5.addActionListener(this);
	    add(b5);
	    
	    
	    b6 = new JButton("Submit");
	    b6.setBounds(900,500,120,30);
	    b6.setFont(new Font("Mongolian Baiti",Font.BOLD,25));
	    b6.setForeground( Color.WHITE);
	    b6.setBackground(new Color(140,82,255));
	    b6.addActionListener(this);
	    b6.setEnabled(false);            
	    add(b6);
		
	    setVisible(true);
	    

		
		q[0][0] = "which of the following option leads to the portability and security of java?";
		q[0][1] = "Bytecode is executed by the JVM";
		q[0][2] = "The applet makes the java code secure and protable";
		q[0][3] = "use of exception handling";
		q[0][4] = "Dynamic binding between objects";
		
		
		q[1][0] = "Which of the following is not a Java features?";
		q[1][1] = "Dynamic";
		q[1][2] = "Architecture Neutral";
		q[1][3] = "Use of pointers";
		q[1][4] = "Object-oriented";
		
	
		q[2][0] = "Which of the following is a valid declaration of a char?";
		q[2][1] =  "char ch = '\\utea'";            
		q[2][2] = "char ca = 'tea'";
		q[2][3] = "char cr = \\u0223";
		q[2][4] = "char cc = '\\itea'";
		
		
		q[3][0] = " What is the return type of the hashCode() method in the Object class?";
		q[3][1] = " Object";
		q[3][2] = "int";
		q[3][3] = "long";
		q[3][4] = " void";
		
		
		q[4][0] = "Which of the following is a valid long literal?";
		q[4][1] = "ABH8097";
		q[4][2] = "L990023";
		q[4][3] = "904423";
		q[4][4] = "0xnf029L";
				 
				 
		q[5][0] = "In which process, a local variable has the same name as one of the instance variables?";
		q[5][1] = "Serialization";
		q[5][2] = "Variable Shadowing";
		q[5][3] = "Abstraction";
		q[5][4] = " Multi-threading";
		
		
		q[6][0] = "Which of the following is true about the anonymous inner class?";
		q[6][1] = "It has only methods";
		q[6][2] = "Objects can't be created";
		q[6][3] = "It has a fixed class name";
		q[6][4] = "It has no class name";
		
		
				
		q[7][0] = "Which package contains the Random class?";
		q[7][1] = "java.util package";
		q[7][2] = "java.lang package";
		q[7][3] = "java.awt package";
		q[7][4] = "java.io package";
		
		q[8][0] = "What do you mean by nameless objects?";
		q[8][1] = "An object created by using the new keyword.";
		q[8][2] = "An object of a superclass created in the subclass.";
		q[8][3] = "An object without having any name but having a reference.";
		q[8][4] = " An object that has no reference.";
		
		
		q[9][0] = "An interface with no fields or methods is known as a ______.";
		q[9][1] = "Runnable Interface";
		q[9][2] = "Marker Interface";      
		q[9][3] = "Abstract Interface";
		q[9][4] = "CharSequence Interface";
	
		
		ca[0][1]="Bytecode is executed by the JVM";
		ca[1][1]="Use of pointers";
		ca[2][1]= "char ch = '\\utea'";                              
		ca[3][1]="int";
		ca[4][1]="0xnf029L";
		ca[5][1]="Variable Shadowing";
		ca[6][1]="It has no class name";
		ca[7][1]="java.util package";
		ca[8][1]=" An object that has no reference.";
		ca[9][1]="Marker Interface";
		start(0);
	
	}
	
	
	public void start(int count)
	{
		qno.setText(""+(count+1)+".");
		qtn.setText(q[count][0]);
		opt1.setLabel(q[count][1]);
		opt1.setActionCommand(q[count][1]);
		opt2.setLabel(q[count][2]);
		opt2.setActionCommand(q[count][2]);
		opt3.setLabel(q[count][3]);
		opt3.setActionCommand(q[count][3]);
		opt4.setLabel(q[count][4]);
		opt4.setActionCommand(q[count][4]);
		optn.clearSelection();
		
	}
	    public void actionPerformed(ActionEvent ae) {
	    	if(ae.getSource() == b5)
	    	{
	    		if(optn.getSelection() == null) {
	    			pa[count][0] ="";
 		           }else 
 		           {
 		        	   pa[count][0] = optn.getSelection().getActionCommand();
// 		        	  System.out.println(optn.getSelection().getActionCommand());    // *****to check only
// 		        	  System.out.println(pa[count][0]);
// 		        	 System.out.println(ca[count][1]);
 		          }
	    		count++;	
	    		
	    		start(count);
	    		
	    		if(count==9)
	    		{
	    		     b5.setEnabled(false);
	    		     b6.setEnabled(true);
	    		}
 		          
	    		
	    	}
	    	
	    	if(ae.getSource() == b6)
	    	{    
	    		
	    		if(optn.getSelection() == null) {
	    			pa[count][0] ="";
 		           }else 
 		           {
 		        	   pa[count][0] = optn.getSelection().getActionCommand();
// 		        	  System.out.println(optn.getSelection().getActionCommand());    // *****to check only
// 		        	  System.out.println(pa[count][0]);                              // *****to check only
// 		        	 System.out.println(ca[count][1]);                                // *****to check only
 		          }
	    		 for(int i=0;i<pa.length;i++) 
	    		      {
	    	    		   if(pa[i][0].equals(ca[i][1]))
	    	    		   {
	    	    			   myscore+=1;
//	    	    			   System.out.println("true");                          // *****to check only
//	    	    			  System.out.println(myscore);                             // *****to check only
	    			       }
	    	    		   else 
	    	    		   {
	    			        		  myscore+=0;
//	    			        		  System.out.println("false");                       // *****to check only
	    			        }
	    			  }
//	    		 System.out.println(myscore);     // *****to check only
	    		  
	    	        	this.setVisible(false); 
	    	        	new ScoreDisplay(myscore).setVisible(true);
	    	}
	  }
	    
	public static void main(String[] args) {
		new QuizPannel();
//		new ScoreDisplay(myscore).setVisible(true);
		
		
	}

		
}
