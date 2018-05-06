package edu.handong.csee.java.exeptionhandle.example.prob3;
import java.util.*;

public class PowerMain {
	
	public static void main(String[] args) {
		PowerCalculator calculator = new PowerCalculator();
		Scanner keyboard = new Scanner(System.in);
		 while (keyboard.hasNextInt()) {
	            int n = keyboard.nextInt();
	            int p = keyboard.nextInt();
	            
	            try {
	                System.out.println(calculator.power(n, p));
	            } catch (Exception e) {
	                System.out.println(e);
	            }
	        }

	}

}
