package javaoops1;

class test1 {
	
	int a=10;
	int b=20;
	
	void method() {
		
		System.out.println(a+b);
	}}
	class test2 extends test1{
		
		int c=30;
		int d=40;
		
		void method1() {
			
			System.out.println(c*d);
		}}
		

public class sunday {

	public static void main(String[] args) {
		
test2 obj1 = new test2();

obj1.c =10;
obj1.d =10;
obj1.method1();
obj1.a =25;
obj1.b =10;
obj1.method();


	}

}
