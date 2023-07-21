package com.testpress;

import java.util.Scanner;

public class Min_Max_in_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("how many Number of elements in this Array ?");
		int l=sc.nextInt();
		int arr[]=new int[l];
	     for(int i=0; i<l;i++) {
	    	 System.out.println("Enter the element "); 
	    	 int elem=sc.nextInt();
	    	 arr[i]=elem;
	     }
	     
	     
	     // for minimum element value
		     int min=0;
		     for(int j=0;j<l-1; j++) {
		    	 if(arr[j]<arr[j+1]) {
		    		 min=arr[j];
		    	 }else {
		    		 min=arr[j+1];
		    	 }
		}
		     
		     
		     // for maximum element value
		     int max=0;
		     for(int j=0;j<l-1; j++) {
		    	 if(arr[j]>arr[j+1]) {
		    		 max=arr[j];
		    	 }else {
		    		 max=arr[j+1];
		    	 }
		}
		     System.out.println(max+" "+min);
	}

	
}
