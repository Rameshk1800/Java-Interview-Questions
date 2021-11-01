package javaPrograms;


public class FindAStringLength {
	
	public void method1() {
		String given="Ramesh";
		
		System.out.println(given.length());
		
	}
	
	public void method2() {
		String given ="Rameshk`";
		
		char[] charArray  = given.toCharArray();
		int length=0;
		
		for(char c:charArray) {
			length++;
		}
		System.out.println(length);
	} 

	public static void main(String[] args) {
		
		FindAStringLength aStringLength= new FindAStringLength();
		aStringLength.method2();
		

	}

}
