package method;

public class Static_method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Static_method.demo();	//static method to main method call from different class
		
		Static_method1 obj= new Static_method1(); //calling from non static method to main method same class
		obj.exm();
		
		
	}

public void exm() {
	System.out.println(" hii calling");
	
	
	
	
	
}	
	
	
	
	
	
}
