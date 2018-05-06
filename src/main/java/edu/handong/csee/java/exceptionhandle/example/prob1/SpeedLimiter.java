package edu.handong.csee.java.exceptionhandle.example.prob1;

public class SpeedLimiter {
	private int limit=0;
	private int speed=0;
	
	public SpeedLimiter(int limit, int speed) {
		this.limit = limit;
		this.speed = speed;
	}
	
	public void warnSpeedLimit() {
		try {
			if(speed>limit) {
				throw new Exception("Speed Limit" +limit+"km exceeded!");
			}
			System.out.println("You are a law abiding citizen!");
			System.out.println("Your current speed: "+speed);
		}
		catch (Exception e){
			System.out.println(e.getMessage());
			System.out.println("You are being fined");
			System.out.println("Your current speed:" + speed);
		}
	}
}
