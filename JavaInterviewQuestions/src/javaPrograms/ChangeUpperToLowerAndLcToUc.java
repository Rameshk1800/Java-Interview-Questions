package javaPrograms;

public class ChangeUpperToLowerAndLcToUc {
	
	
	public void UpperCaseToLowerCase() {
		
		String input="HI, MY NAME IS RAMESH";
		
		char[] givenArray = input.toCharArray();
		for(int i=0;i<input.length();i++) {
			if(givenArray[i]>=65 && givenArray[i]<=90) {
				givenArray[i]=(char) (givenArray[i]+32);
			}
			
		}
		for(int i=0;i <givenArray.length;i++) {
		
		System.out.print(givenArray[i]);		
		}
	}
	
	
	
public void LowerCaseToUpperCase() {
		
		String input1="hi, my name is ramesh";
		
		char[] givenArray1 = input1.toCharArray();
		for(int i=0;i<input1.length();i++) {
			if(givenArray1[i]>=97 && givenArray1[i]<=122) {
				givenArray1[i]=(char) (givenArray1[i]-32);
			}
			
		}
		for(int i=0;i <givenArray1.length;i++) {
		
		System.out.print(givenArray1[i]);		
		}
	}

	
	
	

	public static void main(String[] args) {
		
		ChangeUpperToLowerAndLcToUc andLcToUc = new ChangeUpperToLowerAndLcToUc();
		andLcToUc.UpperCaseToLowerCase();
		andLcToUc.LowerCaseToUpperCase();
	}

}
