package algorithms;

import javax.swing.JOptionPane;

public class Fibonacci 
{
	public static void main(String[] args) 
	{
		
		int a = 0;
		int b = 1;
		
		System.out.println(a);
		System.out.println(b);
		for(int x=0; x<11; x++)
		{
			
		int c = a + b;
		System.out.println(c);
		a = b;
		b = c;
		
		}
		
	}
	
}


