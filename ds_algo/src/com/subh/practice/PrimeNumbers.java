package com.subh.practice;

public class PrimeNumbers {
	public static void main(String[] args) {
      
	  int num=1;
      
	  boolean result =isPrime(num);
	  if(result==false)
		  System.out.println(num + " is not prime Number ");
	  else
		  System.out.println(num + " is  prime Number ");
	  
	
	}
	private static boolean isPrime(int num){
		
		if(num<=1)
			return false;

		for(int i=2;i<num;i++){
		   if(num%i==0)
			   return false;
		   
	 
		   }
		return true;
	}
}

