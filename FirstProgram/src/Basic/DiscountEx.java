package Basic;

import java.util.Scanner;

public class DiscountEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

float discount,amount;
Scanner sc=new Scanner(System.in);
System.out.print("enter amount:");
amount=sc.nextFloat();


if(amount>=10000) {
	discount=amount*0.1f;

	
	System.out.println("discount is:" +discount);
}
else
{
	discount=amount*0.02f;
	System.out.println("discount is:"+ discount);
	}


}
}