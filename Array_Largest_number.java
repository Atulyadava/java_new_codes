package com.testpress;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Array_Largest_number {

	public static void main(String[] args) {
		String newSt="";
		Scanner sc=new Scanner(System.in);
		System.out.println("how many Number of elements in this Array ?");
		int l=sc.nextInt();
		
		if(l<1000) {
			int arr[]=new int[l];
		     for(int i=0; i<l;i++) {
		    	 System.out.println("Enter the element "); 
		    	 int elem=sc.nextInt();
		    	 if(elem<=1000000) {
		    	 arr[i]=elem;
		    	 }else {
		    		 System.out.println("Entered number is learger then 1000000");
		    	 }
		     }
		     
		     String largestValue = getLargestNumber(arr);
		        System.out.println("Largest value: " + largestValue);
		}else {
			System.out.println("Array length can not be more then 1000");
		}
     
	}
	private static String getLargestNumber(int[] nums) {
		
        // Convert the numbers to strings for custom sorting
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = Integer.toString(nums[i]);
        }
        
     // Custom comparator for sorting
        Comparator<String> customComparator = (s1, s2) -> {
            String firstOption = s1 + s2;
            String secondOption = s2 + s1;
            return secondOption.compareTo(firstOption); // Reverse order
        };

        // Sort the strings in custom order
        Arrays.sort(strNums, customComparator);

        // Check if the array contains all zeros
        if (strNums[0].equals("0")) {
            return "0"; // Special case handling for all zeros
        }

        // Combine the sorted strings to form the largest value
        StringBuilder result = new StringBuilder();
        for (String strNum : strNums) {
            result.append(strNum);
        }

        return result.toString();
    }
}
