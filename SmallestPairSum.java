package com.lp.test;

import java.util.Arrays;

public class SmallestPairSum {

	public static void main(String[] args) {
		int intArray[]= {1,4,5,3,6,7};
		int temp=0;
		for (int i = 0; i < intArray.length; i++) {
			for (int j = i + 1; j < intArray.length; j++) {
				if (intArray[i] > intArray[j]) { 
					temp = intArray[i];
					intArray[i] = intArray[j];
					intArray[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(intArray));
		int sum=intArray[0]+intArray[1];
		System.out.println("the minimun sum pair is( "+intArray[0]+","+intArray[1]+" ) and sum = "+sum);
	}

}
