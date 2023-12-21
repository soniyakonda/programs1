package Basic;

import java.util.Scanner;

public class StringPrgm {
	  static int vowels=0;
	static int space=0;
	static int consonents=0;
	
	static void count( String input)
	{
		input=input.toLowerCase();
		for( int i=0;i<input.length();i++)
		{
			if(input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i'  || input.charAt(i) == 'o'|| input.charAt(i) == 'u')
			{
			 vowels++;	
			 System.out.println(vowels);
			}
			else if( input.charAt(i)==' ')
			{
			space++;	
			}
			else {
			consonents++;
			}
		
			System.out.println(space);
			System.out.println(consonents);
		
			}}
	

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
System.out.println("enter a string:");
String inputstream= sc.nextLine();
	}}
