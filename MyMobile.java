package week1.day2;

//import java.util.StringJoiner;

/*
 * 
 * subject; mobile
 * 
 * properties/variable/attributes (state)
 *instance variable (global)
 * screensize-int
 * cost-int
 * logo-char
 * amps-float
 * mobilenumber-long
 * istouchscreen-boolean
 * brandname-string
 */

/*
 * Actions/Behavior/Method (verb)
 * makeCall()/textMessage()/makeShop()/payments/pic 
 * */
public class MyMobile {

	// TODO Auto-generated method stub
	int screenSize = 12;
	int cost;
	char logo;
	float amps;
	long mobileNumber;
	boolean IsTouchScreen;
	String brandName;

	// method syntax
	// Accessmodifier returntype //methodName(args) {method body}
	// public: accessed by all the classes in a project
	// private: only that class can use it. Cannot be accessed by others
	// protected
	// package: accessed in the package level
	public String makeCalls() {
		String callMsg = "Hello";
		System.out.println("Making calls");
		return callMsg;
	}

	public void takepics()

	{
		System.out.println("Making calls");
	}

	private void payMoney() {
		System.out.println("Make payments");
	}

	/*public void makeSMS();

	//{
	//	System.out.println("String" );
	} */

	public static void main(String[] args) {
		// className object
		MyMobile mobObj = new MyMobile();

		mobObj.takepics();
		mobObj.makeCalls();
		mobObj.payMoney();

		//mobObj.makeSMS(str);
		// ctrl + 2; press L

		// ctrl + 1 - choose the local variable assignment
		int screenSize2 = mobObj.screenSize;
		System.out.println("screenSize:" + screenSize2);
	}

}
