package Basic;

import java.util.Scanner;

public class NoOfCalls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int noofcalls,amount;
Scanner sc=new Scanner(System.in);
System.out.println("enter calls");
noofcalls=sc.nextInt();
if(noofcalls<=200)
{
	amount=noofcalls*1;
	System.out.println("amount is:" +amount);
	
}
else {
	
	amount=noofcalls*3;
	System.out.println("amount is:" +amount);
	
	}

}}
