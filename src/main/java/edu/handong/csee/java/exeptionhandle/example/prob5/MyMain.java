package edu.handong.csee.java.exeptionhandle.example.prob5;

import java.util.Scanner;

public class MyMain {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String str = null;
		try {
			str = keyboard.nextLine();
			MyMain.myTest(str);
		}
		catch(MyException a){
			System.out.println("Inside catch block : "+a);
		}
	}
	
	static void myTest(String b) throws MyException{
		if(b.equals("null")) {
			throw new MyException("String val is null");
		}
		else
			System.out.println("String val is " + b);
	}

}
