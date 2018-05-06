package edu.handong.csee.java.exeptionhandle.example.prob5;

public class MyException extends Exception{
	private String message = null;
	
	public MyException(String mse) {
		super(mse);
		this.message = mse;
	}
	
	public String toString() {
		return message;
	}
}
