package com.gl.currencyapp;

public class NoteCount {
	
	public void counting(int[] currencyArr, int amount) {
		int[] noteCount = new int[currencyArr.length];
		int sumOfNotes=0;
		for(int i=0;i<currencyArr.length;i++) {
			noteCount[i]=amount/currencyArr[i];
			amount = amount%currencyArr[i];
			sumOfNotes+=noteCount[i];
		}
		System.out.println("Your payment approach in order to give min no of notes will be");
		for(int i=0;i<noteCount.length;i++) {
			if(noteCount[i]!=0) {
				System.out.println(currencyArr[i]+" X "+noteCount[i]);
			}
		}
		System.out.println("Total Notes : "+sumOfNotes);
	}
	
}