package Basic;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a,b,c;
 char ch;
 do {
 Scanner sc= new Scanner(System.in);
 
 System.out.println(" enter a,b values:");
 a=sc.nextInt();
 b=sc.nextInt();
 c=a+b;
 System.out.println("add: " +c);
 System.out.println(" press y to continue :");
 
 ch=sc.next().charAt(0) ;
 
	}while(ch=='y');
 
}}
