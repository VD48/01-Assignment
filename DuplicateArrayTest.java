package com.lp.Test;

public class DuplicateArrayTest {

	public static void main(String[] args) {
		int array[]= {1,2,5,5,5,6,6,7,2};
		
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i] ==array[j]) {
					System.out.println("duplicate Array is : : "+array[j]);
				}
				
				
			}
			
		}

	}

}
