package com.testpress;

import java.util.Scanner;

class Reverce{
	
}
public class reverce_print_string {

	public static void main(String[] args) {
        
		char c;
		
		//Empty string because i want to store my string reveres char
		String newStr="";
		
		System.out.println("Enter your String which you want to reverce");
		Scanner sc =new Scanner(System.in);
		
		//take a String input from user
		String s=sc.next();
		
		for(int i=0; i<s.length();i++) {
			//charAt() method give you that element which is on i index
			c=s.charAt(i);
			
			
			newStr = c + newStr;
		}
		System.out.println("new rversed String you have : "+newStr);
	}

}
