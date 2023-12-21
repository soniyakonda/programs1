package Basic;

import java.util.Scanner;

public class FactorialEx {

	public static void main(String[] args) {
		int i,fact=1,temp=0,sum=0 , num=0;
	Scanner sc=new Scanner(System.in);
	System.out.println(" entet a numb:");
	int n=sc.nextInt();
		
for( i=1;i<=5;i++)
{ 
	 int rem=num%10;
	fact=fact*i;
	
	sum= +fact;
	 num=num%10;
} 

if(temp==sum) {
	System.out.println(" the peterson numb");
} else {
	System.out.println(" the peterson numb");

}
	}

}
