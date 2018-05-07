package edu.handong.csee.java.exceptionhandle.example.prob1;//package name is prob1
import java.util.Scanner;//use for keyboard input
import java.util.Random;//use for random number

public class SpeedLimMain {//this is main class

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		int limit = 0, speed = 0;
		
		System.out.println("Set the speed limit, officer:");
		limit = keyboard.nextInt();
		speed = rand.nextInt(101);
		
		SpeedLimiter limitation = new SpeedLimiter(limit,speed);
		limitation.warnSpeedLimit();
	}
}
