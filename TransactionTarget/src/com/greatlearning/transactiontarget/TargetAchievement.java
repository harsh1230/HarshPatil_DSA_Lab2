package com.greatlearning.transactiontarget;

import java.util.Scanner;

public class TargetAchievement {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array: ");
		int sizeOfArray = sc.nextInt();
		
		int[] transactionArray = new int[sizeOfArray];
		System.out.println("Enter the values of the array: ");
		
		for (int i = 0; i < sizeOfArray; i++) {
			
			transactionArray[i] = sc.nextInt();
		}
		
		System.out.println("Enter the total number of targets to be achieved: ");
		
		int totalTargets = sc.nextInt();
		int count = 0;
		while (totalTargets != 0) {
			
			boolean isAchieved = false;
			++count;
			long target = 0;
			System.out.println("Enter the " + count + " value of target.");
			target = sc.nextInt();
			
			long sum = 0;
			for (int i = 0; i < sizeOfArray; i++) {
				
				sum = sum + transactionArray[i];
				
				if (sum >= target) {
					
					System.out.println("The target is achieved after " + (i + 1) + " transactions.");
					isAchieved = true;
					break;
				}
				
			}
			
			if (!isAchieved) {
				
				System.out.println("Given target is not achieved.");
			}
			
			--totalTargets;
		}
		
   }
}