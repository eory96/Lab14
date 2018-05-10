package edu.handong.csee.java.exceptionhandle.example.prob3;//package name
import java.util.*;//use another class

public class PowerMain {//this is main class
	
	public static void main(String[] args) {//this is main method
		PowerCalculator calculator = new PowerCalculator();//instantiation PowerCalculator to calculator
		Scanner keyboard = new Scanner(System.in);//use keyboard for input date
		 while (keyboard.hasNextInt()) {//loop keyboard have to input
	            int n = keyboard.nextInt();//input data to n
	            int p = keyboard.nextInt();//input data to p
	            
	            try {//first implement this block
	                System.out.println(calculator.power(n, p));//result of implement power method
	            } catch (Exception e) {//catch Exception with new string e
	                System.out.println(e);//printout value of e
	            }
	        }

	}

}
