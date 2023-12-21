package Basic;

import java.util.Scanner;

public class Formulae {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   float pi= 3.14f,l,b,h,r,w, a;
   Scanner sc1= new Scanner(System.in);
   
   System.out.println(" enter radius :");
   r = sc1.nextFloat();
   System.out.println(" area of circle is :" + r*r*pi);
   System.out.println("enter   breadth and height,");
  b =sc1.nextFloat();
  h =sc1.nextFloat();
   System.out.println(" area of triangle is : " +( b*h)/2);
   System.out.println("enter lenght and width");
   l =sc1.nextFloat();
   w =sc1.nextFloat();
  System.out.println(" area of rectangle is : " + (l+w));
   
   
     
     
     
     
	}
}
