package Basic;

import java.util.Scanner;

public class PalindromeEx1 {

	public static void main(String[] args)
	{
		 {
//			
			int n, cube=0,rem=0;
			int temp=0;
   Scanner sc=new Scanner(System.in);
			System.out.println("enter a num");
			n=sc.nextInt();
			
			while(n>0) {
				rem=n%10;
				cube= cube+(rem*rem*rem);
			
				n=n/10;
			}
			if(temp==n) {
			
				System.out.println("Amstrong");
		}
		   else
			System.out.println("not Amstrong");

			}}}
		
////			
			int n=0, rev=0,rem=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter num:");
			n=sc.nextInt();
			int temp=n;
			while(n>0) {
				rem=n%10;
				rev=rem+(rev*10);
			
				n=n/10;
			}
			if(temp==rev) {
			
				System.out.println("palindram");
		}
		   else
			System.out.println("not palindram");
//		 }}}	

//		}
//
//		}
//// TODO Auto-generated method stub

	
