package JavaProgrmming;

public class leafyear {

	public static void main(String[] args) {

int year = 1987;

if (year%4==0 && year%100 !=0 ||year%400 ==0 )
{
	System.out.println(" this is the LEAF YEAR bcz it contains 366 days :  "  +year);
}

else
{
	System.out.println("GENERAL YEAR :  "  +year);
}

	}

}
