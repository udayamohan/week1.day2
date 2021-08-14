package week1.day2;

import java.util.Arrays;

public class FindSecondLargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {77,22,55,89,89,43};
		Arrays.sort(arr1);
		System.out.println("The Second Largest element of Array is "+ arr1[arr1.length-2]) ;
		
		
	}
}
