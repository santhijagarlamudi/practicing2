package javaoops1;

class bank{
	
	int amount =5;
	int total;
	
void cal() {
	
	total = amount * 10;
	
	System.out.println("the total due is :  "  +total);
	
}}

class icici extends bank {
	
	void cal() {
		
		total = amount*12;
		System.out.println("the total due is :  "  +total);
		
	}
	
}

class hdfc extends bank{
	
	void cal() {
		
		total = amount *15;
		System.out.println("the total due is :  "  +total);
		
	}
}
	
class syndicate extends bank{
	
	void cal() {
		
		total = amount *18;
		System.out.println("the total due is :  "  +total);
		
	}
}


public class overloadding {
	public static void main(String[] args) {
		
		icici obj = new icici();
	
		obj.cal();
		

	}

}
