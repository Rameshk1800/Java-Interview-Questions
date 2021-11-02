package javaPrograms;

import java.util.Scanner;

public class FindACharPosition {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter your character");
		
		char givenChar= scanner.next().charAt(0);
		
		 givenChar= Character.toLowerCase(givenChar);
		 
		 int asciiValue=(int)givenChar;
		 
		 int position=asciiValue-96;
		 
		 System.out.println(position);
		 

	}

}
