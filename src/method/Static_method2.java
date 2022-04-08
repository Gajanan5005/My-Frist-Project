package method;

public class Static_method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		exm1();// same class stic callimg to main method
		Static_method2 obj= new Static_method2();//same class non static calling to main method
		obj.exm2();
		Static_method1 k=new Static_method1();// diffrent class to main meythod callling non static
		k.exm();
		
		
		
		
	}
public static void exm1() {
	System.out.println(" static void");
	
	System.out.println("hi gaju");
	
	
}
public void exm2() {
	System.out.println(" non static");
	
	
	
	
}	
	
	
	
	
	
	
}
