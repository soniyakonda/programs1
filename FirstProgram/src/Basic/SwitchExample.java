package Basic;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 float circle, triangle,rectangle ,l,b,w,h,r,pi=3.14f;
 String choice;
 Scanner sc = new Scanner(System.in);
 System.out.println(" enter your choice:" );
		 choice=sc.nextLine();
		 switch(choice)
		 {
		 case "circle" : System.out.println(" enter radius:" );
		 r=sc.nextFloat();
		 System.out.println(" area of circle :" + r*r*pi);
		 break;
		 
		 case "triangle" : System.out.println(" enter h and b :" );
		 b=sc.nextFloat();
		h= sc.nextFloat();
		 System.out.println(" area of triangle :" + h*b/2);
		 break;
		 case "rectangle" : System.out.println(" enter l and w:" );
		 l=sc.nextFloat();
		w= sc.nextFloat();
		 System.out.println(" area of triangle :" + l*w);
		 break;
		 default: System.out.println(" invalid choice");
		 break;
		 
		 }
 
 }

}
