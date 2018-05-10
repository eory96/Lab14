package edu.handong.csee.java.exceptionhandle.example.prob5;//package name

public class MyException extends Exception{//this class is son class of Exception class
	private String message = null;//declare message variable
	
	public MyException(String mse) {//this is constructor of this class
		super(mse);//send mse value to Exception class
		this.message = mse;//this message is mse
	}
	
	public String toString() {//this method return String type
		return message;//rteurn message value
	}
}
