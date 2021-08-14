package week1.day2;

//import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "malayalam";
		//System.out.println(s.length());
		String rev = "";
		for (int i = s.length()-1; i >= 0; i--) {
			rev = rev + s.charAt(i);

		}
		if (s.equalsIgnoreCase(rev)) {
			System.out.println("Is String is Palindrome ");
		}
		else
			System.out.println("The string is not Palindrome ");
	}
}
