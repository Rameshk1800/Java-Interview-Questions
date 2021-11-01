package javaPrograms;

public class ReverseAString {
	

	
	public void withBuffer() {
		
		String name="Selenium";
		  
		  StringBuffer buffer = new StringBuffer(); 
		  
		  buffer.append(name);
		  
		  buffer.reverse();
		  
		  System.out.println(buffer);
		
	}	
		
		  
	public void withoutbuffer() {	 
		
		String name="Ram";
		
		char[] names=	name.toCharArray();
		
		String reversed="";
		
	for(int i = names.length-1;i>=0;i--) {
		
		reversed=reversed+names[i];
		
	}

	System.out.println(reversed);
	
	}
		
	public static void main(String[] args) {
		
		
		ReverseAString name = new ReverseAString();
		name.withBuffer();
		name.withoutbuffer();
		
		
		//using StringBuffer:
		
		/*
		 * String given= "Ramesh";
		 * 
		 * StringBuffer buffer=new StringBuffer(); buffer.append(given);
		 * System.out.println(buffer.reverse());
		 */
		
		

		//own Logic:
		
		/*
		 * String given="Ramesh";
		 * 
		 * char[] array= given.toCharArray(); String reversed = "";
		 * 
		 * for(int i = array.length-1;i>=0;i--) {
		 * 
		 * reversed=reversed+array[i];
		 * 
		 * }
		 * 
		 * System.out.println(reversed);
		 */
	}
		
	}
		

