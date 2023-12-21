package Basic;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float p,t, r ,si;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter p ,t,r values");
		p = sc.nextFloat();
		t = sc.nextFloat();
		r = sc.nextFloat();
		si =p*t*r/100;
		System.out.println("simple interest is : " + si);

	}

}
