package edu.handong.csee.java.exeptionhandle.example.prob2;

import java.util.*;

public class InException {
	private int x=0,y=0;

	public void exeption() {
		try {
			Scanner keyboard = new Scanner(System.in);
			System.out.print("x : ");
			x=keyboard.nextInt();
			System.out.print("y : ");
			y=keyboard.nextInt();
			System.out.println(this.x/this.y);
		}
		catch(InputMismatchException e) {
			System.out.println("java.util.InputMismatchException");
		}
		catch(ArithmeticException e) {
			System.out.println("java.lang.ArithmeticException: "+e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Some other exception has occurred: "+e.getMessage());
		}
	}

}
