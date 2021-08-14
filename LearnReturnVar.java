package week1.day2;

public class LearnReturnVar {

	
	public int add()
	{
	int x=10, y=34;
	int z= x+y;
	return z;
	}
	
	public void sub(int x, int y)
	{
	int c=x-y;
	System.out.println("Subtracted value" +c );
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnReturnVar obj = new LearnReturnVar();
		int result= obj.add();
		System.out.println("the addition value is" +result);
   obj.sub(50,10);
	
	}

}
