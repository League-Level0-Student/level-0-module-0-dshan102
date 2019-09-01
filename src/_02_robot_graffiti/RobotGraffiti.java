package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	Robot jim = new Robot();
	jim.penDown();
	jim.setSpeed(100);
	jim.move(200);
	jim.turn(130);
	jim.move(100);
	jim.turn(50);
	jim.move(50);
	jim.turn(50);
	jim.move(100);
}
}
