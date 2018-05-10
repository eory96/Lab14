package edu.handong.csee.java.exeptionhandle.example.prob4;//package name
import java.util.Scanner;//use for keyboard

public class BoundaryMain {//this is main class

	public static void main(String[] args) {//this is main method
		Scanner keyboard = new Scanner(System.in);//receive data from keyboard
		Boundary arr = new Boundary();//instantiation Boundary class to arr
		int num =0;//declare num
		for(int i=0;;i++) {//fill out array element
			try{//first implement this block
				System.out.print("Enter an integer : ");//printout "Enter an integer : "
				num=keyboard.nextInt();//receive data from keyboard
				arr.receive(num);//send a num value to receive method 
			}
			catch(ArrayIndexOutOfBoundsException e) {//catch ArrayIndexOutOfBoundsException class type e
				System.out.println("Invalid array index access!");//printout "Invalid array index access!"
				break;//escaping loop
			}
		}
	}

}
