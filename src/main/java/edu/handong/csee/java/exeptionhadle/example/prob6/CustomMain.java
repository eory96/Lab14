package edu.handong.csee.java.exeptionhadle.example.prob6;
import java.util.Scanner;

public class CustomMain {

	public static void main(String[] args) {
		String name;
		String race;
		int age =0;
		Scanner keyboard = new Scanner(System.in);
		CustomID information = new CustomID();
		
		for(;;) {
			try {
				if(information.getState()==0) {
					System.out.print("Enter your name: ");
					name = keyboard.nextLine();
					information.nameSetting(name);
				}
				else if(information.getState()==1) {
					System.out.print("Enter your age: ");
					age = keyboard.nextInt();
					information.ageSetting(age);
				}
				else if(information.getState()==2) {
					System.out.print("Enter your race: ");
					race = keyboard.nextLine();
					information.raceSetting(race);
				}
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
