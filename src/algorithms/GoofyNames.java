package algorithms;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GoofyNames 
{
	public static void main(String[] args) 
	{
		String goofyName = "";

		// 1. Ask the user to enter their name
		String name = JOptionPane.showInputDialog("Please input your name: ");
		// 2. Print upper case name to the console using .toUpperCase()
		//    Run your program to see that this works.
		System.out.println(name.toUpperCase());
		// 3. Loop through each character of the name (steps 4 - 6).
		//    HINT: Use .length() to determine the number of characters in the String.
			int a = name.length();
		
			//int b = name.length();
			// 4. Create a String variable to store the next character of the name
			//    using .substring(start, end)
			//    HINT: replace 'start' and 'end' to get String with character at i 
			//System.out.println(name.length());
			//name.substring(i, a);
			// 5. Use MODULO to set this variable to upper case for EVEN characters
			//    and lower case for ODD characters.
			
			for (int i=0; i<name.length();i++)
			{
				String check = name.substring(i,a);
				//System.out.println(name.charAt(i));
			
					if(name.charAt(i)%2 == 0)
					{
						System.out.println(check.toUpperCase());;
					}
					else
						System.out.println(check.toLowerCase());
					
					System.out.println(goofyName.concat(check));
				
			
			// 6. ADD this String  (containing 1 char) to the goofyName String
			}
		
		// 7. Use pop-up to show user their Goofy name
				//JOptionPane.showInternalMessageDialog(null, c);
	}


		
	
}

