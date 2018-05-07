package edu.handong.csee.java.exceptionhandle.example.prob1;//package name is prob1
import java.util.Scanner;//use for keyboard input
import java.util.Random;//use for random number

public class SpeedLimMain {//this is main class

	public static void main(String[] args) {//this is main method
		Scanner keyboard = new Scanner(System.in);//using keyboard for input data
		Random rand = new Random();//instantiation Random class
		int limit = 0, speed = 0;//declare variable for save limit speed, current speed
		
		System.out.println("Set the speed limit, officer:");//print out "Set the speed limit, officer:"
		limit = keyboard.nextInt();//input data to limit
		speed = rand.nextInt(101);//input data to speed
		
		SpeedLimiter limitation = new SpeedLimiter(limit,speed);//instantiation SpeedLimiter class to limitation
		limitation.warnSpeedLimit();//call a method in limitation
	}
}
