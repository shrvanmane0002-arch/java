package com.jbk;

public class Demo{
  
	public static void main(String[] args) {
		int num =50; 
		boolean isPrime = true;
		
		for(int i = 2; i <=num; i++);
		if(num % i == 0) {
			isPrime=false; 
			break;
		}
		
	
		if (isPrime) {
			System.out.println("num");
		}else {
			System.out.println(num);
		
		
	}	
		
	}
}
