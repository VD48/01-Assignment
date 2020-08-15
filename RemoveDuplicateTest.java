package com.lp.removedupcate;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateTest {

	public static void main(String[] args) {

		Set<Integer> withoutDuplicate = new HashSet<>();
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int length = sc.nextInt();
		int[] inputArray = new int[length];

		System.out.println("Enter the elements of the array:");

		for (int i = 0; i < length; i++) {
			inputArray[i] = sc.nextInt();
		}
		for (int i = 0; i < inputArray.length; i++) {
			withoutDuplicate.add(inputArray[i]);
		}

		System.out.println("Without duplicate Array : " + withoutDuplicate);

		for (int a : withoutDuplicate) {
			System.out.println("duplicate element in array is :: " + a);
		}
		
	}

}
