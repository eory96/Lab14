package edu.handong.csee.java.exeptionhandle.example.prob5;//package name

import java.util.Scanner;//use for keyboard

public class MyMain {//this is main class

	public static void main(String[] args) {//this is main method
		Scanner keyboard = new Scanner(System.in);//using for keyboard
		String str = null;//declare str that type is stirng
		try {//first implement this block
			str = keyboard.nextLine();//input data to str
			MyMain.myTest(str);//sent str value to myTest method of MyMain class 
		}
		catch(MyException a){//catch MyExceoption class type 
			System.out.println("Inside catch block : "+a);//print out "Inside catch block : "+a
		}
	}
	
	static void myTest(String b) throws MyException{//this is static method and parameter type is strng, throw to MyException that process error message
		if(b.equals("null")) {//if value of b is "null"
			throw new MyException("String val is null");//printout "String val is null"
		}
		else//if value of b is not "null"
			System.out.println("String val is " + b);//printout "String val is " + b
	}

}
