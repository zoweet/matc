import java.awt. *;
import java.awt.event.*;
import java.util.Calendar;

import javax.swing. *;

public class TwoButtons extends JFrame
						implements ActionListener
{
	JFrame myFrame;
	JButton redButton;
	JButton greenButton;
	JButton blueButton;
	JButton yellowButton;
	JButton timeButton;
	
	public static void main (String [] args)
	{
		TwoButtons demo = new TwoButtons();
	}
	
	//constructor
	public TwoButtons()
	{
		myFrame = new JFrame();
		myFrame.setLayout(new FlowLayout ());
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//new objects created
		redButton = new JButton("red");
		greenButton = new JButton("green");
		blueButton = new JButton("blue");
		yellowButton = new JButton("yellow");
		timeButton= new JButton("time");
		
		
		//register the TwoButtons object
		//as the listener for both buttons.
		redButton.addActionListener( this );
		greenButton.addActionListener( this );
		blueButton.addActionListener( this );
		yellowButton.addActionListener( this );
		timeButton.addActionListener( this );
		
		
		myFrame.add(redButton);
		myFrame.add(greenButton);
		myFrame.add(blueButton);
		myFrame.add(yellowButton);
		myFrame.add(timeButton);
		myFrame.setSize(550, 150);
		myFrame.setVisible(true);
	
	}
	public void actionPerformed (ActionEvent event)
	{
		Object control = event.getSource();
		
		//check which command has been sent
		if (control == redButton)
		{
			myFrame.getContentPane().setBackground(Color.red);
		}
			else if(control == greenButton)
		{
				myFrame.getContentPane().setBackground(Color.green);
		}
			else if(control == blueButton)
		{
			myFrame.getContentPane().setBackground(Color.blue);
			
		}
			else if (control == yellowButton)
		{
			myFrame.getContentPane().setBackground(Color.yellow);
		
		}	
		
		else if (control == timeButton);
		{
			JOptionPane.showMessageDialog(null, Calendar.getInstance().getTime());
		}
				repaint();
		}
	}
			
		
	
