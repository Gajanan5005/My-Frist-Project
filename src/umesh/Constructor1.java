package umesh;

public class Constructor1 {
 int a;
 int b;	
 int c;
 int d;
	
public Constructor1 (){
	
a=90;	
b=10;	
c=30;	
d=a*b*c;	
}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Constructor1 obj=new Constructor1();
		obj.demo();
		
	}
public  void demo() {
	
System.out.println("valu of d is "+d);
	
 
}
	
}

