package robotGame;

public class RobotMovement {
	protected static int xAxis=0;
	protected static int yAxis=0;
  //  Direction Direction= new Direction();
	
	protected  void turnRight() {
		switch(RobotDirection.robotDirection) {
		case "north":RobotDirection.robotDirection= RobotDirection.east() ;
					break;
		case "east" : RobotDirection.robotDirection= RobotDirection.south();
					break;
		case "west" : RobotDirection.robotDirection= RobotDirection.north();
					break;
		case "south":RobotDirection.robotDirection=  RobotDirection.west(); 
					break;
		}
	}
	protected  void turnLeft() {
		switch(RobotDirection.robotDirection) {
		case "north":
					RobotDirection.robotDirection= RobotDirection.west();
					break;
		case "east": RobotDirection.robotDirection= RobotDirection.north();
					break;
		case "west": RobotDirection.robotDirection= RobotDirection.south();
					break;
		case "south":RobotDirection.robotDirection=  RobotDirection.east(); 
					break;
		}
	}
	protected  void moveForward() {
		switch(RobotDirection.robotDirection) {
		case "north": yAxis++;
					  break;
		case "east" : xAxis++;
					  break;
		case "west" : xAxis--;
					  break;
		case "south": yAxis--;
				      break;
		}
	}
	public  void moveBackward() {
		switch(RobotDirection.robotDirection) {
		case "north": yAxis--;
					 break;
		case "east" : xAxis--;
					 break;
		case "west" : xAxis++;
					 break;
		case "south": yAxis++; 
					 break;
		}
	}

	public  void axisAndDirection() {
		System.out.println("x:"+ xAxis+ "y:"+ yAxis+ " direction: "+ RobotDirection.robotDirection);
		}
}
