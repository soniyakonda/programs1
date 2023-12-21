package Basic;

import java.util.Scanner;

public class SalaryPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float salary,tax;
Scanner sc=new Scanner(System.in);
System.out.print("enter salary:");
salary=sc.nextFloat();


if(salary<=25000) {
	tax=salary*0.1f;

	
	System.out.println("salary is:" +tax);
}
else
{
	tax=salary*0.15f;
	System.out.println("salary is:"+tax);
	}


}
}