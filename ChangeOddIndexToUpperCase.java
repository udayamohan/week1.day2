package week1.day2;
//import java.util.Arrays;


public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) 
	{

		// TODO Auto-generated method stub
   String str = "changename";
  char[] characters = str.toCharArray();
   System.out.println("Changed odd index to upper case:");
   for (int i=0; i < characters.length;  i++)
   {
	   char c = characters[i];
      if (i % 2 != 0)
      {
    	  c = Character.toUpperCase(c);
	}
      System.out.print(c);
   }
   
	}

	}



/*

Pseudo Code**
Declare String
Input as Follow**
String test = "changeme";**a)
Convert the
String to
character array**b)
Traverse through

each character (using loop)
 * 
 * c)find the odd index within the loop (use mod operator)
 * 
 * d)within the loop, change the character to uppercase, if the index is odd
 * else don't change
 * 
 */
