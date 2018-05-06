package edu.handong.csee.java.exeptionhadle.example.prob4;

public class Boundary {
	private int [] arr = new int[5];
	private int cnt = 0;
	public void receive(int num) throws ArrayIndexOutOfBoundsException{
		int i = cnt;
		arr[i] = num;
		System.out.printf("arr[%d] <- %d\n",i,num);
		cnt++;
	}
}
