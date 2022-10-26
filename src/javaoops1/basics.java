package javaoops1;

public class basics {
	
	int a;
	int b;
	int c;
	
	
	
	public basics() {
		// TODO Auto-generated constructor stub
	}

	void add()
	{
		c = a+b;
	}
	
void multiply()
{
c=a*b;

}
	void display()
	{
	System.out.println("display the value of a :" +a);
	System.out.println("display the value of b : " +b);
	System.out.println("the total value is : " +c);

	}
	// passing values to class variable through objects

	public static void main(String[] args) {
		
basics obj1 = new basics();  
obj1.a=100;
obj1.b=200;
obj1.add();
obj1.display();
obj1.multiply();
obj1.display();

	System.out.println("this is my git practice1");	
	System.out.println("this is my git practice2");	
	System.out.println("this is my git practice3");	
				
			
				
				


	}

}
