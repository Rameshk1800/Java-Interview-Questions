package javaPrograms;

import java.util.Arrays;
import java.util.List;

public class FindingSmallestNumber {

	Integer givenArray[]= {2,1,3,5,4,7,6};
	
	public void usingArray() {

		

		Arrays.sort(givenArray);
		System.out.println(givenArray[0]);

	}


	public void usingCharArray() {
		
		int smallest= Integer.MAX_VALUE;
		
		for(int i =0;i<givenArray.length;i++) {
			
			if(givenArray[i]<smallest) {
				
				smallest=givenArray[i];
			}
			
		}
		System.out.println(smallest);
	}
	
	public void usingCollections() {
		
		List <Integer> list=Arrays.asList(givenArray);
		
	int smallest =list.get(0);
	System.out.println(smallest);
		
	}

	public static void main(String[] args) {

		FindingSmallestNumber findingSmallestNumber= new FindingSmallestNumber();
		findingSmallestNumber.usingCharArray();
		findingSmallestNumber.usingArray();
		findingSmallestNumber.usingCollections();
	}

}
