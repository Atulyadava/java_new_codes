package com.testpress;

import java.util.Scanner;

public class reverceNumber {

	public static void main(String[] args) {

		
		
		int revers_num=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		while(n!=0) {
			int reminder=n%10;
			revers_num=revers_num*10 + reminder;
			n=n/10;
			
		}
		
		System.out.println(revers_num);
	}

}
