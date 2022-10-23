package javaoops1;

public class basics2 {

	int empno;
	String empname;
	int depid;
	int salary;
	// passing values to class variable by using constructor
	
	/*basics2(int no, String name, int id, int sal)
	{
	empno = no ;
	empname = name;
	depid = id;
	salary = sal;
	}*/
	
	//passing values by using method
	
void setdata(int no, String name, int id, int sal)
{
	empno = no ;
	empname = name;
	depid = id;
	salary = sal;
	
}
	
	
	
	
	void display()
	{
		System.out.println("emp id : " +empno);
		System.out.println("emp name : " +empname);
		System.out.println("emp dept : " +depid);
		System.out.println("emp salary : " +salary);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*basics2 cons = new basics2(25, "roja", 001, 26000); --passing values by using constructor
	cons.display();
	basics2 cons2 = new basics2(50, "janu", 002, 30000);
	cons2.display();
	basics2 cons3 = new basics2(60, "marry", 003, 40000);
	cons3.display();
	basics2 cons4 = new basics2(70, "SUccess !!", 100, 200000);
	cons3.display();*/
		 
		// passing values with the help of methods
		
		basics2 obj1 = new basics2();
		obj1.setdata(1, "ram", 01, 50000);
		obj1.display();
		basics2 obj2 = new basics2();
		obj2.setdata(10, "krish", 02, 60000);
		obj2.display();
		
		basics2 obj3 = new basics2();
		obj3.setdata(20, "jesues", 05, 100000);
		obj3.display();
		
		
		
		
	}
	}


