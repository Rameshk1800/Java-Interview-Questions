package javaPrograms;

public class ReverseANumber {

	
	
	//formula
	/*
	 * reversedNumber=reversedNumber*10;
	 * reversedNumber=reversedNumber+givenNumber%10; givenNumber=givenNumber/10;
	 */
	
	
	
	public static void main(String[] args) {
		
		int givenNumber=1234;
		int reversedNumber=0;
		
		while(givenNumber!=0) {
			
			reversedNumber=reversedNumber*10;
			reversedNumber=reversedNumber+givenNumber%10;
			givenNumber=givenNumber/10;
			
		}
System.out.println(reversedNumber);
	}

}
