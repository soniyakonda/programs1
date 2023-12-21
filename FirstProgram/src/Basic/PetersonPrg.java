package Basic;

import java.util.Scanner;

public class PetersonPrg {

			public static void main(String[] args) {
				
		int fact=1,index,temp,sum=0,rem=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find the factorial:");
	int num=sc.nextInt();
		temp=num;
		while(num>0){
		 rem=num%10;
		 fact=1;
		for(index=1;index<=rem;index++)
		{
			fact=fact*index;
			}
		
		sum=sum+fact;
		fact=1;
		num=num/10;
		}
		if(temp==sum)
			System.out.println("the num is peterson number" );
		else
			System.out.println("the num is  not an peterson number" );

			}
			}
	
