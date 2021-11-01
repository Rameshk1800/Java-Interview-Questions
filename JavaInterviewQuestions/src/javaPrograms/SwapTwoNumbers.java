package javaPrograms;

public class SwapTwoNumbers {

	public void WithThirdVariable() {

		int mySalary = 20;
		int mySuperiorSalary = 50;

		int temp;

		temp = mySalary;
		mySalary = mySuperiorSalary;
		mySuperiorSalary = temp;

		System.out.println(mySalary);
		System.out.println(mySuperiorSalary);

		System.out.println("my Salary is: " + mySalary + " mySuperiorSalary is : " + mySuperiorSalary);

	}

	// AnotherWay to swap two numbers


	public void withoutThirdvaraible() {
           int ramesh=10;
           int suresh=20;
           
           
           //this is for add and sub      // this is for div and multiplication
           
           ramesh = ramesh-suresh;        // ramesh= ramesh*suresh;
            
           suresh=ramesh+suresh;          //  suresh = ramesh/suresh;
           
           ramesh=suresh-ramesh;          // ramesh= ramesh/suresh;
           
           System.out.println(ramesh);
           System.out.println(suresh);

        

	}


	public static void main(String[] args) {

		SwapTwoNumbers numbers = new SwapTwoNumbers();
		numbers.withoutThirdvaraible();
	}

}
