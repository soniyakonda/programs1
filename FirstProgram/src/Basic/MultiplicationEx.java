package Basic;

import java.util.Scanner;

public class MultiplicationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
n=sc.nextInt();
for(int i=1; i<=10;i++)
System.out.println( n + "X" +i  +" = " +(n*i));
	}

}
