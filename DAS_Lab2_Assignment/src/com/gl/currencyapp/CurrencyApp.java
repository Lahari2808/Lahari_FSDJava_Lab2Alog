package com.gl.currencyapp;

import java.util.Arrays;
import java.util.Scanner;

public class CurrencyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Currency Denominations");
		int size = sc.nextInt();
		int[] currencyArr = new int[size];
		System.out.println("Enter the currency Denonmations value in random order");
		for(int i=0;i<currencyArr.length;i++) {
			currencyArr[i]=sc.nextInt();
		}
		System.out.println("Before Sorting currency : "+Arrays.toString(currencyArr));
		mergeSort(currencyArr,0,currencyArr.length-1);
		System.out.println("After Sorting currency : "+Arrays.toString(currencyArr));
		System.out.println("Enter the amount you want to pay : ");
		int amount = sc.nextInt();
		System.out.println();
		NoteCount nc = new NoteCount();
		nc.counting(currencyArr,amount);
		sc.close();
		}

private static void mergeSort(int[] arr, int low, int high) {
	// TODO Auto-generated method stub
	if(low<high) {
		int mid = (low+high)/2;
		mergeSort(arr,low,mid);
		mergeSort(arr,mid+1,high);
		merge(arr,low,mid,high);
	}
}
private static void merge(int[] arr, int low, int mid, int high) {
	int i, j, k;
	i = low;
	j = mid + 1;
	k = low;
	int[] tempArr = new int[high + 1];
	while (i <= mid & j <= high) {
		if (arr[i] > arr[j])
			tempArr[k++] = arr[i++];
		else
			tempArr[k++] = arr[j++];
	}
	for (; i <= mid; i++)
		tempArr[k++] = arr[i];
	for (; j <= high; j++)
		tempArr[k++] = arr[j];
	for (i = low; i <= high; i++)
		arr[i] = tempArr[i];
	
}

}