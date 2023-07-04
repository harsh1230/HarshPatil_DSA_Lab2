package com.greatlearning.currencydenomination;

public class CurrencyDenomination {
	
	public void countImplementation(int[] notes, int amount) {
		
		int[] noteCounter = new int[notes.length];
		
		for (int i = 0; i < notes.length; i++) {
			
			if (amount > notes[i]) {
				
				noteCounter[i] = amount / notes[i];
				amount = amount - noteCounter[i] * notes[i];	
			}
		}
		
		if (amount > 0) {
			
			System.out.println("Exact amount cannot be given with the highest denomination.");	
		}
		
		else {
			
			for (int i = 0; i < notes.length; i++) {
				
				if (noteCounter[i] != 0) {
					
					System.out.println(notes[i] + " : " + noteCounter[i]);
				}
			}
		}
	}

}
