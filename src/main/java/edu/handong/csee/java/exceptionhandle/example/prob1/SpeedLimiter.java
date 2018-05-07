package edu.handong.csee.java.exceptionhandle.example.prob1;//this is package name

public class SpeedLimiter {//this class for exception
	private int limit=0;//it will receive limit speed 
	private int speed=0;//it will receive current speed
	
	public SpeedLimiter(int limit, int speed) {//constructor of this class
		this.limit = limit;//this class limit variable save main class limit value
		this.speed = speed;//this class speed variable save main class limit speed
	}
	
	public void warnSpeedLimit() {//this method for exception
		try {//first run this block and if throw is run this block stop
			if(speed>limit) {//if speed is higher than limit
				throw new Exception("Speed Limit" +limit+"km exceeded!");//throw to catch block with new exception string "Speed Limit" +limit+"km exceeded!"
			}
			System.out.println("You are a law abiding citizen!");//if speed is less than limit printout "You are a law abiding citizen!"
			System.out.println("Your current speed: "+speed);//if speed is less than limit printout "Your current speed: "+speed
		}
		catch (Exception e){//catch a string "Speed Limit" +limit+"km exceeded!"
			System.out.println(e.getMessage());//printout "Speed Limit" +limit+"km exceeded!"
			System.out.println("You are being fined");//printout "You are being fined"
			System.out.println("Your current speed:" + speed);//printout "Your current speed:" + speed
		}
	}
}
