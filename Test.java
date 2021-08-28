package removeDuplicateArray;

public class Test {
	
	public static void main(String[] args) {
		int [] inputArray= {1, 2, 5, 5,5, 6, 6, 7,3, 2};
		int []temp=new int[inputArray.length];
		int j=0;
		
		// other code added into the file so that we can if merge is working properly or not
		
		  System.out.print("unique element in array is : [");
		for(int i=0;i<inputArray.length-1;i++) {
			if(inputArray[i]!=inputArray[i+1]) {
				temp[j]=inputArray[i];
				System.out.print(temp[j]+" ");
				j++;
				
			}
			
		}
		System.out.print("]");
	}

}
