package variable_study;

public class HR_portal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Emloyee Rahul=new Emloyee(); //creting non static global varriable "emloyee" using object
		Rahul.empid=12;// intialising non static global variable emi id
		Rahul.sal=1000;//---------\\----------sal usig object
		Rahul.RM="sachin";// -----\\-------"RM" using obj
		
		Emloyee Ganesh=new Emloyee();
		Ganesh.empid=13;
		Ganesh.sal=2000;
		Ganesh.RM="Suwarna";
        
		Emloyee Anjali=new Emloyee();
		Anjali.empid=14;
		Anjali.sal=3000;
		Anjali.RM="Dipak";
				
		Rahul.EmpInfo();
		Ganesh.EmpInfo();
		Anjali.EmpInfo();
		
		
		
	}

}
