package Basic;

import java.util.Scanner;

public class GreatestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,c;
Scanner sc= new Scanner(System.in);
System.out.println(" enter a,b,c values:");

a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a>b ||a>c)
{
System.out.println("a value is biggest");
}
else if(b>c||b>a)
{
	System.out.println("b value is biggest");
}
else
{ 
	System.out.println("c value is biggest");
}
	}

}
