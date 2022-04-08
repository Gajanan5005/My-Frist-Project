package umesh;

public class Global_v {
	static int a=40;//static global variable
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Global_v k= new Global_v();// non static  calling  static global varible from same class 
		k.display();
		exm();
	System.out.println("value of a is "+a);	
	System.out.println(" value of a is "+Global_v1.p);//static global variable from anather  class
	System.out.println("");
	}
public void display() {
	int b=30;
	
	System.out.println(" value of b is "+b);
	
}
public static void exm() {
	int d=30;
	System.out.println("value of d "+d);
	
}	
	
	
	
}
