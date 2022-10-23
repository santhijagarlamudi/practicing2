package javaoops1;

public class Overloading {
	
	int x ;
	int y;
	String z;
	int u;
	
	
	
	void mv(int a, int b,int c) {
		

		int x =a ;
		int y=b;
		int u =c;
		
		u =x+y;

		

		System.out.println("the addition is :  " +u);	
				
		}
	
void mv(String i, int j) {
		

		String z=i;
		int y=j;

		

		System.out.println(z);	
				
		}
		
		
	 

	public static void main(String[] args) {
		
		Overloading obj = new Overloading()	;

obj.mv(19, 1, 0);
obj.mv("i am happy to learing", 0);


		

	}

}
