package edu.handong.csee.java.exeptionhandle.example.prob3;

public class PowerCalculator {
	
	 public long power(int n, int p) throws Exception
	    {
	        long result = 0;

	        result = (long)Math.pow(n, p);
	        if(n < 0 || p < 0)
	        {
	            throw new Exception("n or p should not be negative.");
	        }
	        if(n == 0 && p == 0)
	        {
	            throw new Exception("n and p should not be zero.");
	        }
	        return result;
	    }

}
