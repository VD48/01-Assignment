package com.lp.sumOfelement;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SumOfUniqueElement {

	public static void main(String[] args) {
	
	int [] inputArray= {1, 2, 5, 5,5, 6, 6, 7,3, 2};
	int []temp=new int[inputArray.length];
	int j=0;
	
	  
	for(int i=0;i<inputArray.length-1;i++) {
		if(inputArray[i]!=inputArray[i+1]) {
			temp[j]=inputArray[i];
			//System.out.print(temp[j]+" ");
			j++;
			
		}
		
	}
	int sum=0;
	for(int a:temp) {
		 sum=sum+a;
		
	}
	System.out.println("sum of unique element is :: "+sum);
	
}

}
