package week1.day2;
//import java.util.Arrays;
public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArr1 = { 3, 2, 11, 4, 6, 7 };
		int[] myArr2 = { 1, 2, 8, 4, 9, 7 };
		System.out.println("The Intersection of two arrays are  : ");
		for (int i = 0; i < myArr1.length; i++) {
			for (int j = 0; j < myArr2.length; j++) {
				if (myArr1[i] == myArr2[j]) {
					System.out.println(myArr1[i]);
				}
			}
		}
	}

}
