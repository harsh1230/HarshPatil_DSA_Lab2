package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.currencydenomination.CurrencyDenomination;
import com.greatlearning.currencydenomination.MergeSort;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MergeSort mergeSort = new MergeSort();
		CurrencyDenomination currencyDenomination = new CurrencyDenomination();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations: ");
		int denominationSize = sc.nextInt();
		
		System.out.println("Enter the currency denominations value: ");
		
		int[] notes = new int[denominationSize];
		for (int i = 0; i < denominationSize; i++) {
			
			notes[i] = sc.nextInt();
		}
		
		System.out.println("Enter the amount you want to pay: ");
		int amount = sc.nextInt();
		mergeSort.sort(notes, 0, notes.length - 1);
		currencyDenomination.countImplementation(notes, amount);
		
	}

}
