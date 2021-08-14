package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops";
		String text2 = "potss";
		char[] str1 = text1.toCharArray();
		char[] str2 = text2.toCharArray();
		boolean flag=true;
		int t1 = text1.length();
		int t2 = text2.length();
		if (t1 == t2) {
			System.out.println("The length of both the strings are same");
			Arrays.sort(str1);
			Arrays.sort(str2);
			for(int i=0;i<str1.length;i++) {
				if(str1[i]!=str2[i]) {
					flag = false;
					break;
				}
				
			}
			if(flag)
			System.out.println("Both arrays has same value");
			else
				System.out.println("Both arrays has different value");
				
		}
	
			

	}

}
/*
* Pseudo Code
* 
* Declare a String String text1 = "stops";
*  Declare another String String text2 = "potss";
*  a) Check length of the strings are same then (Use A Condition)
*  b)Convert both Strings in to characters 
*  c) Sort Both the arrays 
*  d) Check both the arrays has same value
* 
*/