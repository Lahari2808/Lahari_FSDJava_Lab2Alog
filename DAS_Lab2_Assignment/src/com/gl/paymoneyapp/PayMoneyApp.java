package com.gl.paymoneyapp;

import java.util.Arrays;
import java.util.Scanner;

public class PayMoneyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nummber of Transactions/Days");
		int size = sc.nextInt();
		int[] transactionArray = new int[size];
		System.out.println("Enter the values of array");
		for (int i = 0; i < transactionArray.length; i++) {
		transactionArray[i] = sc.nextInt();
		}
		System.out.println("Given Transaction array : " + Arrays.toString(transactionArray));
		System.out.println("Enter the total no of targets that needs to be achieved");
		int numberOfTarget = sc.nextInt();
		for (int i = 0; i < numberOfTarget; i++) {
			System.out.println("Enter the " + (i + 1) + " target amount : ");
			int targetAmount = sc.nextInt();
			int sum = 0;
			int flag = 0;
			for (int j = 0; j < transactionArray.length; j++) {
				sum += transactionArray[j];
				if (sum >= targetAmount) {
					flag = 1;
					System.out.println("Target achieved after " + (j + 1) + " transactions");
					System.out.println();
					break;
				}
			}
			if (flag == 0)
				System.out.println("Given target is not achieved");

		}
		sc.close();
	}

}


