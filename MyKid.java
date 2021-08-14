package week1.day2;

public class MyKid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  MyMobile kidObj= new MyMobile ();
  
  float amps = kidObj.amps;
  System.out.println("Amp value is" + amps);
  kidObj.makeCalls();
  kidObj.takepics();
  //kidObj.payMoney (); //cannot be accessed because of private method access modifier
  
	}

}
