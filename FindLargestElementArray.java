package week1.day2;

import java.util.Arrays;
//import java.util.Collections;

public class FindLargestElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arrNum = {34,203,5,78,100,1000,1};
		
		//step 1: sort the array
		//step 2: print the last element of the array
		Arrays.sort(arrNum);
		System.out.println("The largest number in the array is"  +arrNum[arrNum.length-1]);
		
		//second largest
		System.out.println("Tthe second largest number in the array is"  +arrNum[arrNum.length-2]);
		
		// second smallest element
		//Collections.reverse(arrNum);
		//System.out.println("Print the second smallest number of an array" +arrNum[arrNum.length-1]);
		
	}
	

	
}
