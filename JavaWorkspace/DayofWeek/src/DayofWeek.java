import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;


public class DayofWeek {
	private JFrame frame;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run(){
				try{
					DayofWeek window= new DayofWeek();
					window.frame.setVisible(true);
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
	

}

public DayofWeek(){
	initialize();
}
private void initialize(){
	frame= new JFrame();
	frame.setBounds(100,100,380,221);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);
	frame.getContentPane().setBackground(Color.YELLOW);
	
	JTextArea Month= new JTextArea();
	Month.setBounds(26,36,75,46);
	frame.getContentPane().add(Month);
	
	JLabel lblMonth = new JLabel ("Month Number");
	lblMonth.setBounds(10,11,93,14);
	frame.getContentPane().add(lblMonth);
	
	JTextArea Date= new JTextArea("");
	Date.setBounds(111,36,75,46);
	frame.getContentPane().add(Date);

	JLabel lblDay= new JLabel("Date");
	lblDay.setBounds(108,11,46,14);
	frame.getContentPane().add(lblDay);
	
	JTextArea Year= new JTextArea();
	Year.setBounds(196,36,75,46);
	frame.getContentPane().add(Year);
	
	JLabel lblYear= new JLabel("Year");
	lblYear.setBounds(196,11,46,14);
	frame.getContentPane().add(lblYear);
	
	JTextArea Answer= new JTextArea();
	Answer.setBounds(49,129,281,46);
	frame.getContentPane().add(Answer);
	
	JLabel lblAnswer= new JLabel("Answer");
	lblAnswer.setBounds(49,104,70,14);
	frame.getContentPane().add(lblAnswer);
	
	JButton btnNewButton = new JButton("Find");
	btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				int m = Integer.parseInt(Month.getText());
				int d = Integer.parseInt(Date.getText());
				int y = Integer.parseInt(Year.getText());
				
				int[] t= new int [12];
				t[0]=0;
				t[1]=3;
				t[2]=2;
				t[3]=5;
				t[4]=0;
				t[5]=3;
				t[6]=5;
				t[7]=1;
				t[8]=1;
				t[9]=6;
				t[10]=2;
				t[11]=4;
				
				String[] dow = {"Sunday", "Monday", "Tuesday",
						"Wednesday","Thursday","Friday","Saturday"} ;
				
				if(m<3) y-=1;
				int alg = ((y + y/4 - y/100 + y/400 + t[m-1] + d) % 7);
				
				Answer.setText(m+"/"+d+"/"+y+" is a " + dow[((y + y/4 - y/100 + y/400 + t[m-1] + d) % 7)]);
			}
	});
	btnNewButton.setBounds(281,47,73,23);
	frame.getContentPane().add(btnNewButton);
}
}



/*import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Calendar;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class DayofWeek //extends JFrame

implements ActionListener
{
public static void main (String[] args){
	{Scanner input = new Scanner (System.in);
	
	/*JFrame myFrame;
	JButton sundayButton;
	JButton mondayButton;
	JButton tuesdayButton;
	JButton wednesdayButton;
	JButton thursdayButton;
	JButton fridayButton;
	JButton saturdayButton;
		
	public static void main (String[] args)
	{
		DayofWeek demo = new DayofWeek();	
	}
	public DayofWeek()
	
	{
		myFrame = new JFrame();
		myFrame.setLayout(new FlowLayout ());
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//new objects created
		sundayButton = new JButton("sunday");	
		mondayButton = new JButton("monday");
		tuesdayButton = new JButton("tuesday");
		wednesdayButton = new JButton("wednesday");
		thursdayButton = new JButton("thursday");
		fridayButton = new JButton("friday");
		saturdayButton = new JButton("saturday");
		
		
		
		//register the TwoButtons object
		//as the listener for both buttons.
		sundayButton.addActionListener( this );
		mondayButton.addActionListener( this );
		tuesdayButton.addActionListener( this );
		wednesdayButton.addActionListener( this );
		thursdayButton.addActionListener( this );
		fridayButton.addActionListener( this );
		saturdayButton.addActionListener( this );
		
		
		
		myFrame.add(tuesdayButton);
		myFrame.add(mondayButton);
		myFrame.add(tuesdayButton);
		myFrame.add(wednesdayButton);
		myFrame.add(thursdayButton);
		myFrame.add(fridayButton);
		myFrame.add(saturdayButton);
		myFrame.setSize(550, 150);
		myFrame.setVisible(true);
	}
	public void actionPerformed (ActionEvent event)
	{
		Object control = event.getSource();
		
		//check which command has been sent
		if (control == sundayButton)
		{
			myFrame.getContentPane().setBackground(Color.red);
		}
			else if(control == sundayButton)
		{
				myFrame.getContentPane().setBackground(Color.orange);
		}
			else if(control == mondayButton)
		{
			myFrame.getContentPane().setBackground(Color.yellow);
			
		}
			else if (control == tuesdayButton)
		{
			myFrame.getContentPane().setBackground(Color.green);
		}
					
				else if(control == wednesdayButton)
			{
				myFrame.getContentPane().setBackground(Color.blue);
				
			}
				else if (control == thursdayButton)
			{
				myFrame.getContentPane().setBackground(Color.pink);
			
			}	
		
			else if(control == fridayButton)
		{
			myFrame.getContentPane().setBackground(Color.black);
			
		}
			else if (control == saturdayButton)
		{
			myFrame.getContentPane().setBackground(Color.white);
		}
			
			
			
			
				repaint();
		}*/
	
			
	

	
	/*int y;
	int m;
	int d;
	System.out.print("Enter Month number: ");
	m=input.nextInt();
	System.out.print("Enter Day number: ");
	d=input.nextInt();
	System.out.print("Enter week number: ");
	y=input.nextInt();
	int [] t = new int[12];
		t[0]=0;
		t[1]=3;
		t[2]=2;
		t[3]=5;
		t[4]=0;
		t[5]=3;
		t[6]=5;
		t[7]=1;
		t[8]=4;
		t[9]=6;
		t[10]=2;
		t[11]=4;
		
	String[] dow = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	
	System.out.println(dow[0]);
}
}
}*/



 