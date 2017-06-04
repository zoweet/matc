import java.awt. *;
import java.awt.event*;
import javax.swing. *;

public class twobuttons extends JFrame
						implements ActionListener
{
	JFrame myFrame;
	JButton redButton
	JButton greenButton
	
	public static void main (string [] args)
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
		
		//register the TwoButtons object
		//as the listener for both buttons.
		red.Button.addActionListener( this );
		greenButton.addActionListener( this );
		
		myFrame.add(redButton);
		myFrame.add(greenButton);
		
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
			else
			{
				myFrame.getContentPane().setBackground(Color.green);
				
				repaint();
			}
		}
	}
}