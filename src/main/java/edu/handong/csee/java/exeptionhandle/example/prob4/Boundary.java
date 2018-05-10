package edu.handong.csee.java.exeptionhandle.example.prob4;//package name

public class Boundary {//this is Boundary class for save array and throw to ArrayIndexOutOfBoundsException
	private int [] arr = new int[5];//declare new array
	private int cnt = 0;//declare cnt for count number
	public void receive(int num) throws ArrayIndexOutOfBoundsException{//this method is parameter type is int and throw to ArrayIndexOutOfBoundsException
		int i = cnt;//declare i
		arr[i] = num;//save array element 0 to 4
		System.out.printf("arr[%d] <- %d\n",i,num);//printout "arr[%d] <- %d\n",i,num
		cnt++;//increase 1 cnt
	}
}
