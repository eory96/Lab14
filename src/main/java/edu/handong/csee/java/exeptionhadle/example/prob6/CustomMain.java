package edu.handong.csee.java.exeptionhadle.example.prob6;//package name
import java.util.Scanner;//using for keyboard

public class CustomMain {//this is main class

	public static void main(String[] args) {//this is main method
		String name=null;//declare name variable
		String race=null;//declare race variable
		int age =0;//declare age variable
		Scanner keyboard = new Scanner(System.in);//input data from keyboard
		CustomID information = new CustomID();//instantiation CustomID to information
		
		for(;;) {//infinite loop
			try {//first implement this block
				if(information.getState()==0) {//if information.getState() is 0 implement this block
					System.out.print("Enter your name: ");//printout "Enter your name: "
					name = keyboard.nextLine();//save data about name
					information.nameSetting(name);//send name value to nameSetting method
				}
				else if(information.getState()==1) {//if information.getState() is 1 implement this block
					System.out.print("Enter your age: ");//printout "Enter your age: "
					age = keyboard.nextInt();//save data about age
					information.ageSetting(age);//send age value to ageSetting method
				}
				else if(information.getState()==2) {//if information.getState() is 2 implement this block
					System.out.print("Enter your race: ");//printout "Enter your race: "
					race = keyboard.nextLine();//save data about race
					information.raceSetting(race);//send race value to raceSetting method
				}
			}
			catch(Exception e) {//catch Exception class type
				System.out.println(e.getMessage());//printout error message
			}
		}
	}

}
