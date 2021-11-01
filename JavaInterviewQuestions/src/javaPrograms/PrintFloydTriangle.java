package javaPrograms;

import java.util.Scanner;

public class PrintFloydTriangle {
	
	public void UserInput() {
		
		Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter the lines");
		 
     	int numberOfLines =	scanner.nextInt();
     	
     	int row,column=0;
     	
     	for(row=0;row<numberOfLines;row++) {
     		for(column=0;column<=row;column++) {
     			System.out.print(numberOfLines );
     		}
     		System.out.println();
     	}
	}

	public void WeGivingInput() {
		
		for(int row= 1; row<=5; row++) {
			for(int column=1;column<=row;column++) {
				System.out.print(column);
			}
			System.out.println("");
		}
		
	}
	
	public void NextTriangle() {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter the number");
		
		int startingnumber=1;
		int limit=scanner.nextInt();
		
		int row,column;
		
		for(row=0;row<limit;row++){
			for(column=0;column<=row;column++) {
				System.out.print(startingnumber + " ");
				startingnumber=startingnumber+1;
			}
			System.out.println();
		}
			
		
	}
	
	
	public static void main(String[] args) {
		PrintFloydTriangle floydTriangle = new PrintFloydTriangle();
		floydTriangle.NextTriangle();
		

	}

}
