package umesh;

public class Global_v4 {
 int a=20;//non static global varible
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Global_v4 k=new Global_v4();
		
		k.display();// valu of same class non static
		k.display1();//value of same class non static
		k.exm1();
System.out.println(" valu of a is "+k.a);// valu of non ststic global varible sane class

		Global_v3 k1=new Global_v3();
	System.out.println(" valu of p is "+k1.p);// calling non static global varible anather class
	

	
	
	
	}

public void  display() {

	int b=30;// local variable
	System.out.println(" valu of b is "+b);}
	
	public  void exm1() {
	
		int l=36;
		
		System.out.println("value of l is "+l);
}
 
public void display1() {
	int c=40;// local variable
	int b=50;//local variable
	System.out.println(" value of c is"+c);
	System.out.println(" valu of b is"+b);
}
 
 
}
