package extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot Koa = new Robot();
		//2. Set the speed to 100
Koa.setSpeed(100);
		int colorChoice=JOptionPane.showOptionDialog(null, "What color would you like?", "title", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Red","Blue", "Yellow"}, 0);
		
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		
		//4. Ask the use how many polygons they want to be drawn.
		String polygons = JOptionPane.showInputDialog("How man polygons do you want drawn?");
		int polygon = Integer.parseInt(polygons);
		//5. Use the robot to draw the number of polygons the user requested.
		for(int i = polygon; i>0; i--)
		{
			if(colorChoice == 0)
				Koa.setPenColor(Color.RED);
			else if(colorChoice == 1)
				Koa.setPenColor(Color.cyan);
			if(colorChoice == 2)
				Koa.setPenColor(Color.YELLOW);

		for(int x = 1; x<7; x++)
		{
		Koa.penDown();
		Koa.move(100);
		Koa.turn(60);
		}
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
		}
	}
	}

