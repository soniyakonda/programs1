package Basic;

import java.util.Scanner;

public class SwitchNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 char choice;
 Scanner sc = new Scanner(System.in);
 System.out.println("enter vowels or consonents:");
 choice=sc.next().charAt(0);
 switch(choice)
 {

 case 'a':
 case 'e':
 case 'i':
 case 'o':
 case 'u':
	 System.out.println("vowel " +choice);
	 break;
	 default:System.out.println("consonents" + choice);
	 
 }
	}

}
