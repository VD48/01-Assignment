package com.lp.test;

import java.util.Arrays;

public class MinMaxTest {

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
		int maximum=intArray[size-1];
		int minimum=intArray[0];
		int secondMin=intArray[1];
		int secondMax=intArray[size-2];
		System.out.println("min element : "+minimum);
		System.out.println("max element : "+maximum);
		System.out.println("2nd min : "+secondMin);
		System.out.println("2nd max : "+secondMax);
		

	}

}
