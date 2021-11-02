package javaPrograms;

public class CountTheVowlesinYourName {

	public static void main(String[] args) {

		String input="Ramesh";
		int vowlescount= 0;

		input = input.toLowerCase();
		int length=input.length();

		for(int i=0;i<length;i++) {
			if(input.charAt(i)=='a' || input.charAt(i)=='e' || input.charAt(i)=='i' || input.charAt(i)=='o' ||
					input.charAt(i)=='u') {
				vowlescount++;

			}
		}
		
		System.out.println("Your Name has: " + vowlescount +" " +"Vowles");


	}

}
