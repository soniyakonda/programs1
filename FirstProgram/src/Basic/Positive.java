 package Basic;

import java.util.Scanner;

public class Positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
Scanner sc=new Scanner(System.in);
System.out.println("enter n values:");
n=sc.nextInt();

if(n>=0)
{
System.out.println("positive");
}
else {
	System.out.println("negative");
}
}
}