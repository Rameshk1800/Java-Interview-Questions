package javaPrograms;

public class ArrayNumberPresentOrNot {


	int[] array= {1,2,3,4,5,6};

	int numberToFind = 4;

	boolean found =false;

	public void presentOrNot() {


		for(int number:array) {
			if(number==numberToFind) {
				found=true;
				break;
			}
		}
		
		if(found) {
			System.out.println("Number Present");
		}else {
			System.out.println("Number Not Present");
		}
	}



	public static void main(String[] args) {
		
		ArrayNumberPresentOrNot arrayNumberPresentOrNot = new ArrayNumberPresentOrNot();
		arrayNumberPresentOrNot.presentOrNot();

	}
}
