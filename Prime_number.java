package com.testpress;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
		
        //to show prime number check
		int tocken=0;
		
		System.out.println("Enter your number which you want to cheack");
		Scanner sc=new Scanner(System.in);
		
		//input from user
		int n=sc.nextInt();
		
		//zero and one are not prime numbers so 
		if(n==0 || n==1) {
			System.out.println("not a prime number");
			
		}else {
			//to check prime number or not
			for(int i=2;i<n/2; i++) {
				if(n%i==0) {
					System.out.println("not a prime nimber");
					
					//change value because it`s not a prime number
					tocken=1;
					
					//break because we need to check only once for not a prime
					break;
				}
				
			}
			if(tocken==0) {
				System.out.println("It`s a Prime number");
			}
			
		}
	}

}
