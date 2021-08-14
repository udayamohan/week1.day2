package week1.day2;

import java.util.Arrays;

public class MissingElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int [] arr= {0,1,2,3,4,6,7,8};
 //Missing number is 5
 // unsorted
 //step 1
 
 //for loop
  Arrays.sort(arr);
  
  for (int i=0; i < arr.length; i++) {
	  
 if (arr [i]!= i )
 {
	 System.out.println("The Missing number is: " +i);
	 break;
 }
	}
  
	}
}

