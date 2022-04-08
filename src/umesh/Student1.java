package umesh;

public class Student1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Student1 k=new Student1();
	k.std_inf(" Dipak Warade", 63, 'A', 99.99);
	
	k.student_info("Umesh Patil", 62, 'A', 99.55);
	
	
	
	
	
	
	
	}

public  void student_info(String Name,int RollNo,char grade,double percentage) {
	
	System.out.println("Name of student "+Name);
	System.out.println("Roll No of student "+RollNo);
   System.out.println("grade of student "+grade);
	System.out.println("percentage of student "+percentage);
	
	
}	
public static void std_inf(String Name,int RollNo, char grade,double percentage) {
	
	System.out.println("student name "+Name);
	
	System.out.println("Rollno of stiudent "+RollNo);
	
	
	System.out.println("grade of student "+grade);
	System.out.println("percentage of student "+percentage);
}
	
	
	
	
	
	
	
	
	
	
}
