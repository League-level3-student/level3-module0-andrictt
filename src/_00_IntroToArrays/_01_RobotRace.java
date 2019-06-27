package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		//2. create an array of 5 robots.
Robot[] robo = new Robot[9];
		//3. use a for loop to initialize the robots.
for(int i = 0; i < robo.length; i++) {
	robo[i] = new Robot();
	robo[i].setSpeed(100);
}
			//4. make each robot start at the bottom of the screen, side by side, facing up
for(int i = 0; i < robo.length; i++) {
	robo[i].moveTo(i*100+100,500);
}
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
boolean race = true;
int winner;
while(race) {
Random rand = new Random();
for(int i = 0; i < robo.length; i++) {
	robo[i].move(rand.nextInt(50));
	if(robo[i].getY() < 0) {
		race = false;
		robo[i].sparkle();
		break;
	}
}
}
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
//OK
		//7. declare that robot the winner and throw it a party!
//it sparkles...
		//8. try different races with different amounts of robots.
    	//OK
	}

	
}
