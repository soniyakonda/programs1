package Basic;

import java.util.Scanner;

public class Arithematic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a,b;
 Scanner sc1 = new Scanner(System.in);
 System.out.println("enter values is a,b");
 a=sc1.nextInt();
 b=sc1.nextInt();

 System.out.println("addition of  " +a + "and" +b+  "is :" +a+b);
 
 System.out.println("subtraction of  " +a+  "and" +b+  "is :" +(a-b));
 System.out.println("multiplication of   " +a+ "and" +b+ "is :" +(a*b));
 System.out.println("division of  " +a+  "and" +b+ "is :" +(a/b));
 System.out.println("modulus of  " +a+  " and" +b+ "is : " +(a%b));



	}

}
