package week1.day2;

public class LearnString {

	public static void main(String[] args) {
		// Initialize a string
		// 2 ways:
		// --literals
		// --new keyword

		String str = "Welcome";

		// object is created in the name of str

		// string length
		int lengthStr = str.length();
		System.out.println("length of the string" + lengthStr);
		// Find a character in a string : in the 4th position
		char charStr = str.charAt(4);
		System.out.println("Character" + charStr);
//Get the position of a character in the string

//give the first occurrence of that char
		int indexOfChr = str.indexOf('T');
		System.out.println("indexOfChar:" + indexOfChr);
		// last occurrence
		int lastIndexOf = str.lastIndexOf('T');
		System.out.println("lastIndexOf:" + lastIndexOf);
	

		char[] charArrays = str.toCharArray();
		for (int i = 0; i < charArrays.length; i++) {
			String[] splitStr;
			System.out.println("charArray[+i+]:" + charArrays);
		}
//String splitStr;
		 //String str = "Welcome To Testleaf";
		String[] splitStr = str.split("e");
		{
			for (int i = 0; i < splitStr.length; i++) {
				System.out.println("Split String in" + splitStr);
			}
		}
	}
}
