package Basic;

import java.util.Scanner;

public class TaxSalary2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float salary,tax;
		Scanner sc1 =new Scanner(System.in);
		System.out.println("enter salary value");
		salary = sc1.nextFloat();
		tax = salary*0.12f;
		System.out.println("tax value is " +tax );
		

	}

}
