package com.lp.test;

import java.util.Arrays;

public class ThirdLargestNumber {

	public static void main(String[] args) {
		int[] intArray ={ 52, 45, 32, 64, 12, 87 };
		int temp = 0;
		int size=intArray.length;
	
		for (int i = 0; i < intArray.length; i++) {
			for (int j = i + 1; j < intArray.length; j++) {
				if (intArray[i] > intArray[j]) { // swap elements if not in order
					temp = intArray[i];
					intArray[i] = intArray[j];
					intArray[j] = temp;
				}
			}
		}
		
		if(size<3) {
			System.out.println("Invalid Input, array size is less than 3 ");
		}else {
		
		int max=intArray[intArray.length-3];
		System.out.println(max);
		}
		

	}
}
