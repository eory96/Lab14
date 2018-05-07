package edu.handong.csee.java.exeptionhandle.example.prob3;//this is package name

public class PowerCalculator {//this is class to throws Exception to other sid
	
	 public long power(int n, int p) throws Exception//this method receive int n,p and return long type, Exception class will handling
	    {
	        long result = 0;//declare variable result

	        result = (long)Math.pow(n, p);//result squre n,p
	        if(n < 0 || p < 0){//if n is less 0 or p less 0
	            throw new Exception("n or p should not be negative.");//throw new error message "n or p should not be negative."
	        }
	        if(n == 0 && p == 0){//if n is 0 and p is 0
	            throw new Exception("n and p should not be zero.");//throw new error message "n and p should not be zero."
	        }
	        return result;//return result value
	    }

}
