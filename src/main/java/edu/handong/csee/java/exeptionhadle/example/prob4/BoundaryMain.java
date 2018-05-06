package edu.handong.csee.java.exeptionhadle.example.prob4;
import java.util.Scanner;

public class BoundaryMain {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Boundary arr = new Boundary();
		int num =0;
		for(int i=0;;i++) {
			try{
				System.out.print("Enter an integer : ");
				num=keyboard.nextInt();
				arr.receive(num);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid array index access!");
				break;
			}
		}
	}

}
