package algorithms;

import javax.swing.JOptionPane;

public class PrimeOrNot 
{
	public static void main(String[] args) 
	{
	
		String num = JOptionPane.showInputDialog("Input a number: ");
	
		int num1 = Integer.parseInt(num);
		
	
		if (num1%2==0 && num1 != 2)
		{
			JOptionPane.showMessageDialog(null, num1 + " is not a prime number");
		}
			
	
		else if(num1%3 == 0 && num1 != 3)
		{
			JOptionPane.showMessageDialog(null, num1 + " is not a prime number");
		}
	
		else if(num1%5 == 0 && num1 != 5)
		{
			JOptionPane.showMessageDialog(null, num1 + " is not a prime number");
		}
	
		
		else
		{
			JOptionPane.showMessageDialog(null, num1 + " is a prime number");
		}
	}
}
