package week1.day2;

public class Calculator {
  
	public void add (int p, int q, int r)
		{
	     int sm = p + q + r;
		System.out.println("Sum of the numbers is " +sm );
	}
	
	public void sub (int x, int y)
	{ 
		int sb = x - y;
		System.out.println("Subtration of the number is " +sb );
	}
	
	public void mul (int i , int j) {
		int ml=  i * j;
		System.out.println("Multiplicaiton of the number are " +ml);
				
	}
	
	public void div (double v, double w)
	{
		double di = v % w;
		System.out.println("Division of the number " + di);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Calculator cal = new Calculator ();
   cal.add(10,20,30);
   cal.sub(9,4);
   cal.mul(50, 66);
   cal.div(10.30, 2.50);
   
		   
	}

}
