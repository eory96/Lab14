package edu.handong.csee.java.exceptionhandle.example.prob2;//package name

import java.util.*;//use for other exeption

public class InException {//class for exception
	private int x=0,y=0;//declare variable

	public void exeption() {//exception method
		try {//first implement 
			Scanner keyboard = new Scanner(System.in);//receive data from keyboard
			System.out.print("x : ");//printout "x : "
			x=keyboard.nextInt();//save data to x variable
			System.out.print("y : ");//printout "y : "
			y=keyboard.nextInt();//save data to y variable
			System.out.println(this.x/this.y);//printout x/y result
		}
		catch(InputMismatchException e) {//catch a InputMisatchException class type error
			System.out.println("java.util.InputMismatchException");//printout "java.util.InputMismatchException"
		}
		catch(ArithmeticException e) {//catch a ArithmeticException class type error
			System.out.println("java.lang.ArithmeticException: "+e.getMessage());//printout "java.lang.ArithmeticException: "+e.getMessage()
		}
		catch(Exception e) {//catch a Exception class type error
			System.out.println("Some other exception has occurred: "+e.getMessage());//printout "Some other exception has occurred: "+e.getMessage()
		}
	}

}
