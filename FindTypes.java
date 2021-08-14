package week1.day2;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
         char[] str =  test.toCharArray();
         for(int i=0;i<str.length;i++) {
        	 if (Character.isLetter(str[i]))
	        	 {
        		 letter++;
				}
        	 else if (Character.isDigit(str[i]))
        	 {
    		 num++;
			}
        	 else if (Character.isSpaceChar(str[i]))
        	 {
    		 space++;
			}
        	 else{
    		 specialChar++;
			}
         }
         
         System.out.println("letter: " + letter);
         System.out.println("space: " + space);
         System.out.println("number: " + num);
         System.out.println("specialCharcter: " + specialChar);
        		 }

}
/* Pseudo Code:
a) Convert the String to character array
b) Traverse through each character (using loop)
c) Find if the given character is what type using (if)
		i)  Character.isLetter
		ii) Character.isDigit
		iii)Character.isSpaceChar
		iv) else -> consider as special character
*/

// Print the count here
/*System.out.println("letter: " + letter);
System.out.println("space: " + space);
System.out.println("number: " + num);
System.out.println("specialCharcter: " + specialChar);
*/
