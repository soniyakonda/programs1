package Basic;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		char choice;
		Scanner sc= new Scanner(System.in);
		System.out.println("entet choice  + for add \n - for sub \n * for mul \n / for div;");
		a= sc.nextInt();
		b=sc.nextInt();
		choice=sc.next().charAt(0);
		switch(choice)
		{
		case '+': System.out.println("add: " + (a+b));
		case '-': System.out.println("add: " + (a-b));
		case '*': System.out.println("add: " + (a-b));
		case '/': System.out.println("add: " + (a-b));

		default:  System.out.println("invaild");

			
		}}



	}


