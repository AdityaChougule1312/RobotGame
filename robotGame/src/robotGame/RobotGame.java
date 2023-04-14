package robotGame;
import java.util.Scanner;
public class RobotGame {
	protected static String commandLine=" ";
	protected static  String commandLineToUpperCase="";
	protected static char[] commandLineCharacterArray;

	public static void main(String[] args) {
		RobotMovement robot= new RobotMovement();
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter command Line");
		commandLine=scanner.next();
		if(commandLine.matches("[RrLlFfBb]+")) 
		{
		commandLineToUpperCase= commandLine.toUpperCase();
		commandLineCharacterArray= commandLineToUpperCase.toCharArray();
		for(char commands: commandLineCharacterArray) {
			switch(commands) {
			case 'R':robot.turnRight();
			          break;
			case 'L':robot.turnLeft();
					  break;
			case 'F':robot.moveForward(); 
			          break;
			case 'B':robot.moveBackward();   
			          break;
			  }
		   }robot.axisAndDirection();
	    }else 
	    	{
		System.out.println("Wrong Command");
	    	}
	}
	}


