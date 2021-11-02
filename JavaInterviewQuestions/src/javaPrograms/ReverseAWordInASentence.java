package javaPrograms;

public class ReverseAWordInASentence {

	public static void main(String[] args) {
		 String givenarray ="My Name ramesh";
		 
		 String reversed=" ";
		 String[]  temp=  givenarray.split(" ");

		 System.out.println(temp.length);
		 
		 for(int i=temp.length-1;i>=0;i--) {
			 
			 reversed = reversed+temp[i]+" ";
			 
			  }
		 
		 System.out.println(reversed);
	}

	
}
