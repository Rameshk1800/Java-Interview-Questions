package javaPrograms;

import java.util.Arrays;
import java.util.HashSet;

public class FindMissingAlphabets {

	public static void main(String[] args) {
		
		String given="Ramesh Kumar";
		given=given.toLowerCase();
		
		given=given.replaceAll(" ", "");
		
		String[] userarray = given.split("");
		String[] alphabet = "abcdefghijklmnopqustuvwxyz".split("");
		
		HashSet<String> set1= new HashSet<String>(Arrays.asList(userarray));
		
		HashSet<String> set2= new HashSet<String>(Arrays.asList(alphabet));
		
		set2.removeAll(set1);
		
		System.out.println(set2);
		

	}

}
