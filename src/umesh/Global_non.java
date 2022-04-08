package umesh;

public class Global_non {
	int a=20;// non static global variable
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Global_non k= new Global_non();
		k.display();
		k.display1();
		
	System.out.println("value of a is "+k.a);	//calling non ststaic global varible from same class
		
	}
	public void display() {
		int j=30;// local variable
		 System.out.println(" valu of j "+j);
	
	}
	public  void display1() {
		
		int c=40;//local variable
		int b=50;
		System.out.println("value of c "+c);
		System.out.println(" value of b "+b);
		
	}
	
	
	
	

}
