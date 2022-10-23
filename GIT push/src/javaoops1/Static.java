package javaoops1;

public class Static {
	
	int a;   // non Static varable
	static int b;   // static varaible
	int c;
	
	void m1() {     // non-static method
		
		c= a+b;
		
		System.out.println("this is addion :  " +c);
	}
	
	static void m2() {   // Static method
		Static obj2 = new Static();
		obj2.a = 10;
		Static obj3 = new Static();
		obj3 .c = obj2.a *b;
		
		
		
		System.out.println("this is the static variable value : " +obj3 .c);
		
		
	}
	
	public static void main(String[] args) {
		
		b =10;
		
		Static obj = new Static();
		obj.a =30;
		m2();
		obj.m1();
		
		System.out.println("I am very happy bcz learing JAVA");

	}

}
